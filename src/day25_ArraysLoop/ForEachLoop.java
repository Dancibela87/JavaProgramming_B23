package day25_ArraysLoop;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] num= {1,2,3,4,5};

        for (int i = 0; i < num.length; i++) {

        }

        System.out.println("________________________________");

           //FOR EACH LOOP

        for ( int each : num) {  //represent each elements of array

            System.out.print(each+" ");
        }

        System.out.println();

        System.out.println("________________________________");

        String[] names = {"Danka","Petar","Mara","Srdjo","Raso"};

        for (String each: names) {
            System.out.print(each+" ");
        }








    }
}
