package day25_ArraysLoop;

public class UniqueChar {
    public static void main(String[] args) {

        char[] chars ={'A','B','C','A','D','D'};


        for (char each:chars) {
            int count = 0;
            for (char characters : chars) {
                if (characters == each) {
                    count++;
                }
            }

            if(count==1){
            System.out.println(each);}

        }

        








    }
}
