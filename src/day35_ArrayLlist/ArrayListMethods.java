package day35_ArrayLlist;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

                   //SET METHOD
        /*  set method add new element and take one, it does not change size. That is the difference with add method
            which adds element and move the rest ove elements, increasing the size.   */

        ArrayList<String> items = new ArrayList<>();
        items.add("eggs");
        items.add("milk");
        items.add("water");
        items.add("cake");
        items.add("apples");

        System.out.println(items);

        items.set(2,"pears");   //takes out item at index number 2 and adds pears.
        System.out.println(items);

                  //REMOVE METHOD
        /*  It is overloaded method. You can remove by index or object. It decreases the size. Whatever number
        we put inside, it will be taken as index number.  */

        items.remove(2);
        System.out.println(items);

        boolean r1 =  items.remove("cake"); //use just with object, not when you use index number
                                               //true is if the item is in the array list, otherwise it will be false
        System.out.println(items);
        System.out.println(r1);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(10);
        nums.add(20);
        nums.add(30);
        //nums.remove(30);  //it wont work, because there is no index number 30
        nums.remove(2);

        //this way we convert int to object so we can remove 30 without knowing it's index number, or we can do casting
        nums.remove((Integer) 30); //casting and now it is object
        Integer a = 30;
        nums.remove(a);
        nums.remove(Integer.valueOf(10));
        System.out.println(nums);

                            //CLEAR METHOD
        /*  It moves everything out, size is 0 now.  */

        items.clear();
        System.out.println(items);


                             //INDEX 0F/LAST INDEX OF
        /*  It has the same functionality as the ones in String. They give first and last index of an element.  */

        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('A');
        chars.add('A');
        chars.add('C');

        //find unique element
       ArrayList<Character> unique = new ArrayList<>();
        for (Character each: chars) {
            if(chars.indexOf(each) == chars.lastIndexOf(each)){
                unique.add(each);
            }

        }
        System.out.println(unique);












    }
}
