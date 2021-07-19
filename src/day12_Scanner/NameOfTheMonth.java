package day12_Scanner;

import java.util.Scanner;

public class NameOfTheMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month number:");
        int month = input.nextInt();

        if(month>=1&& month<=12){
            if(month==1){
                System.out.println("Jan");
            }else if (month==2){
                System.out.println("Feb");
            }else if (month==3){
                System.out.println("March");
            }else if (month==4){
                System.out.println("April");
            }else if (month==5){
                System.out.println("May");
            }else if (month==6){
                System.out.println("jun");
            }else if (month==7){
                System.out.println("July");
            }else if (month==8){
                System.out.println("August");
            }else if (month==9){
                System.out.println("Sep");
            }else if (month==10){
                System.out.println("Oct");
            }else if (month==11){
                System.out.println("Nov");
            }else if (month==12){
                System.out.println("Dec");
            }
        }else{
            System.out.println("Invalid entry");
        }







    }
}
