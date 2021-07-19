package day10_IfStatements;

import javax.lang.model.SourceVersion;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 8;
        String location="";
        int numberOfGroup=0;
        String teacherInCharge="";

        if(grade>=1 && grade <=6){
            if(grade==1){
                location="Apple orchard";
                numberOfGroup=3;
                teacherInCharge="Ms.Smith";
            }else if( grade==2){
                location="Zoo";
                numberOfGroup=7;
                teacherInCharge="Mr Lee";

            }else if(grade==3){
                location="Aquarium";
                numberOfGroup=5;
                teacherInCharge="Mr Vilson";
            }else if(grade==4){
                location="Movie theater";
                numberOfGroup=2;
                teacherInCharge="Mr reyes";
            }else if(grade==5){
                location="Museum";
                numberOfGroup=5;
                teacherInCharge="Mr Leila";
            }else {
                location="Six Flags";
                numberOfGroup=8;
                teacherInCharge="Mr Watt";
            }


        }else{

           location="unkown";
           numberOfGroup=0;
           teacherInCharge="unkown";
        }

        System.out.println("grade = " + grade);
        System.out.println("location = " + location);
        System.out.println("numberOfGroup = " + numberOfGroup);
        System.out.println("teacherInCharge = " + teacherInCharge);










    }
}
/*
. Your school goes on a Field trip each year.
The place you go will be based on your grade.
Given some grade number (1-6) figure out the details of your field trip.
 Print the information at the end.

                Data based on grade:

                    grade - 1
                    location -  Apple orchard
                    number of groups - 3
                    teacher in charge - Ms. Smith

                    grade - 2
                    location - Zoo
                    number of groups - 7
                    teacher in charge - Mr. Lee

                    grade - 3
                    location - Aquarium
                    number of groups - 5
                    teacher in charge - Ms. Wilson

                    grade - 4
                    location - Movie theater
                    number of groups - 2
                    teacher in charge - Ms. Reyes

                    grade - 5
                    location - Museum
                    number of groups - 5
                    teacher in charge - Ms. Lela

                    grade - 6
                    location - Six Flags
                    number of groups - 8
                    teacher in charge - Mr. Watt
 */
