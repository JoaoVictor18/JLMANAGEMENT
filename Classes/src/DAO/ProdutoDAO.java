
package DAO;

import ferramentas.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Produto;


public class ProdutoDAO {
    public static void cadastraProduto(Produto novoProduto) {
        //SQL's
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "insert into produto (nome, preco, quantidade)"
                    + "values(?, ?, ?)";
            //configurando a sql para ser executada em banco de dados
            PreparedStatement x = con.prepareStatement(sql);
            x.setString(1, novoProduto.getNome());
            x.setDouble(2, novoProduto.getPreco());
            x.setDouble(3, novoProduto.getQuantidade());
            x.execute();
        } catch (SQLException ex) {
            System.err.println("Erro na sql...");
        }

    }
}
