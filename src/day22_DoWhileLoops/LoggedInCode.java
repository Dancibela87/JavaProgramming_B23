package day22_DoWhileLoops;

import java.util.Scanner;

public class LoggedInCode {
    public static void main(String[] args) {

        String correctUsername = "cybertek";
        String correctPassword ="cybertek12345";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username;");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if(u.equals(correctPassword) && p.equals(correctPassword)){
            System.out.println("Logged in");
        }else {

            for (int i = 1; i <=2; i++) {
                System.out.println("Username or password is incorrect. Please, reenter");
                System.out.println("Enter your username;");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();

                if(u.equals(correctPassword) && p.equals(correctPassword)) {
                    System.out.println("Logged in");
                    break;
                }

                if(i==2){
                    System.out.println("Your account is locked");
                    System.exit(0);
                }
            }


        }







scan.close();






    }
}
/*
 You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: cybertek
                        password: cybertek12345

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                 to enter correct credentials and if all three attempts are failed,
                  then print "Your account is lucked."
 */