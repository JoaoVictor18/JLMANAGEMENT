/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author leand
 */
public class ProdutoOuro extends Produto {

    private double indiceProduto;
    private double cotacaoOuro;

    public ProdutoOuro(double indiceProduto, double cotacaoOuro, String nome, String tipo, String fornecedor, String infoAdicionais, int percentualImposto, int percentualFrete, int qntMax, int qntMin, double custo, double qntCompra, Date dataCompra) {
        super(nome, tipo, fornecedor, infoAdicionais, percentualImposto, percentualFrete, qntMax, qntMin, custo, qntCompra, dataCompra);
        this.indiceProduto = indiceProduto;
        this.cotacaoOuro = cotacaoOuro;
    }

    public double getIndiceProduto() {
        return indiceProduto;
    }

    public double getCotacaoOuro() {
        return cotacaoOuro;
    }

    public void setIndiceProduto(double indiceProduto) {
        this.indiceProduto = indiceProduto;
    }

    public void setCotacaoOuro(double cotacaoOuro) {
        this.cotacaoOuro = cotacaoOuro;
    }

}
