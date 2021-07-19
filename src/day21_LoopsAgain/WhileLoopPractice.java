package day21_LoopsAgain;

public class WhileLoopPractice {
    public static void main(String[] args) {
        String sen ="Java Java Java Java";
        //



        int countOfJava = 0;

        while(sen.toLowerCase().contains("java")){
           countOfJava++;
           sen=sen.replaceFirst("Java","");
        }
        System.out.println(countOfJava);








    }
}
