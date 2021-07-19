package day10_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        int age =25;
        String citizen = "Serbia";
       // boolean isEligible= num>=21;
       // boolean isCitizen = true;
      String isEligible2 =  (age>=18 && citizen=="USA")? " Is eligible"
              :"Is not eligible";

     System.out.println("isEligible2 = " + isEligible2);

     // System.out.println( (age>=18 && citizen=="USA")?"Is eligible":"Is not eligible");

    }
}
