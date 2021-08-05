package day37_ClassAndObjects;

public class Rectangle {
    int length;
    int width;

    public static void main(String[] args) {

        Rectangle rect1=new Rectangle();
        rect1.setInfo(10,20);
        rect1.getInfo();
        rect1.CalculateArea();
        rect1.CalculatePerimeter();

        System.out.println("------------------------------------------------");

        Rectangle rect2=new Rectangle();
        rect2.setInfo(45,30);
        rect2.getInfo();
        rect2.CalculateArea();
        rect2.CalculatePerimeter();

    }

    public void setInfo(int RectLength, int RecWidth){
        length=RectLength;
        width=RecWidth;

    }

    public void CalculateArea(){
        int area=length*width;
        System.out.println("Area is "+area+" cm");
    }
    public void CalculatePerimeter(){
        int Perimeter=2*(length+width);
        System.out.println("Perimeter is "+Perimeter+" cm");
    }
    public void getInfo(){
        System.out.println("Length is "+length+" cm");
        System.out.println("Width is "+width+" cm");
        System.out.println("Area is "+width*length+" cm");
        System.out.println("Perimeter is "+(2*(width+length))+" cm");
    }


}
/*
create a custom class named Rectangle
    Attributes:
        length, width

    Actions:
        setInfo: sets the length and width of the rectangle
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
        getInfo(): prints the width, length, area and perimeter of the rectangle
 */