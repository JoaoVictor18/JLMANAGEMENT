package DAO;

import ferramentas.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import model.Endereco;
import model.Pessoa;

public class PessoaDAO {

    public static void criaPessoa(Pessoa novaPessoa) {
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "insert into pessoa (nome, datanascimento, cpf, rg, numeropis, email, telefone, "
                    + "senha, rua, numero, bairro, complemento, referencia, cep, cidade, estado, admin, respseguranca, pergseguranca) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement insere = con.prepareStatement(sql);
            insere.setString(1, novaPessoa.getNome());
            insere.setTimestamp(2, new Timestamp(novaPessoa.getDataNasc().getTime()));
            insere.setString(3, novaPessoa.getCpf());
            insere.setString(4, novaPessoa.getRg());
            insere.setString(5, novaPessoa.getNumeroPis());
            insere.setString(6, novaPessoa.getEmail());
            insere.setString(7, novaPessoa.getTelefone());
            insere.setString(8, novaPessoa.getSenha());
            insere.setString(9, novaPessoa.getMoradia().getRua());
            insere.setInt(10, novaPessoa.getMoradia().getNumero());
            insere.setString(11, novaPessoa.getMoradia().getBairro());
            insere.setString(12, novaPessoa.getMoradia().getComplemento());
            insere.setString(13, novaPessoa.getMoradia().getReferencia());
            insere.setString(14, novaPessoa.getMoradia().getCep());
            insere.setString(15, novaPessoa.getMoradia().getCidade());
            insere.setString(16, novaPessoa.getMoradia().getEstado());
            insere.setBoolean(17, novaPessoa.isAdmin());
            insere.setString(18, novaPessoa.getRespSeguranca());
            insere.setString(19, novaPessoa.getPergSeguranca());
            insere.execute();
        } catch (SQLException ex) {
            System.err.println("Erro na execução da sql!!");
            ex.printStackTrace();
        }
    }

    public static Pessoa verificaUsuario(String login, String senha) {
        String pass = "";
        Pessoa novoUser = new Pessoa();
        boolean retorno = false;
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "select * from pessoa where email = ?";
            PreparedStatement verifica = con.prepareStatement(sql);
            verifica.setString(1, login);
            ResultSet resultado = verifica.executeQuery();
            while (resultado.next()) {
                pass = resultado.getString("senha");
                if (pass.equals(senha)) {
                    retorno = true;
                } else {
                    retorno = false;
                }
            }
            if (retorno == true) {
                while (resultado.next()) {
                    String nome = resultado.getString("nome");
                    String cpf = resultado.getString("cpf");
                    String rg = resultado.getString("rg");
                    String pis = resultado.getString("numeropis");
                    String email = resultado.getString("email");
                    String telefone = resultado.getString("telefone");
                    Date dataNasc = resultado.getDate("datanascimento");
                    String rua = resultado.getString("rua");
                    String bairro = resultado.getString("bairro");
                    int numero = resultado.getInt("numero");
                    String complemento = resultado.getString("complemento");
                    String referencia = resultado.getString("referencia");
                    String cep = resultado.getString("cep");
                    String cidade = resultado.getString("cidade");
                    String estado = resultado.getString("estado");
                    boolean admin = resultado.getBoolean("admin");
                    String senhaS = resultado.getString("senha");
                    String respSeguranca = resultado.getString("respseguranca");
                    String perguntaSeguranca = resultado.getString("pergseguranca");
                    Endereco novoEnd = new Endereco(rua, bairro, estado, cidade, cep, complemento, referencia, numero);
                    novoUser = new Pessoa(nome, cpf, rg, pis, email, telefone, dataNasc, novoEnd, senhaS, respSeguranca, perguntaSeguranca);
                }
            } else {
                novoUser = null;
            }
        } catch (SQLException ex) {
            System.err.println("Erro na execução da sql...");
        }
        return novoUser;
    }

    public static boolean buscaUsuarioCpf(String cpf) {
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "select * from pessoa where cpf = ?";
            PreparedStatement verifica = con.prepareStatement(sql);
            verifica.setString(1, cpf);
            ResultSet resultado = verifica.executeQuery();
            while (resultado.next()) {
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Erro na execução da sql...");
        }
        return false;
    }

    public static Pessoa buscaUsuarioEmail(String usuario) {
        Pessoa pessoaSenha = new Pessoa();
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "selec * from pessoa where email = ?";
            PreparedStatement verifica = con.prepareStatement(sql);
            verifica.setString(1, usuario);
            ResultSet resultado = verifica.executeQuery();

            while (resultado.next()) {
                String nome = resultado.getString("nome");
                String cpf = resultado.getString("cpf");
                String rg = resultado.getString("rg");
                String pis = resultado.getString("numeropis");
                String email = resultado.getString("email");
                String telefone = resultado.getString("telefone");
                Date dataNasc = resultado.getDate("datanascimento");
                String rua = resultado.getString("rua");
                String bairro = resultado.getString("bairro");
                int numero = resultado.getInt("numero");
                String complemento = resultado.getString("complemento");
                String referencia = resultado.getString("referencia");
                String cep = resultado.getString("cep");
                String cidade = resultado.getString("cidade");
                String estado = resultado.getString("estado");
                String senhaS = resultado.getString("senha");
                String respSeguranca = resultado.getString("respseguranca");
                String perguntaSeguranca = resultado.getString("pergseguranca");
                Endereco novoEnd = new Endereco(rua, bairro, estado, cidade, cep, complemento, referencia, numero);
                pessoaSenha = new Pessoa(nome, cpf, rg, pis, email, telefone, dataNasc, novoEnd, senhaS, respSeguranca, perguntaSeguranca);
                return pessoaSenha;
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL");
        }
        return null;
    }

    public static void insereNovaSenha (Pessoa usuario) {
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "update pessoa set senha = ? where cpf = ?";
            PreparedStatement update = con.prepareStatement(sql);
            update.setString(1, usuario.getSenha());
            update.setString(2, usuario.getCpf());
            update.execute();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL");
        }
    }
}
