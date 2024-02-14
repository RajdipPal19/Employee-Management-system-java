import java.sql.DriverManager;

public class Connection {

    java.sql.Connection connection;
    void Crate_conn(){
        try {
            String user = "rajdip";
            String password = "rajdip123";

            String url = "jdbc:mysql://localhost:3306/Raj_MySQL";

            connection = DriverManager.getConnection(url, user, password);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    void Close_conn(){
        try {
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
