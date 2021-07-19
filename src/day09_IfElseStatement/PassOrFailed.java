package day09_IfElseStatement;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PassOrFailed {
    public static void main(String[] args) {
        int score = 50;

        if(score>=60){
            System.out.println("Passed");
        }
        if( score<60){
            System.out.println("Failed");
        }

        System.out.println("____________________________");

        if(score>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }






    }
}
