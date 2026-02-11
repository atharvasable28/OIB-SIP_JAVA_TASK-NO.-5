package LibraryManagment;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {
            // MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/librarydb",
                "root",
                "Atharva@28"
            );

            System.out.println("Connected to MySQL Database");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
