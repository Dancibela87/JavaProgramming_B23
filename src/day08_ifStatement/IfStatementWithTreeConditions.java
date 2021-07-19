package day08_ifStatement;

public class IfStatementWithTreeConditions {
    public static void main(String[] args) {

        int num = 100;
        boolean positive = num>0;
        boolean negative = num<0;
        boolean zero = !positive && !negative;// num==0;

        if(positive){
            System.out.println(num + " is positive");
        }

        if(negative){
            System.out.println(num + " is negative");
        }
        if(zero){
            System.out.println(num + " is zero");
        }
        //just one true will be printed out









    }
}
