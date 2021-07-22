package day34_LocalDateTime_Wrapper;
import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        //METHOD OF()
        LocalDate eid = LocalDate.of(2021,7,20);
        System.out.println(eid);//2021-07-20 -  default format

        /*
        if you give invalid number for month or day it will
        give you exception.
        month - 1-12
        days - depends of the month.
         */


        //METHOD NOW()
        LocalDate today = LocalDate.now();//it gives your date, depending on where you are
        System.out.println(today);




    }

}
