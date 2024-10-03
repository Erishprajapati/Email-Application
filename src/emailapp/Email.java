package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //constructor to recieve the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email has been created " + this.firstName + " " + this.lastName );

        //call a method that ask for department and return department
        this.department = setDepartment(); //department asking to enter the information
        System.out.println("Department " + this.department);
    }

    //ask for the department
    private String setDepartment(){
        System.out.print("Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter Department Code:");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        if(depChoice == 1){
            return"sales";
        }else if(depChoice == 2){
            return "Development";

        }else if(depChoice == 3){
            return "Accounting";
        }else{
            return" ";
        }
        //call a method that returns random password
    }

    //generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%*";
        char[] password = new char[length];
        for (int i =0; i<length; i++){
            //generate random number
          int value =   (int) (Math.random() * passwordSet.length();
          password[i] = passwordSet.charAt(value);

        }
        return new String (password);
    }

    //set the number of mail that can be sent/received
    //set the alternate email
    //change the password

}
