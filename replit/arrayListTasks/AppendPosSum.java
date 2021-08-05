package arrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AppendPosSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums) {
        int sum = 0;
        ArrayList<Integer> nums2 = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && nums.get(i)>0) {
                sum += nums.get(i);
                nums2.addAll(Arrays.asList(nums.get(i)));
            }

        }
        nums2.add(sum);

       return nums2;
    }
}


