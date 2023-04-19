import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BankSystem {
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/bank_db";
        String username="root";
        String password="Razvan700";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from accounts");

            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getInt(2)+" "+resultSet.getInt(3)+" "+resultSet.getInt(4)+" "+resultSet.getInt(5));
            }
            connection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
