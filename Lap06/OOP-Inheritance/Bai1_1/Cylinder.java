package Bai1_1;

public class Cylinder extends Circle
{
    private double height;

    public Cylinder(){
        super();
        this.height = 1.0;
    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double surfaceArea(){
        return 2 * Math.PI * getRadius() * height + 2 * getArea();
    }
    public double getVolume(){
        return getArea() * height;
    }
}
