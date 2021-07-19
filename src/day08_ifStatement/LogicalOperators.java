package day08_ifStatement;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println(!true);//false with !
        System.out.println(!false);//true printed 

        System.out.println(true == false);//false
        System.out.println(true == !false);//true

        System.out.println(true != !true);//true
                              // != does not equal

        System.out.println("_________________");
        
        
        int score = 80;
        boolean passed = score >=60;
        boolean failed = !passed;// ==> =score>= 60;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("___________");
        
        int age = 21;
        boolean Eligible = age >= 21;
        boolean isNotEligible = !Eligible;

        System.out.println("Eligible = " + Eligible);
        System.out.println("isNotEligible = " + isNotEligible);

        





    }
}
