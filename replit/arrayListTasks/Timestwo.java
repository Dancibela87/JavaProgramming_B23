package arrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Timestwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0; i < size; i++) {
        list.add(in.nextInt());
    }

    System.out.println(timesTwo(list));

}
   public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){

        ArrayList<Integer> nums2 = new ArrayList<>();

       for (int each: nums) {
           each = each*2;
           nums2.addAll(Arrays.asList(each));

       }

       return nums2;
   }

}
