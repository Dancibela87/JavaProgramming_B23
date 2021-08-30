package day38_ClassAndObject2;

public class Rectangle {

    public double length, width;

    public void setInfo(double length, double width){
        this.length =length;
        this.width = width;
    }
    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return 2*(length+width);
    }
    public void getInfo(){
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("Area is "+calculateArea());
        System.out.println("Perimeter is "+ calculatePerimeter());
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
/*public String toString(){
        return "Width: "+width + ", Length: " +length + " area is " + calculateArea();
    }*/
}
