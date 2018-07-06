
package DAO;

import ferramentas.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Produto;


public class VendasDAO {
    public static void cadastraVenda(String[] info, Produto mercadoria){
        try (Connection con = FabricaConexao.criaConexao()) {
            String sqlVenda = "insert into vendas (mes, ano, nomemercadoria, qntvendida, valorvendido) values (?, ?, ?, ?, ?)";
            PreparedStatement consultaInsert = con.prepareStatement(sqlVenda);
            consultaInsert.setString(1, info[1]);
            consultaInsert.setString(2, info[2]);
            consultaInsert.setString(3, mercadoria.getNome());
            consultaInsert.setDouble(4, Double.parseDouble(info[0]));
            consultaInsert.setDouble(5, Double.parseDouble(info[3]));
            consultaInsert.execute();
        } catch (Exception ex) {
            System.err.println("Erro de execução da SQL..");
        }
    }
    public static Vendas buscaVenda(String nome, String ano){
        try (Connection con = FabricaConexao.criaConexao()) {
            String sqlVenda = "select * from vendas where nomemercadoria = ? and ano = ?";
            PreparedStatement consultaInsert = con.prepareStatement(sqlVenda);
            consultaInsert.setString(1, nome);
            consultaInsert.setString(2, ano);
            ResultSet resultado = consultaInsert.executeQuery();
            while(resultado.next()){
                String nomeMercadoria = resultado.getString("nomemercadoria");
                String mes = resultado.getString("mes");
                String anoMercadoria = resultado.getString("ano");
                double valor = resultado.getDouble("valorvendido");
                int id = resultado.getInt("idvendas");
                
            }
        } catch (Exception ex) {
            System.err.println("Erro de execução da SQL..");
        }
    }
}
