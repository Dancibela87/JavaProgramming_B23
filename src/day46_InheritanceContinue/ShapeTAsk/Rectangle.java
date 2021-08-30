package day46_InheritanceContinue.ShapeTAsk;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle( double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    public double getWidth() {

        return width;
    }
    public double getLength() {
        return length;
    }

    public void setWidth(double width)  {
        if(width<0){
            return;
        }
        this.width = width;
    }
    public void setLength(double length){
        if(length<0){
            return;
        }
        this.length = length;
    }

    public double calcArea() {
        return width * length;
    }
    public double calcPerimeter() {
        return 2 * (width + length);
    }

}
