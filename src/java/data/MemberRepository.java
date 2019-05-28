package data;

import dao.TDane;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MemberRepository {
   private final DatabaseConnection databaseConnection;
   
   public MemberRepository() {
       databaseConnection = new DatabaseConnection();
   }
   
    public List<TDane> findAll() {
        List<TDane> results = new ArrayList<>();
        try {
            ResultSet rs = databaseConnection.getConnectionFromContext()
                                                         .createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                                            java.sql.ResultSet.CONCUR_READ_ONLY)
                                                         .executeQuery("select * from t_dane");       
            while(rs.next()) {
                String id = rs.getString("id");
                String nr = rs.getString("nr");
                String tytul = rs.getString("tytul");
                String opis = rs.getString("opis");
                String kwota = rs.getString("kwota");
                String obraz = rs.getString("obraz");
                    
                results.add(new TDane(id, nr, tytul, opis, kwota, obraz));
            }
                
        } catch (SQLException ex) {

        }
        
        return results;
    }
}