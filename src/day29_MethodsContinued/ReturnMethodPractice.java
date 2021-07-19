package day29_MethodsContinued;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        //find max num between 10 and 20, then multiply it by 2
        int max = max(10, 20);
        int num2 = max * 2;
        System.out.println(num2);

        System.out.println("__________________________________________");

        int[] nums = {10,5,0,-5,20,8};
        int max1 = nums[0];
        int min = nums[0];
        for (int each: nums) {
            max = max(each, max);
            min = min(each, min);
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println("___________________________________________");

        int[] num1 = {1,2,5,7,8,-6,50};
        int maxNum =  maxNumFromIntArray(num1);
        int minNum = minNumFromIntArray(num1);

        System.out.println(maxNum);
        System.out.println(minNum);


    }

    public static int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
        // return (a>b) ? a: b; - this can be done as well
    }
    public static int min(int a, int b){
        return (a<b)? a: b;
    };
    public static int maxNumFromIntArray(int[] numbers) {

        int max = numbers[0];
        for (int number : numbers) {
            max = max(max, number);

        }
        return max;

    }
    public static int minNumFromIntArray(int[] numbers) {

        int min = numbers[0];
        for (int number : numbers) {
            min = min(min, number);

        }
        return min;

    }


}
