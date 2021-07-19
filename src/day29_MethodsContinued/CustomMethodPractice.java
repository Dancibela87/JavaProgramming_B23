package day29_MethodsContinued;

import java.util.Arrays;

public class CustomMethodPractice {
    public static void main(String[] args) {

        positiveNegativeZero(5);

        System.out.println("________________________________________");

        int[] num = {10,20,0,-30,-5};

        for (int i = 0; i < num.length; i++) {
            positiveNegativeZero(num[i]);

        }

        combTwoArrays(new int[]{1,2,3} ,new int[]{4,5,6});
        fullName("danKa","paVLOvic");
        maxNumber(6,8);
        descendingOrderOfArray(new int[] {5,3,7,1,2});

    }

    public static void positiveNegativeZero(int num){

        if(num<0){
            System.out.println("negative ");
        }else if(num==0){
            System.out.println("zero");
        }else{
            System.out.println("positive");
        }
    }
    public static void combTwoArrays(int[] arr1,int[] arr2){

        int[] arr3 = new int [arr1.length + arr2.length];
        int j = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[j++]=arr2[i];

        }
        System.out.println(Arrays.toString(arr3));
    }
    public static void fullName (String firstName, String lastName){

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(firstName+" " +lastName);

    }
    public static void maxNumber(int num1, int num2){
        if(num1>num2){
            System.out.println(num1 +" is max number");
        }else if(num2>num1){
            System.out.println(num2 + " is max number");
        }else{
            System.out.println(num1+" and "+num2 + " are even numbers");
        }
    }
    public static void descendingOrderOfArray(int[] arr){

        Arrays.sort(arr);

        int[] reversedArray = new int[arr.length];

        for (int i = arr.length-1,j = 0 ; i >= 0 ; i--,j++) {
            reversedArray[j] = arr[i];
        }
            System.out.println(Arrays.toString(reversedArray));


        }

}




/*
1. create a function that can check if the given integer is positive, negative or zero

2. create a function that can print out the combination of two integer arrays

3.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYbErTeK", "SCHOOL");

                output:
                    "Cybertek School"
4. create a function that can print out the maximum number between two numbers

5. create a function that can print out the array of integers in descending order
 */