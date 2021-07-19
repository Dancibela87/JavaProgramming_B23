package day16_StringMethodsContinued;

import java.util.Scanner;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "dankapavlovic@yahoo.com";
        int beginning = email.indexOf("@")+1;
        int ending = email.lastIndexOf(".");//("."
       String domain = email.substring(beginning,ending) ;

        System.out.println("domain = " + domain);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
