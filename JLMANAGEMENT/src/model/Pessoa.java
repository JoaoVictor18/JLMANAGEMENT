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
public class Pessoa {

    protected String nome;
    protected String cpf;
    protected String rg;
    protected String numeroPis;
    protected String email;
    protected String telefone;
    protected Date dataNasc;
    protected Endereco moradia;
    protected String senha;
    protected boolean admin;
    protected String respSeguranca;
    protected String pergSeguranca;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String rg, String numeroPis, String email, String telefone, Date dataNasc, Endereco moradia, String senha, String resp, String pergSeg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.numeroPis = numeroPis;
        this.email = email;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.moradia = moradia;
        this.senha = senha;
        this.admin = false;
        this.respSeguranca = resp;
        this.pergSeguranca = pergSeg;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getNumeroPis() {
        return numeroPis;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public Endereco getMoradia() {
        return moradia;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setMoradia(Endereco moradia) {
        this.moradia = moradia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getPergSeguranca() {
        return pergSeguranca;
    }

    public String getRespSeguranca() {
        return respSeguranca;
    }

    public void setRespSeguranca(String respSeguranca) {
        this.respSeguranca = respSeguranca;
    }

}
