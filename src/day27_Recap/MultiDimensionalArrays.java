package day27_Recap;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        String[] scrum1 ={"Danka", "Pero","Mara"};
        String[] scrum2 ={"Srdjo","Raso"};
        String[] scrum3 ={"Kaca","Olja","Maja","Goca"};

        String[][] scrumTeam = {scrum1,scrum2,scrum3}; //length = 3, max ind num = 2;

        System.out.println(Arrays.toString(scrumTeam[0])); //this print first single array in 2D array
        System.out.println(Arrays.toString(scrumTeam[1]));
        System.out.println(Arrays.toString(scrumTeam[2]));

        System.out.println(Arrays.deepToString(scrumTeam));//this prints the whole 2D array

        System.out.println(scrumTeam[0][1]);//it will print Mara, just one element and you do not need any array method to print it

        System.out.println("_______________________________________________________________");

        for (String[] eachScrum: scrumTeam){

            System.out.println(Arrays.toString(eachScrum));

        }

        System.out.println("_________________________________________________________________");

        for ( String[]each : scrumTeam){
            for(String eachMember : each){

                System.out.print(eachMember + ", ");
            }
        }

        // it can be done with for loop as well
        System.out.println();

        int[] nums1 = {1,2,3,4,5}; // swap last and first character

        int temp = nums1[0];//this way we keep first element

        nums1[0] = nums1[4];
        nums1[4] = temp;

        System.out.println(Arrays.toString(nums1));













    }
}
