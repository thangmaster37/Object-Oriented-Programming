package homework5;
public class TestCircle1
{
    public static void main(String[] args)
    {
        Circle1 circle1 = new Circle1();
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of "+ circle1.getArea());
        Circle1 circle2 = new Circle1(2.0);
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of "+ circle2.getArea());
        Circle1 circle3 = new Circle1(2.0, "green");
        System.out.println("The circle has radius of " + circle3.getRadius() + " and color of " + circle3.getColor() + " and area of "+ circle3.getArea());
        Circle1 circle4 = new Circle1();
        circle4.setRadius(5.5);
        System.out.println("radius is: " + circle4.getRadius());
        circle4.setColor("green");
        System.out.println("color is: " + circle4.getColor());
        Circle1 circle5 = new Circle1(5.5, "black");
        System.out.println(circle5.toString());
        System.out.println(circle5);
    }

}
