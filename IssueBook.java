package LibraryManagment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class IssueBook {

    public static void issue() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        try {
            Connection con = DBConnection.getConnection();

            String sql = "UPDATE books SET status='Issued', issued_to=? WHERE book_id=? AND status='Available'";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, bookId);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Book issued successfully");
            } else {
                System.out.println("Book not available");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
