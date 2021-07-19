package day27_Recap;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

       //  int[] array;  it can not be just declared, it has to be initialized or the size has to be declared

        int array[] = new int [2];
        array[0] = 10;
        array[1] = 20;

        array = new int [4];//now we lost previous array values, it will print just 0,0,30,40
        array[2]=30;
        array[3]=40;

        //this formed two different objects

        //you can not store more than two elements since size is fixed

        System.out.println(Arrays.toString(array));


        int num [] ={1,2,3,4,5,6,7,8,9,10};

        System.out.println(num.length); //this length is not String method, it is variable.
        System.out.println(num[0]);//prints first element
        System.out.println(num[num.length-1]);//prints last character

       // System.out.println(num[200]); it gives exception, so you wont will be able to print anything after that

        for (int i = 0; i < num.length; i++) {

            System.out.print(num[i]+" ");
        }

        for (int i = num.length-1; i >= 0 ; i--) {

            System.out.print(num[i] +" ");

        }
















    }
}
