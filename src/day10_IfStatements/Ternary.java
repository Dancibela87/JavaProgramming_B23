package day10_IfStatements;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
        String result="";
         if(num%2==0){
            result="Even";
        }else{
            result="Odd";
        }

        System.out.println("_________________________");

       String result2 =  (num%2==0)? "Even":"Odd";
        System.out.println("result2 = " + result2);









    }
}
