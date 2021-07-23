package day34_ArrayLlist;

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


            DateTimeFormatter DFT= DateTimeFormatter.ofPattern("MMMM/dd, EEEE");
            LocalDate[] arraysDate=new LocalDate[10];
            String[] array=new String[10];
            LocalDate now= LocalDate.now();
            for (int i = 0; i < arraysDate.length; i++) {
                arraysDate[i]=now.plusDays(i+1);
                array[i]=arraysDate[i].format(DFT);
            }
            System.out.println(Arrays.toString(array));
        }


    }

/*
 create an array of LocalDate and has the next 10 day's dates,
 use for each loop to print each Date in the following formar:
                MonthName/Day, Day Name

                ex:
                    November/25, Wednesday
 */