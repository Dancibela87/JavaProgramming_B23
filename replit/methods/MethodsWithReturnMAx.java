package methods;

import java.util.Scanner;

public class MethodsWithReturnMAx {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));




    }
    public static int max(int x, int max){
     int   result = (x>max)?x:max;

return result;

    }
}
/*
Finish the method max which has two parameters, x and max.

if x is bigger than max return x
if max is bigger than x return max
all other cases return x
 */