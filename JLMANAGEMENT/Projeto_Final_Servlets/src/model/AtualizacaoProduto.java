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
public class AtualizacaoProduto {

    private String nome;
    private double qntAtualizada;
    private Date dataAtualizacao;
    private Pessoa admin;

    public AtualizacaoProduto(String nome, double qntAtualizada, Date dataAtualizacao) {
        this.nome = nome;
        this.qntAtualizada = qntAtualizada;
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getNome() {
        return nome;
    }

    public double getQntAtualizada() {
        return qntAtualizada;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setQntAtualizada(double qntAtualizada) {
        this.qntAtualizada = qntAtualizada;
    }

}
