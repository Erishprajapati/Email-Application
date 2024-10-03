package emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for the first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Ask user for the last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Create Email objects with user input
        Email em1 = new Email(firstName, lastName);


        // Show information for both emails
        em1.showInfo();
//        em2.showInfo();

        // Close the scanner
        scanner.close();
    }
}
