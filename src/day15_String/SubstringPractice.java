package day15_String;

public class SubstringPractice {
    public static void main(String[] args) {
        String sentence = "My favorite TV series is The Walking Dead";
        String tvSeries = sentence.substring(25);

        System.out.println(tvSeries);
        
        String sen1 = "Java is a fun language";
        String sen2 = sen1.substring(10,12+1);
        String sen3 = sen1.substring(14);

        System.out.println("sen2 = " + sen2);
        System.out.println(sen3);








    }
}
