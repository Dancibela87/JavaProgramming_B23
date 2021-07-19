package day26_ltidimensionalLoop;

import java.util.Arrays;

public class MultidimensionalArrayIntro {
    public static void main(String[] args) {

        //2D ARRAY

        int[][] arr2D = { {1,2,3}, {4,5}, {6,7,8} };

        System.out.println(arr2D.length);// it will be 3

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1] ));//this prints single arrar = 4,5
        System.out.println((arr2D[1][1]));//to print an element you do not need toString /deepToSting method

        for(int i = 0; i< arr2D.length;i++){
        int[]eacch1DArray =arr2D[i];
        for(int j = 0; j<eacch1DArray.length; j++){
            System.out.print(eacch1DArray[j]);
        }
      }


        System.out.println("___________________________________");








    }
}
