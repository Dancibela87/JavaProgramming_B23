package day14_Practice;

import java.util.Scanner;

public class SchoolType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your grade:");
        byte grade = scan.nextByte();
         String gradeLevel="";

         if(grade>=1 && grade<=18){

             gradeLevel=(grade<=5)? "elementary school":(grade<8)?"middle school"
                     :(grade<12)?"high school":(grade<16)?"college"
                     :"grad school";//not readable!!!

         }else{
             gradeLevel="Invalid";
         }

        System.out.println("gradeLevel = " + gradeLevel);








scan.close();



    }
}
/*
 Given a number(byte) grade level determine and print
 which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    Other: Invalid grade level given

 */