package day37_ClassAndObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BreakfastTask {
    public static void main(String[] args) {

        //swap
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,5,7,8,8));
        Collections.swap(nums,0,nums.size()-1);
        System.out.println(nums);

        //unique element
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(5,5,8,0,0,12,3,3,4,8,9));
        int firstUnique = 0;

        for (Integer each: nums1) {
            if(Collections.frequency(nums1,each)==1){
                firstUnique = each;
                break;
            }
        }
        System.out.println(firstUnique);

        /*
        Another approach would be to create new arrayList and store all unique elements in new arraylist,
        using removeIf method. Than you just print the first element from arrayList.
         */


        //frequency
        String str = "AABBBCCDDEE";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String result = "";
        for(int i = 0; i< list.size(); i++){
            int num = Collections.frequency(list, list.get(i));
            if(!result.contains(list.get(i))){
                result+=list.get(i)+num;
            }
        }
        System.out.println(result);

        //largest number
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(10,22,22,6,12,9,8));
       // Collections.sort(nums2); //ascending order
       // Collections.reverse(nums2);  //descending order

        //5th max number - so you have to call max method for five times
        int n = 5;
        for (int i = 1; i < n; i++) {
            nums2.removeIf(p -> p == Collections.max(nums2));
        }

        int maxNum =  Collections.max(nums2);
        System.out.println(maxNum);






    }
}
/*
 write a program that can swap the first and last elements of an ArrayList

2. write a program that can return the first unique elements of an ArrayList

3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

4. Write a program that can return the nth largest number from an ArrayList of integers
 */