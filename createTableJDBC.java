import java.sql.*;

    public class createTableJDBC {
        public static void main(String[] args) {
            try {
                String url = "jdbc:mysql://localhost:3306/payroll_service";
                String user = "root";
                String pass = "15011999";

                Connection connection = DriverManager.getConnection(url, user, pass); /* To connect through mysql server*/
                Statement stat = connection.createStatement();   /* Using statement interface to execute mysql commands in java */
                String sql = "create table employeePayroll(emp_name varchar(50), emp_id int unsigned, emp_department varchar(50), emp_salary int unsigned)";
                stat.executeUpdate(sql);          /* Using statement interface method to run the mysql command */
                System.out.println("table created successfully");
                stat.close();
                connection.close();
            }
            catch (Exception e)
            {
                System.out.println("TABLE NOT CREATED");
                e.printStackTrace();

            }

        }
    }

