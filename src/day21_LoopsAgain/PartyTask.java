package day21_LoopsAgain;

import java.util.Scanner;

public class PartyTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter guest name:");
        String name = input.next();

        while(true){

            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();
            if(answer.equalsIgnoreCase("no")){
                break;
            }
            System.out.println("Please enter guest name:");
            String guestName=input.next();
            name+=", "+guestName;

        }


        System.out.print("Guest's list: "+name);


input.close();




    }
}
