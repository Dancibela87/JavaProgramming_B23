package day34_LocalDateTime_Wrapper;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {
        /*
        we can use same methods as we used for date
        */

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        LocalTime breakTime = time1.plusMinutes(15);
        System.out.println(breakTime);

        LocalTime completeQuiz = breakTime.plusMinutes(20);
        System.out.println(completeQuiz);








    }
}
