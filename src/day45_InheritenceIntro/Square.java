package day45_InheritenceIntro;

public class Square {
    private double side;

    public Square(double side) {  //constructor
       setSide(side);
    }

    public double getSide() { //getter. It can not be static, because it does not accepts static
        return side;
    }
    public void setSide(double side) { //setter.return type is always void
        if(side<0){
            System.out.println("Side can not be negative");
            return;
        }
        this.side = side;
    }

    public double area(){
        return side * side;
    }
    public double perimeter(){
        return 4 * side;
    }
    public boolean equals(Square square){
        return side==square.side;

    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + area() +
                "perimeter=" + perimeter() +

                '}';
    }
}
