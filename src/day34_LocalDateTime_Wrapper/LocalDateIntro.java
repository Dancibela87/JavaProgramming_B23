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

        System.out.println("__________________________________________________________");

        String[] names = {"Danka","Bojan","Zorana","Jelena","Muhtar"};
        LocalDate[] DoB = {LocalDate.of(1987,7,26),LocalDate.of(1985,5,25),
                           LocalDate.of(1990,6,23),LocalDate.of(1974,6,17),
                           LocalDate.of(1978,6,17)};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+"'s birthday is: "+DoB[i]);

        }

        System.out.println("______________________________________________________________");

        //who is older
        //ISBEFORE/ISAFTER

        LocalDate person1 = LocalDate.of(1987,7,26);
        LocalDate person2 = LocalDate.of(1980,12,25);

        if(person1.isBefore(person2)){
          System.out.println("person 1 is older");     //person1 is older if true
        }else{
          System.out.println("person two is older");
        }

        if(person1.isAfter(person2)){
          System.out.println("person1 is younger");
        }else{
            System.out.println("person2 is younger");
        }

        System.out.println("_________________________________________________");

        //leap year method
        boolean r1 = person1.isLeapYear();
        System.out.println(r1);

        boolean r2 = LocalDate.of(2023,1,1).isLeapYear();
        System.out.println(r2);

        System.out.println("______________________________________________________");

        //plus method

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        //so, if we want to add 12 days

        LocalDate newDate = currentDate.plusDays(12);
        System.out.println(newDate);

        LocalDate unitAssessment =  currentDate.plusMonths(1);
        System.out.println(unitAssessment);









    }

}
