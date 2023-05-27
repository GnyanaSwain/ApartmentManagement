
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    Connection conn;
   public static Connection getConnection(){
        
        try{
            //username //database         =pass no password
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/apartment","root","root");
            return con;         
        }      
        catch(Exception e){
            System.out.println("DBConnection Failed : "+e.getMessage());
        }
         System.out.println("DBConnection Success!! ");
        return null;
}
    
}
