package day08_ifStatement;

public class IsEligibleToVote {
    public static void main(String[] args) {
        String name = "Danka";
        int age = 15;
        String citizen = "USA";

        boolean eligible = age>=21 && citizen == "USA";
        if(eligible){
            System.out.println(name + " is eligible to vote.");
        }

        if(!eligible){
            System.out.println(name + " is  not eligible to vote.");
        }










    }






}
