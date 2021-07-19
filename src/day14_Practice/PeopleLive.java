package day14_Practice;

import java.util.Scanner;

public class PeopleLive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many people you live with:");
        int num = scan.nextInt();//if you use switch and variable just once
                                //than you do not have to declare it
                                 // just to put scan.nextInt() in condition

        if(num<3){
            System.out.println("Lives with less than 3 people");
        }else if(num<6){
            System.out.println("Live with 3-6 people");
        }else {
            System.out.println("Lives with more than 6 people");
        }
        //do it as switch as well






scan.close();

    }
}
/*
Ask the user how many people they live with?
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */