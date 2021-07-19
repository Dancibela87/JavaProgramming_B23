package day23_Arrays;

public class MinimumNumber {
    public static void main(String[] args) {

        int[] numbers ={10,5,4,400,50,1};
        int min =numbers[0];

        for (int i = 0; i <=numbers.length-1 ; i++) {

            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(min);






    }
}
//find min number from array of int