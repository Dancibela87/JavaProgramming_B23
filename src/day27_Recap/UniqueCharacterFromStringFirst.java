package day27_Recap;

public class UniqueCharacterFromStringFirst {
    public static void main(String[] args) {

        String str = "aaaa bcddde fggggg gggh";


       for (char each : str.replace(" ","").toCharArray()){

           if(str.indexOf(each)==str.lastIndexOf(each)){
               System.out.println(each);
               break;
           }
       }









    }
}
