
package controller;

import DAO.VendasDAO;
import java.util.Vector;
import model.Produto;
import model.Vendas;


public class VendasController {
    public static void cadastraVenda(String[] info, Produto mercadoria){
        VendasDAO.cadastraVenda(info, mercadoria);
    }
    
    public static Vendas epocaMaiorVenda(String nomeMerc, int ano){
        Vector<Vendas> mesesVendaMerc  = VendasDAO.buscaVenda(nomeMerc, ano);
        return mesesVendaMerc;
    }
}
