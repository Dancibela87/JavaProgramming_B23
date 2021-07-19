package day28_Methods;

import java.util.Scanner;

public class PracticeTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two number:");
        oddNumbers(scan.nextInt(), scan.nextInt());

        System.out.println("Enter numbers:");
        evenNumbers(scan.nextInt(), scan.nextInt());

        System.out.println("What year you were born:");
        ageOFPerson(scan.nextInt());

        eligibleToVote(25,true);  //do this with scanner later

        calculateTWoNumbers(5,'+',10);



    scan.close();
    }

    public  static  void oddNumbers(int from,int to){
        for (int i = from; i < to; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }//this way you can give any numbers
    public  static  void evenNumbers(int from,int to){
        for (int i = from; i < to; i++) {
            if(i%2!=0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }
    public static void ageOFPerson(int year){

        System.out.println("You are " + (2021 - year));
    }
    public static void eligibleToVote(int age, boolean isCitizen){


        if(age>=21 && isCitizen){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }
    public static void calculateTWoNumbers(int num1, char operator, int num2){

       switch (operator){
           case '+':
               System.out.println(num1 + num2);
               break;
           case'-':
               System.out.println(num1 - num2);
               break;
           case'*':
               System.out.println(num1 * num2);
               break;
           case'/':
               System.out.println(num1 / num2);
               break;
           case'%':
               System.out.println(num1 % num2);
               break;
           default:
               System.out.println("Invalid operator");
               break;


       }

    }
}



/*
1. create a method that can print odd numbers between any two numbers in a same line seperated by space

    2. create a method that can print even numbers between any two numbers

    3. create a method that can calculate the age of the person

    4. check eligibility to vote
 */