/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.PessoaDAO;
import DAO.ProdutoDAO;
import java.util.Vector;
import model.Produto;

/**
 *
 * @author LEANDRO
 */
public class ProdutoController {

    //busca o produto pelo nome
    public static Vector<Produto> buscaProduto(String nomeMerc) {
        Vector<Produto> listaProdutos = ProdutoDAO.buscaProduto(nomeMerc);
        return listaProdutos;
    }
    //busca o produto passando os parametros das informações adicionais

    public static Vector<Produto> buscaProdutoInfAdd(String nomeMerc, String tipoMerc, Double precoMerc, String fornecedorMerc) {
        Vector<Produto> listaProdutos = ProdutoDAO.buscaProdutoInfAdd(nomeMerc, tipoMerc, precoMerc, fornecedorMerc);
        return listaProdutos;
    }

    public static boolean buscaProdutoExistente(Produto produto) {
        boolean retorno = ProdutoDAO.buscaProdutoExistente(produto);
        return retorno;
    }

    public static void atualizaMercCompra(Produto mercadoria) {
        ProdutoDAO.atualizaMercCompra(mercadoria);
    }

    public static void atualizaMercVenda(Produto mercadoria, String [] mes) {
        ProdutoDAO.atualizaMercVenda(mercadoria, mes);
    }

    public static Vector<Double> geraBalanco() {
        return ProdutoDAO.geraBalanco();
    }
}
