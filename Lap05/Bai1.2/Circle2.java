package homework5;
public class Circle2
{
    private double radius;
    public Circle2() {
        this.radius = 1.0;
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return Math.PI * 2 *radius;
    }

    public String toString() {
        return "Circle[radius = " + radius + "]";
    }
}
