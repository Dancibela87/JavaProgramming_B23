package day23_Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] group1 ={"Danka", "Zorana", "Jelena", "Zulpikar"};

        //          index: 0         1         2          3

        //retrieve from array:
        System.out.println(group1[0]);
        System.out.println(group1[1]);//it will print zorana, name under that index number
        System.out.println(group1[2]);
        System.out.println(group1[3]);//Zulpikar

        System.out.println("__________________________________");

        //if you want to print all data you use loop

        for (int i = 0; i <=3; i++) {
            System.out.print(group1[i]);

        }









    }
}
