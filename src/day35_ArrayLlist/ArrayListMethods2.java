package day35_ArrayLlist;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        //CONTAIN METHOD - check if it contain something. We have to pass object.

        ArrayList<String> list = new ArrayList<>();
        list.add("milk");
        list.add("cheese");
        list.add("apples");
        list.add("apples");
        list.add("cheese");
        list.add("milk");
        list.add("milk");


        boolean isContained = list.contains("apples");
        boolean isContained2 = list.indexOf("water") >=0 ;
        //if the index number is positive, it means it is contained.
        //both methods can be used
        System.out.println(isContained);

        ArrayList<String> removeDuplicates =  new ArrayList<>();

        for (String each : list){
            if(!removeDuplicates.contains(each)){
                removeDuplicates.add(each);
            }
        }
        System.out.println(removeDuplicates);

        System.out.println("________________________________________________________________");

        ArrayList<String> reverse =  new ArrayList<>();

        for (int i = removeDuplicates.size()-1; i >= 0; i--) {
           reverse.add(removeDuplicates.get(i));

        }
        System.out.println(reverse);

                               //EQUALS METHOD
        // Check if two array list are equal. you have to pass list. It returns boolean.

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(20);
        System.out.println(n1==n2); // it will return false, cause these are two different objects.
                                    //whenever you have new keyword, it creates new object.
        System.out.println(n1.equals(n2));  // these returns true, it compares it values.

                             //IS EMPTY METHOD
        //it returns true if array list is empty, if it size is zero and false if it is not zero










    }
}
