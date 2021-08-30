package day41_Constractor.CircleTask;

import java.util.Arrays;

public class Circle {

    public double radius;
    public double diameter;

    public static double PI;
    static {
        PI =3.14;
    }

    public Circle(double radius){
        this.radius =radius;
        diameter = radius * 2;
    }
    public double calculateArea(){
        return radius * radius * PI;

    }
    public double perimeter(){
        return diameter*PI;
    }

    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                ", diameter= " + diameter +
                ", area= " + calculateArea() +
                ", perimeter= " + perimeter() +
                '}';
    }
}
