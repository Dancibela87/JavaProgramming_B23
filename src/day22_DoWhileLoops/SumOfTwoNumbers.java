package day22_DoWhileLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result =0;

    while(true){
        System.out.println("Enter numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        result =num1+num2;
        System.out.println("result = " + result);;

        System.out.println("Do you want to continue?");
        String answer = scan.next();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Enter numbers:");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            result=num1+num2;
            System.out.println("result = " + result);;
           System.out.println("Do you want to continue?");
           answer = scan.next();
        }else{
            break;

        }


    }



scan.close();





    }
}
/*
write a program that will ask user to enter two numbers and
calculates the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
 */