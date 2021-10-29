import java.sql.*;

public class connectdb {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/payroll_service";
            String user = "root";
            String pass = "15011999";

            Connection connection = DriverManager.getConnection(url, user, pass); /* To connect through mysql database server*/
            if (connection != null) {
                System.out.println("Database connected successfully");
            }
            connection.close();
        }
        catch (Exception e)
        {
            System.out.println("DATABASE NOT CONNECTED");
            e.printStackTrace();

        }

    }
}
