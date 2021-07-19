package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        float diverceCode =0;
        float sum =0;
        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter score for judge "+(i+1)+":");
            score[i] = input.nextFloat();
            sum += score[i];

        }
        Arrays.sort(score);
        System.out.println("Enter dificulty:");
        float difficulty = input.nextFloat();
        float totalSum = sum - score[0] - score[score.length-1];

        if (difficulty >= 1.2 && difficulty <= 3.8){
            diverceCode = totalSum * difficulty *0.6f;
        }


        System.out.println("Total: "+ diverceCode);






input.close();


    }
}
/*In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.

        The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then multiplied by the degree of difficulty for that dive.

        The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.

        Flow:

        Accept the 7 scores from the judges
        Accept the difficulty number
        Display the final score
*/