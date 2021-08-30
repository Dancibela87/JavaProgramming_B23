package day42_ConstructorCall;

import day42_ConstructorCall.WarmUpTasks.CybertekStudent;

public class CybertekStudentObject {
    public static void main(String[] args) {
        CybertekStudent student1 = new CybertekStudent("Danka", "F",34);
        CybertekStudent student2 = new CybertekStudent("Zorana", "F",27);

        System.out.println(student1);
        System.out.println(student2);
        student1.attendClass();
        student2.replit();
        student2.askForBreak();
    }
}
