package day23_Arrays;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

         //TO STRING METHOD- we use it when we want to print entire array

        int[] array ={1,2,3,4,5};
        System.out.println(array);//gives hashcode
        System.out.println(  Arrays.toString(array) );

        String[] array2 =new String[5];
        System.out.println(Arrays.toString(array2));

        //default value

        int[] nums = new int[5];
        System.out.println(Arrays.toString(nums));

        //SORT() METHOD = sorting in ascending order

        String[] students = {"Danka", "Cilica", "Pero", "Badovan"};

        System.out.println(Arrays.toString(students));//prints in index order

        Arrays.sort(students);//should sort them smaller form bigger, it checks the letter
        System.out.println(Arrays.toString(students));


        int[] numbers = {9,10,5,8,17,-1,4};//we can use it when we have to find a max number

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Minimum number is: " + numbers[0]);
        System.out.println("Maximum number is: " + numbers[numbers.length-1]);
        // you wont be allowed to use it at the interview. It is too simple.

        char[] chars ={'a', 'b', 'z', 'c', 'y', 'x'};
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        //EQUALS METHOD - comparing two arrays. they have to have same elements in same order

        int[] num1 ={1,2,3};
        int[] num2 = {1,2,3};

        int[] num3 = {1,3,2};
        int[] num4 ={2,3,1};

        boolean r1 = Arrays.equals(num1, num2);
        System.out.println(r1);

        boolean r2 =Arrays.equals(num1, num3);
        System.out.println(r2);

        Arrays.sort(num3); // they are different, but after sorting them , they will be the same
        Arrays.sort(num4);
        boolean r3 =Arrays.equals(num3, num4);
        System.out.println(r3);

















    }
}
