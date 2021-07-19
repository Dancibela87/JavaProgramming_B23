package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Shiftleft {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }

        int[] leftShift = new int[nums.length];
        int j = 0;
        for (int i = 1; i < nums.length; i++) {

            leftShift[i-1]= nums[i];

        }

        leftShift[leftShift.length-1] = nums[0];
        System.out.println(Arrays.toString(leftShift));


scan.close();

    }
}
