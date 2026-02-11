package LibraryManagment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddBook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO books (book_id, title, author, status, issued_to) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setString(3, author);
            ps.setString(4, "Available");
            ps.setString(5, null);   // issued_to is empty initially

            ps.executeUpdate();
            System.out.println("Book added successfully");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

