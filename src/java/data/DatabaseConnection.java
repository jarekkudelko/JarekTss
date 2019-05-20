package data;

 import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public final class DatabaseConnection {
    private Connection connection;

     public DatabaseConnection() {
        getConnectionFromContext();
    }

     public Connection getConnectionFromContext() {

         try {
            Context initContext = new InitialContext();
            Context envContext  = (Context)initContext.lookup("java:/comp/env");
            DataSource ds_mssql = (DataSource)envContext.lookup("jdbc/bazaTestowaMSSQL");

             connection = ds_mssql.getConnection();        
        } catch(Exception ex) {
            ex.printStackTrace();
        }   

         return connection;
    }
}
