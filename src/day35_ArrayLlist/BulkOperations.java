package day35_ArrayLlist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        /* These are methods of the array list as well. You can apply them to all classes of collection.
         They only accept collection type as argument. To use them we need asList method from array class */

        //ADD ALL METHOD

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> numbers =  new ArrayList<>();

        //numbers.addAll(1,2,3,4,5,6);  it does not comply this way. this way they are taken as array by default
        numbers.addAll(Arrays.asList(1,2,3,4,5,6));  // this way we can add them. We must provide collection type

        list.addAll(numbers);
        list.addAll(Arrays.asList(1,2,3,3,3,3,33));
        System.out.println(list); //this can be done cause numbers are collection type in this case.

        //REMOVE ALL METHOD - removes all elements that you put in method, while remove method removes just one
                              //clear method clear all elem ents

        // list.removeAll(numbers);
        list.removeAll(Arrays.asList(3,4,33));  //removes all 3 and 4 you have, not just one.
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,4,4,4,5,6,1,1,1));
        list2.removeAll(Arrays.asList(1));
        System.out.println(list2);

        // RETAIN METHOD - remove not matching ones, you put the object that you want to keep

        list2.retainAll(Arrays.asList(4));//keeps all 4, and removes all others that are not matching
        System.out.println(list2);

        //CONTAINS ALL - check if all items are contained. You can put in as many items as you want. Returns boolean.

       ArrayList<String> list3 = new ArrayList<>();
       list3.addAll(Arrays.asList("soda","milk","wine","sugar"));
       boolean contains = list3.containsAll(Arrays.asList("milk","soda"));
       System.out.println(contains);






    }
}
