package day23_Arrays;

public class HighestScore {
    public static void main(String[] args) {

     String [] name = {"Mike", "Adam", "Tonny", "John", "Ammy"};
     int[] scores = {85, 70, 95, 90, 100};
     int maxScore =scores[0];
     String maxName="";

     int minScore = scores[0];
     String minName ="";

        for (int i = 0; i <= scores.length-1 ; i++) {

            String eachName = name[i];
            int eachScore =scores[i];

            if(eachScore>maxScore){
                maxScore=eachScore;
                maxName=eachName;

            }
            if(eachScore<minScore){
                minScore=eachScore;
                minName=eachName;

            }

        }
        System.out.println(maxScore);
        System.out.println(maxName);

        System.out.println(minScore);
        System.out.println(minName);









    }
}
