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
            String sql = "select * from produto where nomeproduto = ?";
            //configurando a sql para ser executada em banco de dados
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.setString(1, nomeMerc);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                String nome = resultado.getString("nomeproduto");
                String idProduto = resultado.getString("idproduto");
                String tipo = resultado.getString("tipo");
                String fornecedor = resultado.getString("fornecedor");
                double custo = resultado.getDouble("custo");
                double percImposto = resultado.getDouble("percentualimposto");
                double percFrete = resultado.getDouble("percentualfrete");
                double qntMin = resultado.getDouble("quantidademinima");
                String infAdd = resultado.getString("infromacoesadicionais");
                String refProd = resultado.getString("referenciaproduto");
                Date dataCompra = resultado.getDate("datacompra");
                double qntEstoque = resultado.getDouble("quantidadeestoque");
                int idProd = resultado.getInt("idproduto");
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
            String sql = "select * from produto where nomeproduto = ?, tipo = ?, custo = ?, fornecedor = ?";
            //configurando a sql para ser executada em banco de dados
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.setString(1, nomeMerc);
            consulta.setString(2, tipoMerc);
            consulta.setDouble(3, precoMerc);
            consulta.setString(4, fornecedorMerc);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                String nome = resultado.getString("nomeproduto");
                String idProduto = resultado.getString("idproduto");
                String tipo = resultado.getString("tipo");
                String fornecedor = resultado.getString("fornecedor");
                double custo = resultado.getDouble("custo");
                double percImposto = resultado.getDouble("percentualimposto");
                double percFrete = resultado.getDouble("percentualfrete");
                double qntMin = resultado.getDouble("quantidademinima");
                String infAdd = resultado.getString("infromacoesadicionais");
                String refProd = resultado.getString("referenciaproduto");
                Date dataCompra = resultado.getDate("datacompra");
                double qntEstoque = resultado.getDouble("quantidadeestoque");
                int idProd = resultado.getInt("idproduto");
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
            String sqlSelect = "select * from produto where nomeproduto = ? and referenciaproduto = ?";
            PreparedStatement consultaSelect = con.prepareStatement(sqlSelect);
            consultaSelect.setString(1, produto.getNome());
            consultaSelect.setString(2, produto.getReferencia());
            ResultSet resultado = consultaSelect.executeQuery();

            if (resultado.next()) {
                //se existe a informação buscada
                return true;
            } else {
                //insere o produto no banco de dados
                String sqlInsert = "insert into produto (nomeproduto, tipo, fornecedor, custo, percentualimposto, percentualfrete,"
                        + "quantidademinima, referenciaproduto, datacompra, quantidadeestoque) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
                consultaInsert.setDouble(10, produto.getQntEstoque());
                consultaInsert.execute();
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Erro de execução da SQL..");
        }
        return true;
    }

    public static void atualizaMerc(Produto mercadoria) {
        try (Connection con = FabricaConexao.criaConexao()) {
            String sqlUpdate = "update produto set datacompra = ?, quantidadeestoque = ?, where idproduto =?";
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
            String sql = "Select sum(custo*quantidadeestoque) as custototal, sum(quantidadeestoque) as quantidadetotal from produto";
            PreparedStatement calcula = con.prepareStatement(sql);
            ResultSet resultado = calcula.executeQuery();
            while(resultado.next()){
                resposta.add(resultado.getDouble("quantidadetotal"));
                resposta.add(resultado.getDouble("custototal"));
            }
        }catch(SQLException ex){
            System.err.println("Erro com a sql...");
        }
        return resposta;
    }
}
