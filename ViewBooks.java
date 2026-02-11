package LibraryManagment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewBooks {

    public static void viewBooks() {

        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM books");

            System.out.println("ID | Title | Author | Status | Issued To");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("book_id") + " | " +
                        rs.getString("title") + " | " +
                        rs.getString("author") + " | " +
                        rs.getString("status") + " | " +
                        rs.getString("issued_to")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
