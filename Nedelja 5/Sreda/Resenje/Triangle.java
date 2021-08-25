package Sreda1;

public class Triangle extends Shape{
    private double a, b, c;

    /*Constructor*/

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /*Methods*/


    @Override
    public double circumference() {
        return a + b + c;
    }

    @Override
    public double area() {
        double halfCircum = circumference() / 2;
        return Math.sqrt(halfCircum*(halfCircum-a)*(halfCircum-b)*(halfCircum-c));
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Cricumference: " + circumference() + "\n" +
                "Area: " + area() + "\n"
                + "-----------------";
    }
}
