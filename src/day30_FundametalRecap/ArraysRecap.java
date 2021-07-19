package day30_FundametalRecap;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysRecap {
    public static void main(String[] args) {
        /*
        Arrays - collection of data. It is data structure. It is different than others by its fixed size.
               - we use it when we have fixed number of data.
               - declaring it:
                   1. declaring just size    - int[] arr = new int[8]; contains 8 elements
                   2. declaring the elements - int[] arr = {1,2,3,4,5,6,7,8};

         */

        String[] items = {"apples","eggs","milk","chicken","papers"}; // instead of declaring 5 separated Strings.
        System.out.println(Arrays.toString(items));

        String [] items2 = new String[5];
        items2[3]="milk";
        items2[4] ="apple chicken";
        System.out.println(Arrays.toString(items2));//it will print null, since we do not know the elements of it, just the size.

        for (int i = 0; i < items2.length; i++) {
            System.out.print(items2[i] + i);    //merge - null0null1null2milk3null4
            // System.out.print(i);             //0 1 2 3 4
            // System.out.println(items2[i]);   //nulls
        }

        System.out.println();

        int[] nums = {10,20,30,40,50};
        int[] result = new int[nums.length];

        for (int i = nums.length-1,j=0; i >=0 ; i--,j++){
            //System.out.print(nums[i]+" "); this prints them in reversed order
           result[j] = nums[i];     //this assigns it to new array
        }
        System.out.println(Arrays.toString(result));

        String[] names1 = {"danka","maja","petar"};
        String [] names2 ={"bojan","veljko","kaca","olja"};
        String [] merged = new String[names1.length+ names2.length];
        int k = 0;

        for (int i = 0; i < names1.length; i++) {
           merged[k++] = names1[i];

        }
        System.out.println(Arrays.toString(merged));

        for (int j = 0; j < names2.length; j++) {
            merged[k++] = names2[j];

        }
        System.out.println(Arrays.toString(merged));

        //same task with for each loop
        int i = 0;
        for(String name: names1) {
            merged[i++] = name;
        }
        for (String name: names2){
            merged[i++] = name;
        }
        System.out.println(Arrays.toString(merged));

        System.out.println();
        int[] ns = {1,2,4,5};
        int max =ns[0];
        int min =ns[0];

        for (int number:ns) {
            max = Math.max(number,max);
            min = Math.min(number,min);

        }
        System.out.println(max+", "+min);






    }
}