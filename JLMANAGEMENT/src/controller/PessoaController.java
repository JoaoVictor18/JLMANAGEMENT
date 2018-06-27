/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.PessoaDAO;
import javax.swing.JOptionPane;
import model.Pessoa;

/**
 *
 * @author LEANDRO
 */
public class PessoaController {

    public static boolean criaPessoa(Pessoa novaPessoa) {
        boolean retorno = PessoaDAO.buscaUsuarioCpf(novaPessoa.getCpf());
        if (retorno == false) {
            PessoaDAO.criaPessoa(novaPessoa);
            return true;
        } else {
            return false;
        }
    }

    public static Pessoa verificaUsuario(String login, String senha) {
        return PessoaDAO.verificaUsuario(login, senha);
    }
}
