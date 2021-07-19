package day15_String;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        double num1 = scan.nextDouble();

        System.out.println("Enter math operator:");
        char mathOperator = scan.next().charAt(0);
       // String math = scan. next();

        System.out.println("Enter your second number:");
        double num2 = scan.nextDouble();
        double result =0;

        switch (mathOperator){
            case '-':
                result = num1-num2;
                break;
            case '+':
                result= num1 + num2;
                break;
            case '*':
                result = num1* num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Invalid operator");


                 


        }
        System.out.println("result = " + result);
        




    }
}
