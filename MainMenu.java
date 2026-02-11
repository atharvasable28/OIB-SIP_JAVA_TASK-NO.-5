package LibraryManagment;

import java.util.Scanner;

public class MainMenu {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- DIGITAL LIBRARY MANAGEMENT ---");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> adminSection();
                case 2 -> CustomerMenu.customerMenu();
                case 3 -> {
                    System.out.println("Thank you for using Library System");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    // ---------------- ADMIN SECTION ----------------

    static void adminSection() {

        System.out.print("Enter Admin Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Admin Password: ");
        String pass = sc.nextLine();

        if (user.equals("admin") && pass.equals("admin123")) {
            System.out.println("Admin login successful");
            adminMenu();
        } else {
            System.out.println("Invalid admin credentials");
        }
    }

    static void adminMenu() {

        while (true) {
            System.out.println("\n--- ADMIN MENU ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Logout");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> AddBook.main(null);
                case 2 -> ViewBooks.viewBooks();
                case 3 -> {
                    System.out.println("Admin logged out");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}


