package LibraryManagment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ReturnBook {

    public static void returnBook() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();

        try {
            Connection con = DBConnection.getConnection();

            String sql = "UPDATE books SET status='Available', issued_to=NULL WHERE book_id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, bookId);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Book returned successfully");
            } else {
                System.out.println("Invalid Book ID");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
