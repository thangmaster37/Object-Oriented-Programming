package homework5;
public class TestMain
{
    public static void main(String[] args)
    {
        Circle2 circle1 = new Circle2();
        System.out.println(circle1);
        Circle2 circle2 = new Circle2(1.1);
        System.out.println(circle2);
        circle1.setRadius(2.2);
        System.out.println(circle1);
        System.out.println("radius is: " + circle1.getRadius());

        System.out.printf("area is: %.2f%n", circle1.getArea());
        System.out.printf("circumference is: %.2f%n", circle1.getCircumference());
    }
}
