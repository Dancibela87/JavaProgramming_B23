package methods2;

import java.util.Scanner;

public class FindErrorString {
    public static boolean isError(String line) {

        boolean isError = true;

        if(line.substring(0,5).equals("error")){
            return true;
        }else{
            return false;
        }





    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isError(in.nextLine()));
    }

}
/*
The isError method checks if the given String begins with error

The method will return true if the String starts with error otherwise it will return false
 */