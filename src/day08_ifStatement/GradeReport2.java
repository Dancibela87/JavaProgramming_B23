package day08_ifStatement;

public class GradeReport2 {
    public static void main(String[] args) {
        int score =95;
        boolean madeA = score>=90 && score <=100;
        boolean madeB = !madeA && score >=80;//did not made a and score is >80
        boolean madeC = !madeB && !madeA && score >=70;
        boolean madeD = !madeA &&!madeB && !madeC && score >=60;
        boolean madeF = score<60;//or all ! all of this above

        /*
        No need to run a code, it is the same as
        GradeReport class.
         */

        










    }
}
