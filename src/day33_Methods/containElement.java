package day33_Methods;

public class containElement {
    
    
    //if int array contains int element
    public static boolean containsElement(int[] arr, int element) {
        for (int each : arr) {
            if (each == element) {
                return true;
            }
        }

        return false;

    }
    
    //if double array contains double number 
    public static boolean containsElement(double[] arr, double element) {
        for (double each : arr) {
            if (each == element) {
                return true;
            }
        }

        return false;

    }

    //if string array containts and string
    public static boolean containsElement(String[] arr, String element) {
        for (String each : arr) {
            if (each.equals(element)) {
                return true;
            }
        }

        return false;

    }

    //if char array contains char
    public static boolean containsElement(char[] arr, char element) {
        for (char each : arr) {
            if (each==element) {
                return true;
            }
        }

        return false;

    }



}