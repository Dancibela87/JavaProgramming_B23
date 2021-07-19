package day30_FundametalRecap;

import utilities.StringUtility;

public class Methodsreview {
    public static void main(String[] args) {
         /*
        Methods - they make functions reusable. We do not to write code all over again
                - declaring it:
                            public static returnType methodName(parameter){
                                  code fragment
                            }
                 - returnType and methodName are only mandatory
                 - returnType can be void or any data type
                 - parameter should be given if you need extra information
         */
        String str = "Java";
        String result = StringUtility.reverse(str);
        System.out.println(result);


    }
}
