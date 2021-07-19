package day19_LoopsIntroForLoop;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        String word = "ababababab";
        String result = "";    //ab

        for (int i = 0; i < word.length(); i++) {

            if (!result.contains("" + word.charAt(i))) {
                result += word.charAt(i);
            }
        }

        System.out.println("result = " + result);;


    }
}
