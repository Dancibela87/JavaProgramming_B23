package methods;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {

        String str1 = "Iceman";
        String str2 = "Cinema";
        System.out.println(isAnagram(str1,str2));

    }
    public static boolean isAnagram(String str1, String str2){
        boolean isAngram=true;

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i].equalsIgnoreCase(arr2[j])){
                    isAngram=true;
                }else{
                    isAngram=false;
                }

            }

        }
        return isAngram;

    }
}
