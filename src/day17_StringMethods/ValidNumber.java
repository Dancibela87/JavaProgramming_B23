package day17_StringMethods;

import java.util.Scanner;   //do it with switch as well

public class ValidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account number:");
        String accountNumber= scan.next();

        if(accountNumber.length()==7 || accountNumber.length()==10){

            if(accountNumber.charAt(0) == '2' && accountNumber.length()==7) {
                System.out.println("Valid");

            }else if(accountNumber.charAt(0)== '5' && accountNumber.length()==10){
                System.out.println("Valid");

            }else{
                System.out.println("Invalid");
            }

        }else{
            System.out.println("Invalid");
        }














scan.close();

    }
}
/*
Ask the user enter an account number (String).
Check if these account number is valid.
    > If the account number begins with a “2” and  account number is 7 characters long is valid
    > If the account number begins with a “5” and account number is 10 characters long is valid
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths
    do not meet the expected results print “Invalid account number”

 */