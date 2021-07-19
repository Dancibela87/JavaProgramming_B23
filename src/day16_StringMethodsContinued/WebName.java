package day16_StringMethodsContinued;

public class WebName {
    public static void main(String[] args) {
        
        String url = "www.amazon.com";
        //you can create two int variables for each index method
        String name = url.substring(url.indexOf(".")+1,url.lastIndexOf("."));

        System.out.println("name = " + name);
        
        String s2 = "       ";//space is consider a character
        s2=s2.trim();
        boolean r1 = s2.isEmpty();

        System.out.println(r1);



        
        
        
        
        
        
        
        
    }
}
