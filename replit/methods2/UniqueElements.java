package methods2;

import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE
        int element;
        for (int i = 0; i < nums.length; i++) {
            element = nums[i];
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == element) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println( element );
            }


        }

    }}