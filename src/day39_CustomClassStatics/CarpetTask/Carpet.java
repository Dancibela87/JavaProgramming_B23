package day39_CustomClassStatics.CarpetTask;

import java.text.DecimalFormat;

public class Carpet {
    public double width, length, unitPrice;
    public boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice = (width*length) * unitPrice;
        return  (isPersian)? totalPrice+200 : totalPrice;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + df.format(calcCost() ) +
                '}';
    }

}
