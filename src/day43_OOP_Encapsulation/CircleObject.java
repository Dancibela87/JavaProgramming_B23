package day43_OOP_Encapsulation;

import java.util.concurrent.Callable;

public class CircleObject {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(4);

        System.out.println(circle1.getDiameter());
        System.out.println(circle1.getRadius());
        circle1.setDiameter(8);
        circle1.setRadius(4);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerimeter());
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1==circle2);//this would be false






    }
}
