package day42_ConstructorCall.WarmUpTasks;

public class CybertekStudent {
    public String name, gender;
    public int age;

    public static String schoolName, fieldOfStudy, programmingLanguage;

    static {
        schoolName ="Cybertek school";
        fieldOfStudy ="IT";
        programmingLanguage="Java";

    }

    public CybertekStudent(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void attendClass(){
        System.out.println(name + " is attending classes at "+schoolName);
    }
    public void replit(){
        System.out.println(name + " is working on "+programmingLanguage+ " replits");
    }
    public void askForBreak(){
        System.out.println(name+" is asking for a break");
    }

    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }




}
