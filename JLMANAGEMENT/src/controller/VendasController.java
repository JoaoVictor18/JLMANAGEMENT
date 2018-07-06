
package controller;

import DAO.VendasDAO;
import model.Produto;


public class VendasController {
    public static void cadastraVenda(String[] info, Produto mercadoria){
        VendasDAO.cadastraVenda(info, mercadoria);
    }
}
