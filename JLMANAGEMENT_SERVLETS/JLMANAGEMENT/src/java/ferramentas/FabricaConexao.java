package ferramentas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class FabricaConexao {

    public static Connection criaConexao() {
        Connection con = null;
        try {
            
            Context ctx = new InitialContext();
            if (ctx == null) {
                System.err.println("PROBLEMA DE CONTEXTO");;
            }
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("jdbc/DefaultDB");
            
            if (ds != null) {
                con = ds.getConnection();
            }
            return con;
        } catch (NamingException ex) {
            System.err.println("Problema de Naming Exception");
        } catch (SQLException ex) {
            System.err.println("Erro de SQL");;
        }
        return con;
    }
}
