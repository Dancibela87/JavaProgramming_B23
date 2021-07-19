package day27_Recap;

public class FirstUniqueElementFromArray {
    public static void main(String[] args) {

        int[] nums = {1,2,1,4,4,5};
        int unique = 0;

        //HOW TO PRINT ALL THE UNIQUE ELEMENTS!!!!!!!

       /* for (int j =0;j<nums.length;j++) { //for repeating inner loop for each element.
            int frequency = 0;
            for (int i = 0; i < nums.length; i++) {  // it is for finding the frequency of one element.

                if (nums[i] == nums[j]) {
                    frequency++;
                }
            }
              if(frequency==1){
               unique =  nums[j];
               break;       // it stops when it finds the first unique element
            }
        }
        System.out.println(unique);*/  //used for loop to solve the task


        for (int each : nums) { //for repeating inner loop for each element.
            int frequency = 0;
            for (int element : nums) {  // it is for finding the frequency of one element.

                if (element == each) {
                    frequency++;
                }
            }
            if(frequency==1){
                unique =  each;
                break;       // it stops when it finds the first unique element
            }//if we remove break, it will print the last variable.
        }
        System.out.println(unique);









    }
}
