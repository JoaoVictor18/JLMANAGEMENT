
package Servlets;

import Commons.Configuracao;
import controller.VendasController;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;
import model.Vendas;



@WebServlet(name = "VendaServlet", urlPatterns = {"/VendaServlet"})
public class VendaServlet extends HttpServlet {

    public static void epocaMaiorVenda(HttpServletRequest request, PrintWriter out){
        String nome = request.getParameter("nome");
        String ano = request.getParameter("ano");
        Vector<Vendas> vendas = VendasController.epocaMaiorVenda(nome, ano);
        if(!vendas.isEmpty()){
            Resposta resultado = new Resposta(200, "Consulta efetuada com sucesso!!");
            out.print(resultado.toJSON());
        }else{
            Resposta resultado = new Resposta(400, "Erro ao fazer a consulta no banco!!");
            out.print(resultado.toJSON());
        }
    }
    
    public static void cadastraVenda(HttpServletRequest request, PrintWriter out){
        String nome = request.getParameter("nome");
        String quant = request.getParameter("qntVendida");
        String mes = request.getParameter("mesVenda");
        String ano = request.getParameter("anoVenda");
        String valor = request.getParameter("valorVenda");
        Vector <Produto> mercadorias = VendasController.buscaMercadoria(nome);
        //if para verificar o parametro do javaScript de qual mercadoria passar
        String [] info = {mes, ano, nome, quant, valor};
        boolean retorno = VendasController.cadastraVenda(info, mercadorias.get(0));
        if(retorno == true){
            Resposta resultado = new Resposta(200, "Venda cadastrada com sucesso!!!");
            out.print(resultado.toJSON());
        }else{
            Resposta resultado = new Resposta(500, "Erro ao cadastrar sua venda!!");
            out.print(resultado.toJSON());
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Configuracao.configResponseRequest(request, response);
        try (PrintWriter out = response.getWriter()) {
            String servico = request.getParameter("serv");
            switch(servico){
                case "epocaMaiorVenda":{
                    epocaMaiorVenda(request, out);
                }break;
                case "venda":{
                    cadastraVenda(request, out);
                }break;
                default:{
                    
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
