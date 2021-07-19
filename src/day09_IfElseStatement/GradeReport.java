package day09_IfElseStatement;

public class GradeReport {
    public static void main(String[] args) {

        int grade = 45;//if it is higher than 100, it will be b

        if( grade>=90 && grade<=100){
            System.out.println("A");
        }else if(grade>=80 ){//grade>=80 && grade<=89-it is same
            System.out.println("B");
        }else if( grade>=70 ){
            System.out.println("C");
        }else if ( grade >=60 ){
            System.out.println("D");
        }else{
            System.out.println("F");
        }













    }
}
