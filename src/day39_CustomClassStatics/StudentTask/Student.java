package day39_CustomClassStatics.StudentTask;

import java.time.LocalDate;

public class Student {
    public String name;
    public char gender;
    public LocalDate DoB;
    public int age;
    public int studentID;
    public char grade;

    public void setInfo(String name, char gender, LocalDate DoB, int studentID, char grade) {
        this.name = name;
        this.gender = gender;
        this.DoB = DoB;
        this.studentID = studentID;
        this.grade = grade;
        age = LocalDate.now().getYear() -DoB.getYear();
    }



    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DoB= " + DoB +
                ", age= " + age +
                ", studentID= " + studentID +
                ", grade= " + grade +
                '}';
    }
}
