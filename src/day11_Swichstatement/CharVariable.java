package day11_Swichstatement;

public class CharVariable {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("Excellent");

            case 'B':
                System.out.println("Great job");

            case 'C':
                System.out.println("Good");

            case 'D':
                System.out.println("Passed");

            case 'F':
                System.out.println("Failed");

            default:
                System.out.println("Invalid grade");







        }







    }
}
/*
3. a char variable named grade is given.
use switch statement to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

 */