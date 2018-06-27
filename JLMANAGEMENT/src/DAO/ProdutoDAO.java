package DAO;

import ferramentas.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import model.Produto;

public class ProdutoDAO {

    public static void cadastraProduto(Produto novoProduto) {
        //SQL's
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "insert into produto (nome, preco, quantidade)"
                    + "values(?, ?, ?)";
            //configurando a sql para ser executada em banco de dados
            PreparedStatement x = con.prepareStatement(sql);
        } catch (SQLException ex) {
            System.err.println("Erro na sql...");
        }
    }

    public static Vector<String> buscaProduto(String nomeMerc) {
        Vector <String> listaProdutos = new Vector<>();
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "select * produto where nome = ";
            //configurando a sql para ser executada em banco de dados
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.setString(1, nomeMerc);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                String nome = resultado.getString("nome");
                listaProdutos.add(nome);
            }
        } catch (SQLException ex) {
            System.err.println("Erro na sql...");
        }
    }
}
