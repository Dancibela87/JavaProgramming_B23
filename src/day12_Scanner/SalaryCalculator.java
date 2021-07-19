package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter hourly rate:");
       double hourlyRate = input.nextDouble();

        System.out.println("Enter hours of week: ");
        int weeklyHours = input.nextInt();

        System.out.println("How many weeks per year you work?");
        int weeks = input.nextInt();
        
        double salary = hourlyRate * weeklyHours * weeks;
        System.out.println("You are making &"+hourlyRate+ " per hour");
        System.out.println("You work "+weeklyHours+" hours per week");
        System.out.println("salary = " + salary);
        
        
        
        
        
        
        
    }
    
    
    
    
    
}
/*
hourly rate
hours of week
how many weeks in a year

 */