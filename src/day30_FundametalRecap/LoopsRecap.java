package day30_FundametalRecap;

import java.util.Scanner;

public class LoopsRecap {
    public static void main(String[] args) {
        /*loops mean repeating>There are few types;
        1.regular for loop - used if we know how many times we need to repeat.

                   for(initialization; ending condition;iteration){
                         statement that will be repeated if condition is true
                   }
             - compiler first check starting point, tan condition, than statement and iteration at the end.
             - iteration changes the value of starting point.
             - i variable can not be used outside of loop, unless it is declared before loop.

        2.while loop - used when we do not know the exact number of repeating.
                     - it is like repeated if statement.

                   while(condition){
                        statement- stops when condition is not true
                   }
        3.for each loop - same as for loop , it just can not go backwards. Meaning it has to start from
                          first character and ends with last one.
        4. nested loop - used when we have to repeat the loop. It is loop inside loop.

        */

        //for loop
        String str = "Java";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");

        }
        System.out.println();

        for (int i = 1, ch = 65; i <= 26; i++,ch++) {
            System.out.print(", " +i+"."+ (char)ch);

        }
        System.out.println();

        for (char i ='A',j = 'a'; i<='Z'; i++,j++){
            System.out.print(i + "-" + j + ", ");

        }
        System.out.println();

        String str1 = "Anna";
        String reverse ="";
        for (int i = str1.length()-1; i >= 0; i--) {

            reverse+=str1.charAt(i);

        }
        boolean isPalindrome = str1.equalsIgnoreCase(reverse);
        System.out.println(isPalindrome);

        //while loops
        Scanner scan = new Scanner(System.in);
        String answer = "Yes";
        int n = 0;

        while(!answer.equalsIgnoreCase("No")) {
            System.out.println("Enter a number:");
            n = scan.nextInt();

            System.out.println("Would you like to enter another number:");
            answer = scan.next();

            while (!(answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("No"))){
                System.out.println("Would you like to enter another number:");
                answer = scan.next();
                System.out.println("Invalid answer. Would you like to enter another number?");
                answer = scan.next();
            }
            if( answer.equalsIgnoreCase("No")){
                System.out.println("Thank you");
            }
        }
        System.out.println();

        //nested loop

        for (int i = 1; i <5 ; i++) {
            for (int j = 1; j <11 ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();

        }

        System.out.println();

        String str2 = "aabcccd";

        for (int j = 0; j < str2.length(); j++) {
            char ch = str2.charAt(j);
            int frequency = 0;

            for (int i = 0; i <= str2.length() - 1; i++) {
                if (str2.charAt(i) == ch) {
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println(ch);
            }
        }





        }
}
