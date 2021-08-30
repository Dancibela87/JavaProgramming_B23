package day41_Constractor;

public class StaticPractice {

   static class Test{

     static int b;

   }//could be static or not. The purpose is for memory managment,because we do not need object to call it.

   class TestB{
       int c;
   }

   public static int a = 10;
   public static void method1(){

   }
   static {

   }

   public static void main(String[] args) {
      System.out.println(StaticPractice.Test.b);

      StaticPractice ob = new StaticPractice();
      //StaticPractice.TestB obj = new StaticPractice.TestB();
      /*
      if class is not static , than you have to create extra objects. So, memory wil be used more.
      it i s just to know, it wont be used in other classes. So, just inner/nested class can be static.
      it only accepts static members of outher class.
       */




   }
   //classes can be static, but not all the classes. Top level classes should  not be static.
   //static classes should belong to another class. Inner class should be static.



}
