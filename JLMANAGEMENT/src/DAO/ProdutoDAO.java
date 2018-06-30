package DAO;

import ferramentas.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import model.Produto;

public class ProdutoDAO {

    public static Vector<Produto> buscaProduto(String nomeMerc) {
        Vector<Produto> listaProdutos = new Vector<>();
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "select * from produto where nome = ?";
            //configurando a sql para ser executada em banco de dados
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.setString(1, nomeMerc);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                String nome = resultado.getString("nomeProduto");
                String idProduto = resultado.getString("idProduto");
                String tipo = resultado.getString("tipo");
                String fornecedor = resultado.getString("fornecedor");
                double custo = resultado.getDouble("custo");
                double percImposto = resultado.getDouble("percentualImposto");
                double percFrete = resultado.getDouble("percentualFrete");
                double qntMin = resultado.getDouble("quantidadeMinima");
                String infAdd = resultado.getString("infromacoesAdicionais");
                String refProd = resultado.getString("referenciaProduto");
                Date dataCompra = resultado.getDate("dataCompra");
                double qntEstoque = resultado.getDouble("quantidadeEstoque");
                int idProd = resultado.getInt("idProduto");
                Produto novoProduto = new Produto(nome, tipo, fornecedor, infAdd, percImposto, percFrete, qntEstoque, qntMin, custo, 0, dataCompra, refProd, idProd);
                listaProdutos.add(novoProduto);
            }
        } catch (SQLException ex) {
            System.err.println("Erro na sql...");
        }
        return listaProdutos;
    }

     public static Vector<Produto> buscaProdutoInfAdd(String nomeMerc,String tipoMerc, Double precoMerc, String fornecedorMerc) {
        Vector<Produto> listaProdutos = new Vector<>();
        try (Connection con = FabricaConexao.criaConexao()) {
            //verifica os nomes no banco se estao corretos
            String sql = "select * from produto where nomeProduto = ?, tipo = ?, custo = ?, fornecedor = ?";
            //configurando a sql para ser executada em banco de dados
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.setString(1, nomeMerc);
            consulta.setString(2, tipoMerc);
            consulta.setDouble(3, precoMerc);
            consulta.setString(4, fornecedorMerc);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                String nome = resultado.getString("nomeProduto");
                String idProduto = resultado.getString("idProduto");
                String tipo = resultado.getString("tipo");
                String fornecedor = resultado.getString("fornecedor");
                double custo = resultado.getDouble("custo");
                double percImposto = resultado.getDouble("percentualImposto");
                double percFrete = resultado.getDouble("percentualFrete");
                double qntMin = resultado.getDouble("quantidadeMinima");
                String infAdd = resultado.getString("infromacoesAdicionais");
                String refProd = resultado.getString("referenciaProduto");
                Date dataCompra = resultado.getDate("dataCompra");
                double qntEstoque = resultado.getDouble("quantidadeEstoque");
                int idProd = resultado.getInt("idProduto");
                Produto novoProduto = new Produto(nome, tipo, fornecedor, infAdd, percImposto, percFrete, qntEstoque, qntMin, custo, 0, dataCompra, refProd, idProd);
                listaProdutos.add(novoProduto);
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
                String sqlInsert = "insert into produto (nomeProduto, tipo, fornecedor, custo, percentualImposto, percentualFrete, "
                        + "quantidadeMinima, informacoesAdicionais, referenciaProduto, dataCompra, quantidadeEstoque) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement consultaInsert = con.prepareStatement(sqlInsert);
                consultaInsert.setString(1, produto.getNome());
                consultaInsert.setString(2, produto.getTipo());
                consultaInsert.setString(3, produto.getFornecedor());
                consultaInsert.setDouble(4, produto.getCusto());
                consultaInsert.setDouble(5, produto.getPercentualImposto());
                consultaInsert.setDouble(6, produto.getPercentualFrete());
                consultaInsert.setDouble(7, produto.getQntMin());
                consultaInsert.setString(8, produto.getInfoAdicionais());
                consultaInsert.setString(9, produto.getReferencia());
                consultaInsert.setTimestamp(10, new Timestamp(produto.getDataCompra().getTime()));
                consultaInsert.setDouble(11, produto.getQntEstoque());
                consultaInsert.execute();
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Erro de execução da SQL..");
        }
        return true;
    }

    public static void atualizaMerc(Produto mercadoria) {
        try (Connection con = FabricaConexao.criaConexao()) {
            String sqlUpdate = "update produto set dataCompra = ?, quantidadeEstoque = ?, where idProduto =?";
            PreparedStatement consultaInsert = con.prepareStatement(sqlUpdate);
            consultaInsert.setTimestamp(1, new Timestamp(mercadoria.getDataCompra().getTime()));
            consultaInsert.setDouble(2, mercadoria.getQntEstoque());
            consultaInsert.setInt(3, mercadoria.getIdProduto());
            consultaInsert.execute();
        } catch (Exception ex) {
            System.err.println("Erro de execução da SQL..");
        }
    }
        public static Vector<Double> geraBalanco() {
        Vector <Double> resposta = new Vector<>();
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "Select sum(custo*quantidadeEstoque) as custoTotal, sum(quantidadeEstoque) as quantidadeTotal from produto";
            PreparedStatement calcula = con.prepareStatement(sql);
            ResultSet resultado = calcula.executeQuery();
            while(resultado.next()){
                resposta.add(resultado.getDouble("quantidadeTotal"));
                resposta.add(resultado.getDouble("custoTotal"));
            }
        }catch(SQLException ex){
            System.err.println("Erro com a sql...");
        }
        return resposta;
    }
}
