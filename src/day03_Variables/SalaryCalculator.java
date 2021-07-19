package day03_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeeksInAYear = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeksInAYear;

        System.out.println(salary);

        double taxRate = 0.32;
        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println(salaryAfterTax);


    }
}
