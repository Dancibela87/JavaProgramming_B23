package day43_OOP_Encapsulation;

public class Circle {

    private double radius,diameter;
    private static double PI=3.14;

    public double getRadius(){
        return radius;
    }
    public double getDiameter(){
        return diameter;
    }

    public void setRadius(double radius){
        if(radius<0){
            System.out.println("Radius of the circle can not be negative");
            return;
        }
        this.radius = radius;
        diameter = radius*2;

    }
    public void setDiameter(double diameter){
        if(diameter<0){
            System.out.println("Diameter of circle can not be negative");
            return;
        }
        this.diameter = diameter;
        radius = diameter/2;

    }


    public Circle(double radius) {
       // this.radius = radius;
       // diameter = radius * 2; it could be done with these 2 steps as well
        setRadius(radius);

    }

    public boolean equals(Circle circle){
        return radius == circle.radius;
    }

    public double calcArea(){
        return PI *(radius*radius);

    }
    public double calcPerimeter(){
        return 2 * PI * radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
 Create a class named Circle
            Private variables:
                radius, diameter, PI

            generate getter & setter for all private fields
                    Make sure that radius & diameter of circle can never be set to negative

            add a constructor that can set all the fields

            Extra methods:
                equal(): accepts a Circle Object and returns true if the given circle is equal to the current circle
                calcArea(): returns the area
                calcPerimeter(): returns the perimeter
                toString()
 */