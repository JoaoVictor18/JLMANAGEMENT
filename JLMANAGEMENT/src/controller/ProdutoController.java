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

    public static Vector<Produto> buscaProduto(String nomeMerc) {
        Vector<Produto> listaProdutos = ProdutoDAO.buscaProduto(nomeMerc);
        return listaProdutos;
    }
    
    public static boolean buscaProdutoExistente(Produto produto){
        boolean retorno = ProdutoDAO.buscaProdutoExistente(produto);
        return retorno;
    }
}
