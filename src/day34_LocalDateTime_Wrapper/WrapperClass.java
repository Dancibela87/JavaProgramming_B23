package day34_LocalDateTime_Wrapper;

public class WrapperClass {
    public static void main(String[] args) {
        short s = 10;
        int num = s;
        Integer num1 = (int)s; //this short can not be assigned to int.
                            //it will give error, or yo have to cast it
        //auto boxing - converting primitive to wrapper class

        char ch = '@';
        Character ch2 = ch;//it can accept anything but char primitive

        //unboxing - converting wrapper class to primitives.

        Byte b1 = 10;
        byte b2 = b1;
        short b3 = b1;
        int b4 = b1;
        long b5 = b1;
        float b6 = b1;
        double b7 = b1;
        System.out.println("_____________________________________");

        byte c1 = 10;
        Byte c2 = c1;
        //Integer c3 = c1;- it gives you compiler error
        Integer c3 = (int)c1; //casting works
        //Short c4 = c1; - accept just short, wrapper classes just accept their own, most loyal ones







    }
}
