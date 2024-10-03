package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "aey@company.com";

    // Constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
      System.out.println("Email has been created: " + this.firstName + " " + this.lastName );

        // Call a method that asks for department and returns department
        this.department = setDepartment(); // Department asking to enter the information
        System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: " + this.password);

        //combining elements to generate emails with firstname.lastname@department.company.com in these formats
        email = firstName.toLowerCase() + " " + lastName.toLowerCase() + "@" + department +"." + companySuffix;
        System.out.println("Your Email is :" + email);
    }

    // Ask for the department
    private String setDepartment(){
        System.out.print("Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code: ");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        if(depChoice == 1){
            return "Sales";
        } else if(depChoice == 2){
            return "Development";
        } else if(depChoice == 3){
            return "Accounting";
        } else {
            return "None";
        }
    }

    // Generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            // Generate random number
            int value = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(value);
        }
        return new String(password);
    }

    // Set the number of mails that can be sent/received
    // Set the alternate email
    // Change the password
}
