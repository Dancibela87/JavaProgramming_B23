package day25_ArraysLoop;

public class FindUniqueCharactersFromString {
    public static void main(String[] args) {

        String[] words = {"java","java","python","C#"};

        for (String each: words){

            int count =0;

            for (String word : words){
                if(word.equals(each)){
                    count++;
                }
            }

            if(count==1){
                System.out.println(each);
            }

        }











    }
}
