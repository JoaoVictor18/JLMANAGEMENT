/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/usuario"})
public class UsuarioServlet extends HttpServlet {

    public void cadastro(HttpServletRequest request, PrintWriter out){
       
        String email = request.getParameter("email");
        String nome = request.getParameter("nome");
        String idade_ = request.getParameter("idade");
        String senha  = request.getParameter("senha");
         int idade = 0;
        if(email == null || nome == null || senha == null || idade_ == null){
            out.println("Os parâmetros (email, nome, senha, idade) não podem ser nulos");
        }else{
            try{
                idade = Integer.parseInt(idade_);
                
               int retorno = Usuario_Controler.cadastro(email,nome,senha,idade);
               out.print(retorno);
            }catch(NumberFormatException ex){
               out.println("O parâmetros idade deve ser um número inteiro"); 
            }
        }
    }
    
    public void login(HttpServletRequest request,PrintWriter out ){
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        
       int retorno =  Usuario_Controler.login(email, senha);
       
       Resposta respUser = null;
       if(retorno == 200){
            String token = ManagerToken.geraToken(email);
            respUser = new Resposta(retorno, token);
       }else{
            respUser = new Resposta(retorno, null);
       }
        //etapa de envio do arquivo JSON
        ObjectMapper tradutor = new ObjectMapper();
        String temp;
        try {
            temp = tradutor.writeValueAsString(respUser);
            out.print(temp);
        } catch (JsonProcessingException ex) {
            //erro ao realizar o parser do Objeto para o formato JSON
            out.print(500);
        }
    }
    
    public void atualizaSenha(HttpServletRequest request,PrintWriter out){
        String token = request.getParameter("token");
        String novaSenha = request.getParameter("senha");
        
        if(token == null || novaSenha == null){
            out.println("Os parâmetros (token e senha) não podem ser nulos");
        }else{
            Usuario_Controler.alteraSenha(token, novaSenha);
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
       
        
        try (PrintWriter out = response.getWriter()) {
            String servico = request.getParameter("serv");
            
            if(servico == null){
                out.println("O parâmetro serv não foi especificado(login, cadastro)");
            }else{
                 switch(servico){
                    case "cadastro":{
                        cadastro(request, out);

                    }break;
                    case "login":{
                        login(request, out);
                    }break;
                    case "atualiza":{
                        atualizaSenha(request, out);
                    }break;
            
                    default:{
                        out.println("O serviço não existe! (login, cadastro)");
                    }
                }
            }
            
            
            
            
            
            
            
            
            /*String email = request.getParameter("email");
            String cidade = request.getParameter("cidade");
            String senha = request.getParameter("senha");
            
            String certo = "errado";
            if(email.contains("@")){
                certo = "correto";
            }
            out.println("Você enviou o email: "+email);
            out.println("Você mora em: "+cidade);
            out.println("E a sua senha é: "+senha);*/
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
