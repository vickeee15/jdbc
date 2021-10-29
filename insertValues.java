import java.sql.*;

public class insertValues {
        public static void main(String[] args) {
            try {
                String url = "jdbc:mysql://localhost:3306/payroll_service";
                String user = "root";
                String pass = "15011999";

                Connection connection = DriverManager.getConnection(url, user, pass); /* To connect through mysql server*/
                Statement stat = connection.createStatement();   /* Using statement interface to execute mysql commands in java */
                String sql = "insert into employeePayroll values('vignesh', 44, 'front end', 44000),('mothilal', 46,'backend',46000)";
                stat.executeUpdate(sql);          /* Using statement interface method to run the mysql command */
                System.out.println("values inserted successfully");
                stat.close();
                connection.close();
            }
            catch (Exception e)
            {
                System.out.println("values inserted");
                e.printStackTrace();

            }

        }
    }