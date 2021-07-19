package day26_ltidimensionalLoop;

public class CommonElementsFromArrays {
    public static void main(String[] args) {

       int[] arr1 = {1,2,3,4,5};
       int[] arr2 = {4,5,6,7,8,9,10,11};


      for (int element : arr2){

        for (int each : arr1) {//represents each element in arr1
            if (each == element) {
                System.out.print(each+", ");
            }
        }
        }

        System.out.println("_______________________________________");

        for (int i = 0; i < arr2.length; i++) { //i is each index of each element in array

            for (int j = 0; j < arr1.length; j++) {  //j is index of elements in first array

                if(arr2[i] == arr1[j]){  // you can print either i or j
                    System.out.print(arr2[i]+", ");

                  //  break; - prints both

                }//break; - it wont print them at all

            }   //break;  - if you put this it prints just first common character. WHY?

        }

        //it does not matter which one is longer, and it does.
        //not matter which one is outer and which one is inner loop.
        //it is just in this case.

        //we can compare from the last as well, it does not matter as long as we compare all of them















    }
}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

          solution 1:
              DO NOT use for each loop

          solution 2:
              MUST use for each loops
 */