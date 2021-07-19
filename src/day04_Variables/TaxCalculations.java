package day04_Variables;

public class TaxCalculations {
    public static void main(String[] args) {

        int salary = 100000;
        double stateTax = 0.08;
        double federalTax = 0.21;
        double totalStateTAx = salary * stateTax;
        double totalFederalTAx = salary * federalTax;
        double salaryAfterTax = salary - totalStateTAx- totalFederalTAx;

       //you need to pay  amount of state Tax

        System.out.println("My salary is $"+salary);
        System.out.println("I need to pay $"+totalStateTAx + " of state tax.");
        System.out.println("I need to pay $"+totalFederalTAx + " of federal tax");
        System.out.println("My take home salary is $"+ salaryAfterTax);







    }






}
