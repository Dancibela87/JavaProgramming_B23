package day48_Recap.CybertekTask;

import java.time.LocalDate;

public class CybertekObjects {
    public static void main(String[] args) {
        Tester tester = new Tester("Yasin", 'M', LocalDate.of(1995, 5, 28), 11, "SDET", 110000);

        tester.work();
        tester.attendMeeting();

        System.out.println(tester);
        System.out.println("----------------------------------------------");
        Developer developer = new Developer("Mucahit", 'M', LocalDate.of(1992, 6, 16), 12, "Java Developer", 120000);

        developer.work();
        developer.attendMeeting();

        System.out.println(developer);
        System.out.println("----------------------------------------------");
        Teacher teacher= new Teacher("Asiya", 'F', LocalDate.of(1996, 8, 19), 18, "Softskill Teacher", 130000);

        teacher.work();
        teacher.attendMeeting();

        System.out.println(teacher);
        System.out.println("----------------------------------------------");
        Student student = new Student("Yuliia", 'F', LocalDate.of(1996, 7, 19), "Cybetek", 28);

        //  student.work();
        //  student.attendMeeting();
        System.out.println(teacher);

    }

}


