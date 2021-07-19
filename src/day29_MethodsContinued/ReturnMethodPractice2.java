package day29_MethodsContinued;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {

        System.out.println( grades(120) );//any data can put in print statement
        String r = grades(100);
        System.out.println(r);


    }
    /*
    public static void grade(int score){

        if(score > 100 || score < 0){
            System.out.println("Invalid score");
            return;//exits method, what comes after wont be executed
        }
        if(score>=90){
            System.out.println("A");
        }else if(score>=80){
            System.out.println("B");
        }else if(score>=70){
            System.out.println("C");
        }else if(score>=60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }*/
    public static String grades(int score){

        String result="Invalid";//instead of giving else block at the end
        /*
        the statement will be executed if this is not valid
         */

        if(score>=0 && score<=100){

          result = (score>=90)? "A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";

        }





        return result;

    }



}
