package day29_MethodsContinued;

public class MaxMinNum {
    public static void main(String[] args) {


        int[] array = {1,25,8,18,-5,200,3};
        int min = minNum(array);
        System.out.println(min);
        int max = maxNum(array);
        System.out.println(max);

    }

    public static int minNum(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxNum(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;

    }
}