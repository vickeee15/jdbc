import java.sql.*;

public class employee_payroll {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306";
            String user = "root";
            String pass = "15011999";

            Connection connection = DriverManager.getConnection(url, user, pass); /* To connect through mysql server*/
            Statement stat = connection.createStatement();   /* Using statement interface to execute mysql commands in java */
            String sql = "create database payroll_service";
            stat.executeUpdate(sql);          /* Using statement interface method to run the mysql command */
            System.out.println("database created successfully");
            stat.close();
            connection.close();
        }
        catch (Exception e)
        {
            System.out.println("DATABASE NOT CREATED");
            e.printStackTrace();

        }

    }
}