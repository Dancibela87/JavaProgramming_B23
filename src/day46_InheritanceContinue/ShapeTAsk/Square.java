package day46_InheritanceContinue.ShapeTAsk;

public class Square extends Shape{

    double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square( double side) {
        super("square");
        setSide(side);
    }

    public double calcArea() {
        return side * side;
    }
    public double calcPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                super.toString()+
                '}';
    }
}
