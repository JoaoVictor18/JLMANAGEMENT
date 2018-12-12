
package controller;

import DAO.VendasDAO;
import java.util.Vector;
import model.Produto;
import model.Vendas;


public class VendasController {
    public static boolean cadastraVenda(String[] info, Produto mercadoria){
        return VendasDAO.cadastraVenda(info, mercadoria);
        //chamar mercadoria controler para atualizar a quantidade do estoque
    }
    
    public static Vector<Vendas> epocaMaiorVenda(String nomeMerc, String ano){
        Vector<Vendas> mesesVendaMerc  = VendasDAO.buscaVenda(nomeMerc, ano);
        return mesesVendaMerc;
    }
    
    public static Vector <Produto> buscaMercadoria(String nome){
        return ProdutoController.buscaProduto(nome);
    }
}
