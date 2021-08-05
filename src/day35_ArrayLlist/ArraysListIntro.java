package day35_ArrayLlist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListIntro {
    public static void main(String[] args) {
        //it can not be used with primitives
        //ArrayList <data type> name = new ArrayList<datatype>();

        int[] arr = new int[10];  //size is 10 and it is fixed
        System.out.println(arr[2]);
        System.out.println(Arrays.toString(arr));
         //ADD / GET METHODS
        ArrayList <Integer> numbers = new ArrayList<>(); //size is zero, it will increase when you add element
        numbers.add(10); // this added the element index number =0
        numbers.add(20);// in num = 1
        numbers.add(30);// 2
        numbers.add(40);//3
        numbers.add(3, 15);//removes element at index one and shift to the next index and 15 is added to 1

        //they are added in index order

        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println(numbers.size()); // return the total number of elements
                                            //you get the last index number but subtracting one from size

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i)+" ");

        }
        System.out.println();

        for(Integer each : numbers){
            System.out.print(each + " ");
        }













    }
}
