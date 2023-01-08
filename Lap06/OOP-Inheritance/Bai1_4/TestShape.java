package Bai1_4;

public class TestShape
{
    public static void main(String[] args)
    {
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(2.0);
        System.out.println(circle2);
        System.out.println("Area is: " + circle2.getArea() + " and Perimeter is: " + circle2.getPerimeter());

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(2.0, 3.0);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle(3.0, 4.0, "green", true);
        System.out.println(rectangle3);
        System.out.println("Area is: " + rectangle3.getArea() + " and Perimeter is: " + rectangle3.getPerimeter());

        Square square1 = new Square();
        System.out.println(square1);
        Square square2 = new Square(2.0);
        System.out.println(square2);
        Square square3 = new Square(5.0, "black", false);
        System.out.println(square3);
        System.out.println("Area is: " + square3.getArea() + " and Perimeter is: " + square3.getPerimeter());
    }
}
