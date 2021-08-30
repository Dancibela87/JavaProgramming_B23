package day45_InheritenceIntro.AnimalTask;
class A{
    public A(){
        System.out.println("A");
    }
}

class B extends A{

    public B(){
        //  super(); //A
        System.out.println("B");
    }

}


public class ConstructorCallsInInhertience {
    public static void main(String[] args) {
        new B();

    }



}
