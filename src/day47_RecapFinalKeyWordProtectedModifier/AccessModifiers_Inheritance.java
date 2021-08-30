package day47_RecapFinalKeyWordProtectedModifier;

import utilities.Data2;

public class AccessModifiers_Inheritance extends Data2 {
    //protected is used just with inheritance
    public void method(){
        System.out.println(protectedV);//visible because there is inheritance
        //System.out.println(defaultV);//visible just within the same package
        System.out.println(publicV);
       // System.out.println(privateV);//private is not visible outside the class

        protectedMethod();
        publicMethod1();
        //defaultMethod();
        //privateMethod(); - not visible outside the class
    }






}
