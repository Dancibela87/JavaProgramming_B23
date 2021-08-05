package day34_LocalDateTime_Wrapper;

public class WrapperClassMethods {
    public static void main(String[] args) {

        //parse method - converts String to primitives

        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("num = " + num);


        //value of method -  converting string to wrapper class

        int num1 = Integer.valueOf(str); //this gives wrapper class value, now it is number
        System.out.println("num1 = " + num1);

        
        Integer num2 = Integer.valueOf(str);

        Integer num3 = Integer.parseInt(str);

        System.out.println("_________________________________________");

        char ch = '4';
        boolean isDigit = Character.isDigit(ch);
        System.out.println(isDigit);

        boolean isLetter = Character.isLetter(ch);
        boolean isSpecialCharacter = !Character.isLetterOrDigit(ch);

        System.out.println("_______________________________________________");

        String s = "a1b2c3";
        int sum=0;

         for(char each: s.toCharArray()){
              if(Character.isDigit(each)){
                  sum+=Integer.parseInt(""+each);
              }
         }

        System.out.println(sum);

        System.out.println("_______________________________________");

        String s2 = "AAABBBBCCCC!@#$%235J";
        String letters = "";
        String digits = "";
        String specialCh = "";

        for(char each : s2.toCharArray()){
            if(Character.isDigit(each)){
                digits += each;
            }else if(Character.isLetter(each)){
                letters += each;
            }else{
                specialCh += each;
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialCh);












    }
}
