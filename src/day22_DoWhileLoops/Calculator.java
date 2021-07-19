package day22_DoWhileLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n1;
        int n2;
        char operator;
        String answer ="";

        while(!answer.equals("no")){
            System.out.println("Enter two numbers:");
            n1 = scan.nextInt();
            n2 = scan.nextInt();

            System.out.println("Enter mathematical operator:");
            operator = scan.next().charAt(0);
            if(operator=='-'){
                System.out.println("substraction: "+(n1-n2));
            }else if(operator=='+'){
                System.out.println("addition: "+(n1+n2));
                }else if(operator=='*'){
                System.out.println("multiplication: "+(n1*n2));
            }else if(operator=='/'){
                System.out.println("division: "+(n1/n2));
            }else{
                System.out.println("Invalid operator");
            }
            System.out.println("Do you want to continue?");
            answer = scan.next().toLowerCase();

           while( !(answer.equals("yes") || answer.equals("no")) ) {
               System.out.println("Do you want to continue?");
               answer = scan.next().toLowerCase();
           }

        }








scan.close();







    }

}
