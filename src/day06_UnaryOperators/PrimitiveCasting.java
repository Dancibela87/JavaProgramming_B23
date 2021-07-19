package day06_UnaryOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {

        byte a = 10;
        long b = a; //automaticly , implicit casting

        double d = 10.0;//manually, explicit casting
        int c = (int)(long)d;//it could be cast as any smaller number
                   //double casting could be done as well


        long h = 100;
        short g = (short)h; //best way is to give same type you are casting it to

        float j = 2.5f;
        int k = (int)j;

        long v = (long)j;
        short i = (short)j;

        int n = (short)10;
        System.out.println(n);

        System.out.println( (double)2.5f ); //just sample
        System.out.println( (double)10L);

        int x = 129;
        byte o = (byte) x;
        System.out.println(o);//you will get negative number if it is out of a range

        int e = 70000;
        short y = (short)e;

        System.out.println(y);//out of range

        double p = 1000.0;
        int f = (int) p;

        System.out.println(f);//1000
        System.out.println(p);//1000.0

        System.out.println((int)100.2458);//100












    }

}
