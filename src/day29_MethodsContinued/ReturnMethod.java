package day29_MethodsContinued;

public class ReturnMethod {

    public static String reverse(String str) {
        String result = ""; //"CBA"

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String str){

        String reversedStr = reverse(str);

       /* if(reversedStr.equalsIgnoreCase(str)){
            System.out.println("Is palindrome");
        }else{
            System.out.println("Not palindrome");
        }*/
        return (reversedStr.equalsIgnoreCase(str)?true:false);
    }

    public static void main(String[] args) {

        String str ="Anna";
        reverse(str);//since this data is not reusable, we wont be able to use it outside of the method
                     //that is with void, we can create return method for that
                     //that is what we did in above sample

      String reverse = reverse(str);
      System.out.println(reverse);

      boolean isPalindrome = isPalindrome(str);
      System.out.println(isPalindrome);



    }




}
