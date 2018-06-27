/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author leand
 */
public class Administrador extends Funcionario {

    public boolean cadastroFunc(Pessoa func) {
        boolean cadastro = true;
        return cadastro;
    }

    public boolean cadastroMercComum(Produto mercadoria) {
        boolean cadastro = true;
        return cadastro;
    }

    public boolean cadastroMercOuro(ProdutoOuro mercadoria) {
        boolean cadastro = true;
        return cadastro;
    }

    public String balanco() {
        String balancoFinal = "";
        return balancoFinal;
    }

    public String epocaMaiorVenda(String nomeMerc) {
        String resposta = "";
        return resposta;
    }

    public String relatorioVendas(Date dataInicial, Date dataFinal) {
        String resposta = "";
        return resposta;
    }
}
