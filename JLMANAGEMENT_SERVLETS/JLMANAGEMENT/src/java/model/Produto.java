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
public class Produto {

    protected String nome;
    protected String tipo;
    protected String fornecedor;
    protected String infoAdicionais;
    protected double percentualImposto;
    protected double percentualFrete;
    protected double qntEstoque;
    protected double qntMin;
    protected double custo;
    protected double qntCompra;
    protected Date dataCompra;
    protected String referencia;
    protected int idProduto;

    public Produto() {
    }

    public Produto(String nome, String tipo, String fornecedor, String infoAdicionais, double percentualImposto, double percentualFrete,
            double qntEstoque, double qntMin, double custo, double qntCompra, Date dataCompra, String referencia) {
        this.nome = nome;
        this.tipo = tipo;
        this.fornecedor = fornecedor;
        this.infoAdicionais = infoAdicionais;
        this.percentualImposto = percentualImposto;
        this.percentualFrete = percentualFrete;
        this.qntEstoque = qntEstoque;
        this.qntMin = qntMin;
        this.custo = custo;
        this.qntCompra = qntCompra;
        this.dataCompra = dataCompra;
        this.referencia = referencia;
    }

    public Produto(String nome, String tipo, String fornecedor, String infoAdicionais, double percentualImposto, double percentualFrete, double qntEstoque, double qntMin, double custo, double qntCompra, Date dataCompra, String referencia, int idProduto) {
        this.nome = nome;
        this.tipo = tipo;
        this.fornecedor = fornecedor;
        this.infoAdicionais = infoAdicionais;
        this.percentualImposto = percentualImposto;
        this.percentualFrete = percentualFrete;
        this.qntEstoque = qntEstoque;
        this.qntMin = qntMin;
        this.custo = custo;
        this.qntCompra = qntCompra;
        this.dataCompra = dataCompra;
        this.referencia = referencia;
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public String getInfoAdicionais() {
        return infoAdicionais;
    }

    public double getPercentualImposto() {
        return percentualImposto;
    }

    public double getPercentualFrete() {
        return percentualFrete;
    }

    public double getQntEstoque() {
        return qntEstoque;
    }

    public double getQntMin() {
        return qntMin;
    }

    public double getCusto() {
        return custo;
    }

    public double getQntCompra() {
        return qntCompra;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setInfoAdicionais(String infoAdicionais) {
        this.infoAdicionais = infoAdicionais;
    }

    public void setPercentualImposto(int percentualImposto) {
        this.percentualImposto = percentualImposto;
    }

    public void setPercentualFrete(int percentualFrete) {
        this.percentualFrete = percentualFrete;
    }

    public void setQntEstoque(double qntEstoque) {
        this.qntEstoque = qntEstoque;
    }

    public void setQntMin(int qntMin) {
        this.qntMin = qntMin;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setQntCompra(double qntCompra) {
        this.qntCompra = qntCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getIdProduto() {
        return idProduto;
    }

}
