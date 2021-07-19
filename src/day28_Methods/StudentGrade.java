package day28_Methods;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you score");
        studentsGrades(scan.nextInt());

    }

    public static void studentsGrades(int score){

        if(score>=90 && score<=100){
            System.out.println("Grade is A'");
        }else if(score>=80){
            System.out.println("Grade is B");
        }else if(score>=70){
            System.out.println("Grade is C");
        }else if(score>=60){
            System.out.println("Grade is D");
        }else{
            System.out.println("You failed");
        }
    }






}
/*
6. calculate the garde of the student based on the score

 */