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
import java.util.Vector;
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
                case "atualiza":{
                    //chamar metodo busca
                    atualizaMerc(request, out);
                }break;
                case "consulta":{
                    consultaMerc(request, out);
                }
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
                    out.print("Produto já cadastrado. Deseja atualizar a mercadoria?");
                    //limpar os campos, verificar como é feito
                }
            }catch(NumberFormatException ex){
                out.print("Os parâmetros (precoCusto, perImp,percentFrete,qntCompra"
                        + "quantEstoque,qntMinima) não são números.");
            }
        }    
    }

    private void atualizaMerc(HttpServletRequest request, PrintWriter out) {
        Produto novoProd = new Produto();
        String nome = request.getParameter("nome");
        String quantidadeC = request.getParameter("quantcompra");
        String dataC = request.getParameter("datacompra");
        String quantidadeV = request.getParameter("quantVendida");
        String mesV = request.getParameter("mesvenda");
        String anoV = request.getParameter("anovenda");
        String valorV = request.getParameter("valorvenda");
        Vector<Produto> mercadorias = new Vector<>();
        String nomeSelecao = "";
        if(nome == null){
            out.print("O parâmetro (nome) não pode ser nulo.");
        }else{
            try{
            mercadorias = ProdutoController.buscaProduto(nome);
            //compra = true fazer if
                if(quantidadeC == null || dataC == null){
                    out.print("Os parâmetros (nome, quantidadeC, dataC) não podem ser nulos.");
                }else{
                    double quantCompra = Double.parseDouble(quantidadeC);
                    String []data = dataC.split("/");
                    int dia = Integer.parseInt(data[0]);
                    int mes = Integer.parseInt(data[1]);
                    int ano = Integer.parseInt(data[2]);
                    Calendar novoCalendar = Calendar.getInstance();
                        novoCalendar.set(Calendar.DAY_OF_MONTH, dia);
                        novoCalendar.set(Calendar.MONTH, mes);
                        novoCalendar.set(Calendar.YEAR, ano);
                        Date dateCompra = novoCalendar.getTime();
                    
                if(mercadorias.isEmpty()){
                    out.print("Mercadoria não encontrada!");
                }
                //exibir na tela as opções encontradas
                // apos selecionar o nome na tela de exibição atualizar a variável nomeSelecao
                nomeSelecao = "";
                for(int i = 0; i < mercadorias.size(); i++){
                    if(mercadorias.get(i).getNome().equals(nomeSelecao)){
                        mercadorias.get(i).setDataCompra(dateCompra);
                        mercadorias.get(i).setQntCompra(quantCompra);
                        ProdutoController.atualizaMercCompra(mercadorias.get(i));
                    }
                }
            }
            //código comentado será feito na venda
            /*//outro if para venda = true
            //atualizar a variável nomeSelecao
            nomeSelecao = "";
            if(quantidadeV == null || mesV == null || anoV == null || valorV == null){
                out.print("Os parâmetros (quantidadeV, mesV, anoV, valorV) não podem ser nulos.");
            }else{
                mercadorias = ProdutoController.buscaProduto(nome);
                double quantV = Double.parseDouble(quantidadeV);
                double valorVenda = Double.parseDouble(valorV);
                for(int i = 0; i< mercadorias.size(); i++){
                    if(mercadorias.get(i).getNome().equals(nomeSelecao)){
                        mercadorias.get(i).se
                    }
                }
                
            }*/
            }catch(NumberFormatException ex){
                out.print("O parâmetro (nome) informado não pode conter números ou carácteres especiais.");
            }
        }
    }

    private void consultaMerc(HttpServletRequest request, PrintWriter out) {
       String nome = request.getParameter("nome");
       String tipoM = request.getParameter("tipo");
       String precoM = request.getParameter("preco");
       String fornecedor = request.getParameter("fornecedor");
       Vector<Produto> mercadorias = new Vector<>();
       String nomeSelecao = "";
       if(nome == null){
           out.print("O parâmetro (nome) não pode ser nulo!");
       }else{
           try{
                //filtros adicionais for == true
                //chamada de método dentro do else
                mercadorias = ProdutoController.buscaProduto(nome);
                if(mercadorias.isEmpty()){
                    out.print("Mercadoria não encontrada!");
                }else{
                    //exibir na tela web as mercadorias encontradas
                }
                if(tipoM == null || precoM == null || fornecedor == null){
                    out.print("O parâmetros (tipoM,precoM e fornecedor) não podem ser nulos");
                }else{
                    double preco  = Double.parseDouble(precoM);
                    mercadorias = ProdutoController.buscaProdutoInfAdd(nome, tipoM, preco, fornecedor);
                    if(mercadorias.isEmpty()){
                        out.print("Mercadoria não encontrada!");
                    }else{
                        //exibir na tela web as mercadorias encontradas
                    }
               //continuar aqui
               nomeSelecao = "";
               for(int i =0;i<mercadorias.size();i++){
                   if(mercadorias.get(i).getNome().equals(nomeSelecao)){
                       Produto exibicaoMerc = new Produto();
                       exibicaoMerc = mercadorias.get(i);//variável global?
                       //mandar para a página web as informações a serem exibidas.
                   }
               }
               }
           }catch(NumberFormatException ex){
               out.print("O parâmetro (nome) não pode conter números.");
           }
       }
    }
}
