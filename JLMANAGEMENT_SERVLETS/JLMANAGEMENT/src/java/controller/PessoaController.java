/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.PessoaDAO;
import DAO.VendasDAO;
import java.util.Vector;
import javax.swing.JOptionPane;
import model.Pessoa;
import model.Vendas;
import org.apache.shiro.crypto.hash.Md5Hash;

/**
 *
 * @author LEANDRO
 */
public class PessoaController {

    public static boolean criaPessoa(Pessoa novaPessoa) {
        boolean retorno = PessoaDAO.buscaUsuarioCpf(novaPessoa.getCpf());
        String senha = novaPessoa.getSenha();
        senha = new Md5Hash(senha).toString();
        novaPessoa.setSenha(senha);
        if (retorno == false) {
            PessoaDAO.criaPessoa(novaPessoa);
            return true;
        } else {
            return false;
        }
    }

    public static Pessoa verificaUsuario(String login, String senha) {
        senha = new Md5Hash(senha).toString();
        return PessoaDAO.verificaUsuario(login, senha);
    }

    public static Pessoa verificaSenha(String usuario) {
        Pessoa usuarioRec = PessoaDAO.buscaUsuarioEmail(usuario);
        return usuarioRec;
    }

    public static boolean insereNovaSenha(Pessoa usuario, String senha) {
        senha = new Md5Hash(senha).toString();
        usuario.setSenha(senha);
        return PessoaDAO.insereNovaSenha(usuario);
    }

    public static boolean recuperaSenha(String email, String perSeg, String respSeg, String novaSenha) {
        novaSenha = new Md5Hash(novaSenha).toString();
        return PessoaDAO.recuperaSenha(email, perSeg, respSeg, novaSenha);
    }
    
}
