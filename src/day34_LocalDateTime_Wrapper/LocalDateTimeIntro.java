package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {
       /*
       it can contain time and date, combination of both
        */

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime minutes = now.plusMinutes(15);
        System.out.println(minutes);

        LocalDate date = LocalDate.of(2021,8,5);
        LocalTime time = LocalTime.of(17,45);
        LocalDateTime local  =  LocalDateTime.of(date,time);

        System.out.println(local);








    }
}
