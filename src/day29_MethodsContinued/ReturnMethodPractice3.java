package day29_MethodsContinued;

public class ReturnMethodPractice3 {
    public static void main(String[] args) {

        String  str = "AAAABBBCCCCC";
        System.out.println(removeDuplicates(str));

    }
     public static String removeDuplicates(String str){
        String result = "";
       for( String each : str.split("")) {
           if(!result.contains(""+each)){
               result+=each;
           }
       }

          return result;
         }

}
