package bai1_2;

public class TestMain
{
    public static void main(String[] args)
    {
        GeometricObject g1 = new Rectangle(1,2);
        System.out.println(g1);
        System.out.println(g1.getArea());
        System.out.println(g1.getPerimeter());

        GeometricObject g2 = new Circle(2.0);
        System.out.println(g2);
        System.out.println(g2.getArea());
        System.out.println(g2.getPerimeter());
    }
}
