package LibraryManagment;

import java.util.Scanner;

public class CustomerMenu {

    public static void customerMenu() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- CUSTOMER MENU ---");
            System.out.println("1. View All Books");
            System.out.println("2. Search Book by Title");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> ViewBooks.viewBooks();
                case 2 -> SearchBook.searchByTitle();
                case 3 -> IssueBook.issue();
                case 4 -> ReturnBook.returnBook();
                case 5 -> {
                    System.out.println("Exiting Customer Menu");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
