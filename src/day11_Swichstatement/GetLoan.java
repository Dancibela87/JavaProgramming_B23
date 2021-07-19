package day11_Swichstatement;

public class GetLoan {
    public static void main(String[] args) {
        int salary=50_000;
        int creditScore= 660;
        String result="";
        
        result=(salary>60000 && creditScore>650)? "Loan approved": "Loan denied";

        System.out.println("result = " + result);








    }
}
/*
Given two values: yearly salary and credit score determine 
if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
             NOTE: MUST APPLY TERNARY
 */