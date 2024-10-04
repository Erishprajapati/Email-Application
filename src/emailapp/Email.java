package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "company.com";

    // Constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("User Information: " + this.firstName + " " + this.lastName);

        // Call a method that asks for department and returns department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: " + this.password);

        // Combine elements to generate emails with firstname.lastname@department.company.com format
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +
                (department.equals("None") ? "" : department.toLowerCase()) + companySuffix;
        System.out.println("Your Email is: " + email);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code: ");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        switch (depChoice) {
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            default:
                return "None";
        }
    }

    // Generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int value = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(value);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    // Get mailbox capacity
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    // Get alternate email
    public String getAlternateEmail() {
        return alternateEmail;
    }

    // Get password
    public String getPassword() {
        return password;
    }

    // Show info about the user
    public String showInfo() {
        return "Display Name: " + firstName + lastName +
                "\nCompany Email: " + email +
                "\nMailbox Capacity: " + mailboxCapacity + "mb";
    }
}
