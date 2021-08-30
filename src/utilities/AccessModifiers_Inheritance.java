package utilities;

public class AccessModifiers_Inheritance extends Data2{
    //same package: public, protected, default
    public void method(){
        System.out.println(protectedV);
        System.out.println(defaultV);
        System.out.println(publicV);
        //System.out.println(privateV);//private is not visible outside the class

        protectedMethod();
        publicMethod1();
        defaultMethod();
       // privateMethod(); - not visible outside the class
    }


}
