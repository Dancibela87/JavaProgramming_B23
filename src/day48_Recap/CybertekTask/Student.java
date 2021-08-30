package day48_Recap.CybertekTask;

import java.time.LocalDate;

public class Student extends Person{

    private String schoolName;
    private int id;

    public Student(String name, char gender, LocalDate dOB, String schoolName, int id) {
        super(name, gender, dOB);
        setSchoolName(schoolName);
        setId(id);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String toString() {
        return "Student{" +
                super.toString()+
                "schoolName='" + schoolName + '\'' +
                ", id=" + id +
                '}';
    }
}
