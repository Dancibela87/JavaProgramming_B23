package day36_ArraysListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,4,5,5,6,2,1,7,8,3));

        //remove all the elements that are less than five
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) <5){
                list.remove(i);
            }
        }
        System.out.println(list);

         /* This does not work in this case, because in order to remove object from any collection type
          during iteration, we have to apply iterable interface. Otherwise, when we remove them, they
          keep shifting. This we will cover when we finish all the collections. */

        //REMOVE IF()-use when we need to remove elements under the condition or they are unknown

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,4,5,5,6,2,1,7,8,3));

        System.out.println(list1);
        list1.removeIf(p -> p < 5 ); //you can give any name you wont
        System.out.println(list1);

        list1.removeIf(p -> p% 2!= 0);
        System.out.println(list1);










    }
}
