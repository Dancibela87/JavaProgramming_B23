package day35_ArrayLlist;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class PracticeTask {
    public static void main(String[] args) {
       /* LocalDate[] days = {LocalDate.of(2021, 07, 23),
                LocalDate.of(2021, 07, 24),
                LocalDate.of(2021, 07, 25),
                LocalDate.of(2021, 07, 26),
                LocalDate.of(2021, 07, 27),
                LocalDate.of(2021, 07, 28),
                LocalDate.of(2021, 07, 29),
                LocalDate.of(2021, 07, 30),
                LocalDate.of(2021, 07, 31),
                LocalDate.of(2021, 8, 01)};

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MMMM/dd, EEEE");

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i].format(DF));
        }*/


            DateTimeFormatter DFT= DateTimeFormatter.ofPattern("MMMM/dd, EEE");
            LocalDate[] dates=new LocalDate[10];

            for (int i = 0; i < dates.length; i++) {
              dates[i] = LocalDate.now().plusDays(i+1);
            }
            System.out.println(Arrays.toString(dates));

            for( LocalDate each: dates ){
                System.out.println(each.format(DFT));
            }
        }


    }

/*
 create an array of LocalDate and has the next 10 day's dates,
 use for each loop to print each Date in the following formar:
                MonthName/Day, Day Name

                ex:
                    November/25, Wednesday
 */