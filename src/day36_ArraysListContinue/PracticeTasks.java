package day36_ArraysListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTasks {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //list.set(4,0);
        list.set(list.size()-1,0);

        System.out.println(list);

        System.out.println("_________________________________________");

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5)); //or we can convert them using Arrays.asList method inside, or addAll method
        ArrayList<Integer> list2 =new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {

            if (list1.get(i)%2!=0){
                list1.set(i,list1.get(i)*2);
            }

        }
        System.out.println(list1);
        // it could be done with add method and if-else statement

        System.out.println("________________________________________________________");

        String[] arr1 = {"A","B","C"};
        String[] arr2 ={"D","E","F","G"};

        //this can not be assigned to int array, cause these are primitives
        ArrayList<String > list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(arr1));
        list3.addAll(Arrays.asList(arr2));

        System.out.println(list3);

    }
}
/*
 1. write a program that can set the last element of the Integer arraylist to zero
                ex:
                    list = [1,2,3,4,5];
                    output: [1,2,3,4,0];

    2. write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]

    3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */