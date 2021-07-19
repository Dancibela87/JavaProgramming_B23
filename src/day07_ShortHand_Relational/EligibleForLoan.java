package day07_ShortHand_Relational;

public class EligibleForLoan {
    public static void main(String[] args) {
        String name= "Danka";
        int age = 25;
        int workHistory= 3;
        int creditScore = 550;
        int income = 70000;
        boolean isEligibleForLoan = age>=18 && workHistory>=2 && creditScore>=700
                && income>=60000;

        System.out.println(name +" is eligible for loan: "+ isEligibleForLoan);








    }
}
