package Bai1_4;

public class Rectangle extends Shape
{
    private double width;
    private double length;

    public Rectangle(){
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle[Shape[color = " + getColor() + ", filled = " + getFilled() + "], width = " + width + ", length = " + length + "]";
    }
}
