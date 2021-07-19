package day07_ShortHand_Relational;

public class IsEligibleToVote {
    public static void main(String[] args) {

        String name = "Danka Pavlovic";
        int age = 34;
        String citizen = "USA";

       boolean isEligibleToVote = age>=18 && citizen == "USA";

        System.out.println(name +" Is eligible to vote: "+ isEligibleToVote);









    }
}
