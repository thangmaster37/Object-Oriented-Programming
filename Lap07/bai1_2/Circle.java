package bai1_2;

public class Circle implements GeometricObject
{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle[" +
                "radius = " + radius + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }
}
