package day44_Recap.PersonTas;

import java.time.LocalDate;

public class Person {
    private String name;
    private char gender;

    private final int age;
    private final LocalDate dateOfBirth;
    private final String countryOfBirth;

    private final  String language;

    public static final boolean isHuman = true;
    public static final boolean planetEarth = true;

    public Person(String name, char gender, LocalDate dateOfBirth, String countryOfBirth, String language) {
        //here you can just call set method
        setGender(gender);
        setName(name);
        this.name = name;
        this.gender = gender;
        if(dateOfBirth.isBefore(LocalDate.now())){
            this.dateOfBirth = dateOfBirth;
        }else{
            this.dateOfBirth = null;
        }

        this.countryOfBirth = countryOfBirth;
        this.language = language;
        age = LocalDate.now().getYear() - this.dateOfBirth.getYear();
    }

    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public String getCountryOfBirth() {
        return countryOfBirth;
    }
    public String getLanguage() {
        return language;
    }

    public boolean isHuman() {
        return isHuman;
    }
    public boolean isPlanetEarth() {
        return planetEarth;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGender(char gender) {
        if(gender != 'M' || gender!='F'){
            return;
        }
        this.gender = gender;
    }

    public void eat (){
        System.out.println(name + " is eating ");
    }
    public void sleep (){
        System.out.println(name + " is sleeping");
    }
    public void drink (){
        System.out.println(name + " is drinking ");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", language='" + language + '\'' +
                ", isHuman=" + isHuman +
                ", planetEarth=" + planetEarth +
                '}';
    }
}
/*
PersonTask:
    private variables:
        name (String)
        gender (char and constant)
        age (int)
        dateOfBirth (LocalDate & constant)
        countryOfBirth (String & constant)
        language (String & constant)
        isHuman (static boolean & constant)
        planet (static boolean & constant)

    Encapsulate all the fields (instances)
        (age cannot be set to negative)

    Add a constructor that can set the instances when the object is created
         (Avoid any duplicated or unnecessary code fragments)

     Extra methods:
         eat(), sleep(), drink(), toString()

 */
