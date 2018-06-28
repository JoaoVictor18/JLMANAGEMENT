package DAO;

import ferramentas.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
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
        Vector<String> listaProdutos = new Vector<>();
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "select * from produto where nome = ";
            //configurando a sql para ser executada em banco de dados
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.setString(1, nomeMerc);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                String nome = resultado.getString("nome");
                listaProdutos.add(nome);
            }
        } catch (SQLException ex) {
            System.err.println("Erro na sql...");
        }
        return listaProdutos;
    }

    public static boolean buscaProdutoExistente(Produto produto) {
        try (Connection con = FabricaConexao.criaConexao()) {
            //verificar com saulo sobre a 
            String sqlSelect = "select * from produto where nomeProduto = ? and referenciaProduto = ?";
            PreparedStatement consultaSelect = con.prepareStatement(sqlSelect);
            consultaSelect.setString(1, produto.getNome());
            consultaSelect.setString(2, produto.getReferencia());
            ResultSet resultado = consultaSelect.executeQuery();

            if (resultado.next()) {
                //se existe a informação buscada
                return true;
            } else {
                //insere o produto no banco de dados
                String sqlInsert = "insert into produto (nomeProduto, tipo, fornecedor, custo, percentualImposto, percentualFrete,"
                        + "quantidadeMinima, referencia, dataCompra, quantidadeMaxima) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement consultaInsert = con.prepareStatement(sqlInsert);
                consultaInsert.setString(1, produto.getNome());
                consultaInsert.setString(2, produto.getTipo());
                consultaInsert.setString(3, produto.getFornecedor());
                consultaInsert.setDouble(4, produto.getCusto());
                consultaInsert.setDouble(5, produto.getPercentualImposto());
                consultaInsert.setDouble(6, produto.getPercentualFrete());
                consultaInsert.setDouble(7, produto.getQntMin());
                consultaInsert.setString(8, produto.getReferencia());
                consultaInsert.setTimestamp(9, new Timestamp(produto.getDataCompra().getTime()));
                consultaInsert.setDouble(10, produto.getQntMax());

                consultaInsert.execute();
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Erro de execução da SQL..");
        }
        return true;
    }
}
