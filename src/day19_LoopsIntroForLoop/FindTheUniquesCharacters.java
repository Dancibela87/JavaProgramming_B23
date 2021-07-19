package day19_LoopsIntroForLoop;

public class FindTheUniquesCharacters {
    public static void main(String[] args) {
         String word = "aabcc";  //first and last index of unique ch should be the same
        String result ="";

        for (int i = 0; i <= word.length()-1; i++) {
            
              char ch = word.charAt(i);
              boolean isUnique = word.indexOf(ch) ==word.lastIndexOf(ch);
              if(isUnique){
                  result += ch;
              }

        }
        System.out.println("result = " + result);


















    }
}
