package methods;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        plus();



    }

    public static void plus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = scan.nextInt();
        System.out.println("enter second number:");
        int num2 = scan.nextInt();

        int result = num1 + num2;
        System.out.println("result: "+result);

   scan.close();

    }

}
/*
Implement the plus method. The return type is void and has no arguments.

The method should ask the user to input two numbers, then it will add them and print the result.

Hint: Create a scanner within plus method.
 */