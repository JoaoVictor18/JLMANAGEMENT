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
public class Funcionario extends Pessoa {

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String rg, String numeroPis, String email, String telefone, Date dataNasc, Endereco moradia, String senha, String resp) {
        super(nome, cpf, rg, numeroPis, email, telefone, dataNasc, moradia, senha, resp);
    }

    public String consultaMercadoria(String nomeMercadoria) {
        String consultaEfetuada = "";
        return consultaEfetuada;
    }

    public boolean realizaLogin(String nome, String senha) {
        boolean login = true;
        return login;
    }
}
