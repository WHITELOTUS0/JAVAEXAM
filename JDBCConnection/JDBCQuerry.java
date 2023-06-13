package JDBCConnection;
import java.sql.*;

public class JDBCQuerry {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jsbc:mysql://localhost:3306/mydatabase";
            String user = "root";
            String password = "Bujumbura1#";

        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
