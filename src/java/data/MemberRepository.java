package data;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

 /**
 *
 * @author Student
 */
public class MemberRepository {
   private final DatabaseConnection databaseConnection;

    public MemberRepository() {
       databaseConnection = new DatabaseConnection();
   }

     public void findAll() {
        try {
            ResultSet rs = databaseConnection.getConnectionFromContext()
                                                         .createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                                            java.sql.ResultSet.CONCUR_READ_ONLY)
                                                         .executeQuery("select * from t_dane");

             ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

                     // The column count starts from 1
                for (int i = 1; i <= columnCount; i++ ) {
                    String name = rsmd.getColumnName(i);
                    System.out.println(name);
                }

         } catch (SQLException ex) {

         }
    }
}
