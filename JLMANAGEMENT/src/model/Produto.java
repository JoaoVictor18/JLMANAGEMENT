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
    protected int percentualImposto;
    protected int percentualFrete;
    protected int qntMax;
    protected int qntMin;
    protected double custo;
    protected double qntCompra;
    protected Date dataCompra;

    public Produto() {
    }

    public Produto(String nome, String tipo, String fornecedor, String infoAdicionais, int percentualImposto, int percentualFrete, int qntMax, int qntMin, double custo, double qntCompra, Date dataCompra) {
        this.nome = nome;
        this.tipo = tipo;
        this.fornecedor = fornecedor;
        this.infoAdicionais = infoAdicionais;
        this.percentualImposto = percentualImposto;
        this.percentualFrete = percentualFrete;
        this.qntMax = qntMax;
        this.qntMin = qntMin;
        this.custo = custo;
        this.qntCompra = qntCompra;
        this.dataCompra = dataCompra;
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

    public int getPercentualImposto() {
        return percentualImposto;
    }

    public int getPercentualFrete() {
        return percentualFrete;
    }

    public int getQntMax() {
        return qntMax;
    }

    public int getQntMin() {
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

    public void setQntMax(int qntMax) {
        this.qntMax = qntMax;
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

}
