package Sreda1;

public abstract class Shape {
    private String name;

    /*Constructor*/
    public Shape(String name) {
        this.name = name;
    }

    /*Methods*/
    public abstract double circumference();

    public abstract double area();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Shape: " + name;
    }
}
