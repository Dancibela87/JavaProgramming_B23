package day10_IfStatements;

public class TernaryPracticeTwo {
    public static void main(String[] args) {
        int num =100;


       String result = (num>0)?"positive":(num<0)?"negative":"zero";
       
        System.out.println("________________________-");
        
        int score = 55;

            char grade = (score >= 90) ? 'A' : (score > 80) ?
                    'B' : (score > 70) ? 'C' : (score > 60) ? 'D' : 'F';

        System.out.println("grade = " + grade);


        










    }
}
