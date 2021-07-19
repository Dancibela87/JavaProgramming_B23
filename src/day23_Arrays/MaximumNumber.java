package day23_Arrays;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] numbers ={10,5,4,400,50,0,-1};
        int max =numbers[0];

        for (int i = 0; i <=numbers.length-1 ; i++) {

            int each=numbers[i];

            if(each>max){
                max=each;
            }
        }









    }
}
//find max number form array of int