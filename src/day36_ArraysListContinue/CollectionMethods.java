package day36_ArraysListContinue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionMethods {
    public static void main(String[] args) {

        //SORT METHOD

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,4,8,6,5,7,9,1,0));

        // Arrays.sort();
        Collections.sort(nums);  //call it from collection class.
        System.out.println(nums);

        //REVERSE
        Collections.reverse(nums);
        System.out.println(nums);

        //SWAP
        Collections.swap(nums, 0,2);
        System.out.println(nums);

        //REPLACE ALL
        Collections.replaceAll(nums, 1,3);
        System.out.println(nums);

        //FREQUENCY
        int f = Collections.frequency(nums, 3);

        System.out.println(f);

        System.out.println("_______________________________________________________________");

        String str ="AAAVVVVBBBBCDEEEE";
        String  unique="";
        ArrayList<String> result = new ArrayList<>(Arrays.asList( str.split("")));

        result.removeIf(p->Collections.frequency(result,p) !=1);
        System.out.println(result);


        for (String each : result) {
            if(Collections.frequency(result,each) == 1){

                unique+=each;
            }

        }
        System.out.println(unique);


        //MAX/MIN NUMBER

        Collections.max(nums);
        Collections.min(nums);















    }
}
