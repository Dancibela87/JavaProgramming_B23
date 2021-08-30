package day48_Recap.CybertekTask;

import java.time.LocalDate;

public class Employee extends Person{
    public int employeeId;
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary) {
        super(name, gender, dOB);
       setEmployeeId(employeeId);
       setJobTitle(jobTitle);
       setSalary(salary);
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setSalary(double salary) {
        if(salary<0){
            return;
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }
    public void attendMeeting(){
        System.out.println(getName()+" is attending meeting");

    }


    public String toString() {
        return "Employee{" +
                super.toString()+
                "employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
