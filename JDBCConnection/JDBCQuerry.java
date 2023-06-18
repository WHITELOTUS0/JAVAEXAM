package JDBCConnection;
import java.sql.*;

public class JDBCQuerry {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "root";
            String password = "Bujumbura1#";

            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from mytable");

            while(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString("password"));
            }

        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
//Simple Database Connection 
