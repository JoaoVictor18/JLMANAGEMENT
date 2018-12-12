
package Servlets;

import Commons.Configuracao;
import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import controller.PessoaController;
import controller.ProdutoController;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Endereco;
import model.Pessoa;


@WebServlet(name = "PessoaServlet", urlPatterns = {"/PessoaServlet"})
public class PessoaServlet extends HttpServlet {

    private static Pessoa userLogado;
    
    public static void cadastraPessoa(HttpServletRequest request, PrintWriter out){
        String nome = request.getParameter("nome");
        String admin = request.getParameter("admin");
        String dataNasc = request.getParameter("dataNasc");
        String cpf = request.getParameter("cpf");
        String rg = request.getParameter("rg");
        String pis = request.getParameter("pis");
        String telefone = request.getParameter("telefone");
        String rua = request.getParameter("rua");
        String numero = request.getParameter("numero");
        String bairro = request.getParameter("bairro");
        String complemento = request.getParameter("complemento");
        String referencia = request.getParameter("referencia");
        String cep = request.getParameter("cep");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String pergSeg = request.getParameter("pergSeg");
        String respSeg = request.getParameter("respSeg");
        String sexo = request.getParameter("sexo");
        if(nome == null || admin == null || dataNasc == null || cpf == null || rg == null || pis == null || telefone == null || rua == null || numero == null ||
                bairro == null || complemento == null || referencia == null || cep == null || cidade == null || estado == null || email == null || senha == null || 
                pergSeg == null || respSeg == null || sexo == null){
            Resposta resultado = new Resposta(301, "Erro no preenchimento de dados!!");
            out.print(resultado.toJSON());
        }else{
            int num = Integer.parseInt(numero);
            //transformar string em date
            String []data = dataNasc.split("/");
            int dia = Integer.parseInt(data[0]);
            int mes = Integer.parseInt(data[1]);
            int ano = Integer.parseInt(data[2]);
            Calendar novoCalendar = Calendar.getInstance();
            novoCalendar.set(Calendar.DAY_OF_MONTH, dia);
            novoCalendar.set(Calendar.MONTH, mes);
            novoCalendar.set(Calendar.YEAR, ano);
            Date dataNascimento = novoCalendar.getTime();
            Endereco novoEndereco = new Endereco(rua, bairro, estado, cidade, cep, complemento, referencia, num);
            Pessoa novaPessoa = new Pessoa(nome, cpf, rg, pis, email, telefone, dataNascimento, novoEndereco, senha, cep, pergSeg);
            boolean resposta = PessoaController.criaPessoa(novaPessoa); 
            if(resposta == true){
                Resposta resultado = new Resposta(200, "Usuário criado com sucesso!!");
                out.print(resultado.toJSON());
            }else{
                Resposta resultado = new Resposta(400, "Usuário já cadastrado!!");
                out.print(resultado.toJSON());
            }
        }
    }
    public static void login(HttpServletRequest request, PrintWriter out){
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        if(email == null || senha == null){
            Resposta resultado = new Resposta(301, "Os parâmetros devem ser preenchidos corretamente!!");
            out.print(resultado.toJSON());
        }else{
            userLogado = PessoaController.verificaUsuario(email, senha);
        }
    }
    
    public static void alteraSenha(HttpServletRequest request, PrintWriter out){
        String novaSenha = request.getParameter("novaSenha");
        boolean retorno = PessoaController.insereNovaSenha(userLogado, novaSenha);
        if(retorno == true){
            Resposta resultado = new Resposta(200, "Senha alterada com sucesso!!");
            out.print(resultado.toJSON());
        }else{
            Resposta resultado = new Resposta(301, "A sua senha não pode ser alterada, tente novamente!!");
            out.print(resultado.toJSON());
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Configuracao.configResponseRequest(request, response);
        try (PrintWriter out = response.getWriter()) {
            String servico = request.getParameter("serv");
            switch(servico){
                case "cadastra":{
                    cadastraPessoa(request, out);
                }break;
                case "alteraSenha":{
                    alteraSenha(request, out);
                }break;
                case "login":{
                    login(request, out);
                }break;
                default:{
                    Resposta resultado = new Resposta(404, "O serviço requisitado não existe.(cadastra, buscaMercadoria)");
                    out.print(resultado.toJSON());
                }
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
