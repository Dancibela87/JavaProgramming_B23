package MethodsOverloading;

public class FrequencyOfTheElementrInArray {


    // returns frequency of int in int array
    public static int frequency(int[] arr, int element){

        int frequency=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                frequency++;
            }

        }
        return frequency;
    }

    //frequency od double in double array
    public static int frequency(double[] arr, double element){

        int frequency=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                frequency++;
            }

        }
        return frequency;
    }

    //frequency of String in String array
    public static int frequency(String[] arr, String element){

        int frequency=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(element)){
                frequency++;
            }

        }
        return frequency;
    }

    //frequency of char in char array
    public static int frequency(char[] arr, char element){

        int frequency=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                frequency++;
            }

        }
        return frequency;
    }
}
