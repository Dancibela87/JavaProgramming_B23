package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        /* first we need to specify the pattern
             MM/dd/YYYY  - sample
           this is not default pattern of time */

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY");

        LocalDate today = LocalDate.now();
        System.out.println(today);

        today.format(DF);
        System.out.println(today.format(DF));

        DateTimeFormatter LT = DateTimeFormatter.ofPattern("hh:mm a"); //lower case gives pm/am format
        LocalTime currentTime = LocalTime.now();
        currentTime.format(LT);

        System.out.println(currentTime);

        System.out.println("_______________________________________________");

        LocalDateTime a = LocalDateTime.now();
        System.out.println(a);

        LocalDateTime specificDate =  LocalDateTime.of(2020,11,24,13,0);

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("EEEE, hh a, MMM/dd/YYYY");
        System.out.println(specificDate.format(DTF));

        //this is how you can find out the exact day
        String result =  LocalDate.of(2022,1,1).format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println(result);
        System.out.println(nameOFTheDay(2025,5,28));


    }
    public static String nameOFTheDay(int year, int month, int day){

        String result =  LocalDate.of(year,month,day).format(DateTimeFormatter.ofPattern("EEEE"));
        return  result;

    }
}
