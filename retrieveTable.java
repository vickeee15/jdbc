import java.sql.*;

public class retrieveTable {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/payroll_service";
            String user = "root";
            String pass = "15011999";

            Connection connection = DriverManager.getConnection(url, user, pass); /* To connect through mysql server*/
            Statement stat = connection.createStatement();   /* Using statement interface to execute mysql commands in java */
            String sql = "select * from employeePayroll";
            ResultSet resultSet = stat.executeQuery(sql);          /* Using statement interface method to run the mysql command */
            while(resultSet.next())                /* Using rs pointer to retrieve the table */
            {
               String emp_name = resultSet.getString(1);
               int emp_id = resultSet.getInt(2);
               String emp_department = resultSet.getString(3);
               int emp_salary = resultSet.getInt(4);

                System.out.println(emp_name + "\t" + emp_id + "\t" + emp_department + "\t" + emp_salary);

            }
            resultSet.close();

            stat.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Can't retrieve the table");
            e.printStackTrace();

        }
    }
}
