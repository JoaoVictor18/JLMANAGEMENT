/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

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
import model.Produto;


@WebServlet(name = "MercadoriaServlet", urlPatterns = {"/MercadoriaServlet"})
public class MercadoriaServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String servico = request.getParameter("serv");
            
            switch(servico){
                case "cadastra":{
                    cadastraMerc(request, out);
                }break;
                case "buscaMercadoria":{
                    //chamar metodo busca
                    buscaMerc(request, out);
                }break;
                default:{
                    out.print("O serviço requisitado não existe.(cadastra, buscaMercadoria)");
                }
            }
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
    }

    private void cadastraMerc(HttpServletRequest request, PrintWriter out) {
        String nome = request.getParameter("nome");
        String tipoMerc = request.getParameter("tipo");
        String fabricante = request.getParameter("fabricante");
        String precoCus = request.getParameter("precocusto");
        String perImposto = request.getParameter("imposto");
        String perFrete = request.getParameter("frete");
        //verificar sobre a data, como ela chegará no request
        String dataCompra = request.getParameter("data");
        String quantCompra = request.getParameter("quantcompra");
        String infAdd = request.getParameter("infadd");
        String qntEstoque = request.getParameter("qntestoque");
        String qntMinima = request.getParameter("qntminima");
        String referenia = request.getParameter("referencia");
        
        if(nome == null || tipoMerc == null || fabricante == null || precoCus == null 
              || perImposto == null || perFrete == null || dataCompra == null ||
                quantCompra == null || infAdd == null || qntEstoque == null ||
                qntMinima == null || referenia == null){
            out.print("Os parâmetros (nome, tipoMerc, fabricante, precoCus,perImposto,"
                    + "perFrete,dataCompra,infAdd,qntEstoque,qntMinima,referencia");
        }else{
            try{
                double precoCusto = Double.parseDouble(precoCus);
                double perImp = Double.parseDouble(perImposto);
                double percentFrete = Double.parseDouble(perFrete);
                double qntCompra = Double.parseDouble(quantCompra);
                double quantEstoque = Double.parseDouble(qntEstoque);
                double quantMinima = Double.parseDouble(qntMinima);
                String []data = dataCompra.split("/");
                int dia = Integer.parseInt(data[0]);
                int mes = Integer.parseInt(data[1]);
                int ano = Integer.parseInt(data[2]);
                Calendar novoCalendar = Calendar.getInstance();
                    novoCalendar.set(Calendar.DAY_OF_MONTH, dia);
                    novoCalendar.set(Calendar.MONTH, mes);
                    novoCalendar.set(Calendar.YEAR, ano);
                    Date dateCompra = novoCalendar.getTime();
                    
                Produto novoProduto = new Produto(nome, tipoMerc, precoCus, infAdd, percentFrete, percentFrete, 
                        quantEstoque, quantMinima, precoCusto, 
                        qntCompra, dateCompra, referenia);
                //criar método cadastra no controller
                //ProdutoController.cadastraProdudo(novoProduto);
                boolean verificaRetorno = ProdutoController.buscaProdutoExistente(novoProduto);
                if(verificaRetorno != false){
                    out.print("Cadastro efetuado com sucesso.");
                    //mensagem "deseja efetuar um novo cadastro?"
                }else{
                    out.print("Produto já cadastrado. Erro ao cadastrar!");
                    //limpar os campos, verificar como é feito
                }
            }catch(NumberFormatException ex){
                out.print("Os parâmetros (precoCusto, perImp,percentFrete,qntCompra"
                        + "quantEstoque,qntMinima) não são números.");
            }
        }    
    }

    private void buscaMerc(HttpServletRequest request, PrintWriter out) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
