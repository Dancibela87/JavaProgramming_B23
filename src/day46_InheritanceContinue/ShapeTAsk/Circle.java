package day46_InheritanceContinue.ShapeTAsk;

public class Circle extends Shape{

    private double radius, diameter;
    private final static double PI = 3.14;

    public Circle( double radius) {
        super("circle");
        setRadius(radius);
        setDiameter(radius * 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            return;
        }
        this.radius = radius;
        diameter = radius * 2;  //always give this step
    }

    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        if(diameter<0){
            return;
        }
        this.diameter = diameter;
        radius = diameter / 2;   //always give this step

    }

    public double calcArea() {
        return PI * radius*radius;
    }
    public double calcPerimeter() {
        return PI * 2 * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" +calcArea() +
                ", perimeter=" +calcPerimeter() +
                '}';
    }
}
