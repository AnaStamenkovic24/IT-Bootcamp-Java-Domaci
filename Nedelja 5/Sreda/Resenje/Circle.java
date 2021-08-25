package Sreda1;

public class Circle extends Shape{
    private double r;

    /*Constructor*/
    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    /*Methods*/

    @Override
    public double circumference() {
        return 2*r*Math.PI;
    }

    @Override
    public double area() {
        return Math.pow(r, 2)*Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Cricumference: " + circumference() + "\n" +
                "Area: " + area() + "\n"
                + "-----------------";
    }
}
