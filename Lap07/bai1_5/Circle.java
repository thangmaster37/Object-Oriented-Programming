package bai1_5;

public class Circle implements GeometricObject
{
    protected double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public String toString(){
        return "Circle[radius = " + radius + "]";
    }

    public double getPerimeter(){
        return Math.PI * radius * 2;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
