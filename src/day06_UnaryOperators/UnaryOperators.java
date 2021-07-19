package day06_UnaryOperators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 100;
        ++a;
        System.out.println(a);//increased by 1

        int b = 100;
        --b;
        System.out.println(b);//decreased by 1


        int f = 10;
        System.out.println(++f);// 11, pre change it emmidietly by 1

        System.out.println(f++);// 10, post: first it passes the current value, and than it changes ut
        System.out.println("f = " + f);

        int n1 = 50;
        int n2 = n1++;
        System.out.println("n1 = " + n1); //50
        System.out.println("n2 = " + n2);//51

        int a1 = 100; //101
        int a2 = ++a1;//101

        System.out.println("a2 = " + a2);
        System.out.println("a1 = " + a1);


        int r =200;

        System.out.println(r++);//200. delay
        System.out.println("r = " + r);//201

        int p =200;
        System.out.println(++p);//201 right away
        System.out.println("p = " + p);//201

        int y = 100;
        int result = y++ +1;

        // 100 + 1=101; value od y = 101
        System.out.println("result = " + result);//101
        System.out.println("y = " + y);//101

        int z = 100;
        int result2 = ++z + 1;
        System.out.println("result2 = " + result2);//102
        System.out.println("z = " + z);//101


        int a3 =1;
        a3 = -a3-- + a3++ / -a3-- * --a3;
        System.out.println("a3 = " + a3);
        









    }
}
