import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
    public Connection connectToDB(String dbName, String user, String pwd){
        Connection connect=null;
        try{
            Class.forName("org.postgresql.Driver");
            connect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName,user,pwd);
            if(connect!=null){
                System.out.println("DataBase Connection is Established");
            }
            else{
                System.out.println("Connection Failed");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return connect;
    }
    public void readData(Connection connect,String tableName){
        Statement statement;
        ResultSet result=null;
        try{
            String query=String.format("select * from %s",tableName);
            statement=connect.createStatement();
            result=statement.executeQuery(query);
            System.out.println("Healed Locators :");
            while (result.next()){
                System.out.println(result.getString("locator")+" ");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
