package ferramentas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FabricaConexao {

    public static Connection criaConexao() {
        //sempre adicionar o driver no projeto
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JLMANAGEMENT", "postgres", "leandro106074");
        } catch (SQLException ex) {
            System.err.println("Erro com a conexão com o bando de dados...");
        }
        return conexao;
    }
}
