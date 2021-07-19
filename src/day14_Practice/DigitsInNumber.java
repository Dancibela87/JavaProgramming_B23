package day14_Practice;

import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number between 1 and 100000:");
        int n = scan.nextInt();

        if(n>=1 && n<=100000){
            if(n<=9){
                System.out.println("1 digit");
            }else if( n<=99){
                System.out.println("2 digits");
            }else if( n<= 999){
                System.out.println("3 digits");
            }else if(n<= 9999){
                System.out.println("4 digits");
            }else if(n<=99999){
                System.out.println("5 digits");
            }else {
                System.out.println("6 digits");
            }

        }else {
            System.out.println("Invaid number");
        }
     /*
     You can make this in one print statement as well. You just have to
     assign result to string value and put it instead of each print statement.
      */





scan.close();

    }
}
/*
determine how many digits is in the number
1 and 100000
 */