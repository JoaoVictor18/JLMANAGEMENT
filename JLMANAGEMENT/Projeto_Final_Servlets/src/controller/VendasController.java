
package controller;

import DAO.VendasDAO;
import java.util.Vector;
import model.Produto;
import model.Vendas;


public class VendasController {
    public static void cadastraVenda(String[] info, Produto mercadoria){
        VendasDAO.cadastraVenda(info, mercadoria);
    }
    
    public static Vector<Vendas> epocaMaiorVenda(String nomeMerc, String ano){
        Vector<Vendas> mesesVendaMerc  = VendasDAO.buscaVenda(nomeMerc, ano);
        return mesesVendaMerc;
    }
}
