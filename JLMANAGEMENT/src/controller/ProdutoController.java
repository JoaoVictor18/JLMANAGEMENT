/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProdutoDAO;
import java.util.Vector;
import model.Produto;

/**
 *
 * @author LEANDRO
 */
public class ProdutoController {

    public static Vector<String> buscaProduto(String nomeMerc) {
        Vector<String> listaProdutos = ProdutoDAO.buscaProduto(nomeMerc);
        return listaProdutos;
    }
}
