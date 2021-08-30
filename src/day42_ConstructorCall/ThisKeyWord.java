package day42_ConstructorCall;

public class ThisKeyWord {
    int a;
    static int b;
    public void method(){
        System.out.println("Instance method");
    }
    public static void method2(){
        System.out.println("Static method");
    }

    public ThisKeyWord(){
        System.out.println( this.a );
        this.method();// not used much

      // System.out.println(this.b);//we should not do this, to call static variable with this.word
      // this.method2();
    }



}
