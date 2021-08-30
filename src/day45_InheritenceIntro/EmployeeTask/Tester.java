package day45_InheritenceIntro.EmployeeTask;

public class Tester extends Employee{

    public Tester(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }
    public void testing(){
        System.out.println(name+" is testing");
    }


}


