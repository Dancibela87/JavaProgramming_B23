package day45_InheritenceIntro.EmployeeTask;

public class Developer extends Employee{

    public Developer(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }
    public void code(){
        System.out.println(name+" is coding");
    }
    public void fixBugs(){
        System.out.println(name+" is fixing bugs");
    }
}