package bai1_5;

public class TestMain
{
    public static void main(String[] args)
    {
        GeometricObject g1 = new Circle(2.0);
        System.out.println(g1);
        System.out.println(g1.getArea());
        System.out.println(g1.getPerimeter());

        Circle c1 = new ResizableCircle(3.0);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Resizable r1 = new ResizableCircle(5.0);
        System.out.println(r1);
        r1.resize(200);
        System.out.println(r1);
    }
}
