package day33_Methods;

import utilities.ArraysUtility;

public class UniqueElementsFromArray {

    // unique elements from int array
    public static int[] uniqueElements(int[] arr){
        int[] result = {};

        for (int each : arr){
          if(ArraysUtility.frequencyOfElement(arr, each) == 1){
            result =  ArraysUtility.addElement(result,each);
          }
        }
         return result;
    }

    //unique element from double array
    public static double[] uniqueElements(double[] arr){
        double[] result = {};

        for (double each : arr){
            if(ArraysUtility.frequencyOfElement(arr, each) == 1){
                result =  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //unique element from string array
    public static String[] uniqueElements(String[] arr){
        String[] result = {};

        for (String each : arr){
            if(ArraysUtility.frequencyOfElement(arr, each) == 1){
                result =  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //unique elements from char array
    public static char[] uniqueElements(char[] arr){
        char[] result = {};

        for (char each : arr){
            if(ArraysUtility.frequencyOfElement(arr, each) == 1){
                result =  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }




}
/*
 1. create a method that can return the unique elements from the array of integers
            Ex:
                int[] array = {1,1,2,3,3,4};

                unique(array) ==> {2, 4};

    2. create a method that can return the unique elements from the array of double

    3. create a method that can return the unique elements from the array of String

    4. create a method that can return the unique elements from the array of char
 */