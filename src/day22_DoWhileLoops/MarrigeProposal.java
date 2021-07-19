package day22_DoWhileLoops;

import java.util.Scanner;

public class MarrigeProposal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in);
        System.out.println("Will you marry me?");
        String answer = scan.next().toLowerCase();

        while(!(answer.equals("yes")|| answer.equals("no"))){
            System.out.println("Invalid entry, please try again:");
            answer=scan.next().toLowerCase();
        }

        if(answer.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("I am sad");
        }






scan.close();






    }
}
