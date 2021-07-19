package day08_ifStatement;

public class SingleIfStatement {
    public static void main(String[] args) {

         String name = "Muhtar";
        int score = 45;
        boolean passed = score >=60;// makes it reusable.if(passed)...

        if (passed){//if student passed the exam
            System.out.println(name +"  passed the exam");}
        /*
        since condition is not true, the print statement wont be printed to console
         */

       if(!passed){//if student failed the exam
        System.out.println(name + " failed the exam");}














    }
}
