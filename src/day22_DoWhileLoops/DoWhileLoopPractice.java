package day22_DoWhileLoops;

import java.util.Scanner;

public class DoWhileLoopPractice {
    public static void main(String[] args) {

        int i = 0;
        int sum =0;

        do{
            if(i%2==0){
                sum+=i;
            }
            i++;
        }while(i<=10);

        System.out.println("sum = " + sum);

        System.out.println("__________________________");
        Scanner scan = new Scanner(System.in);

        String username = "Jhon";
        String password ="Jhon123";

        String u ="";
        String p ="";

        do{
            System.out.println("Enter username:");
            u = scan.next();

            System.out.println("Enter your password:");
            p =scan.next();


        }while(!(u.equals(username) && p.equals(password)));

        System.out.println("Logged in");













    }
}
