package day38_ClassAndObject2;

import java.util.ArrayList;
import java.util.Arrays;

public class RectangleObject {
    public static void main(String[] args) {
        //w =30, l=45
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 =  new Rectangle();

        rec1.setInfo(30,45);
        rec1.calculateArea();
        rec1.calculatePerimeter();
        rec1.getInfo();
        rec2.setInfo(25,48);

        System.out.println(rec1);
        System.out.println(rec2);
        Rectangle[] arr = {rec1, rec2};
        System.out.println(Arrays.toString(arr));



    }
}
