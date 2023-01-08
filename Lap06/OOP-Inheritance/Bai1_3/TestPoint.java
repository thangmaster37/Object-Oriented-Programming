package Bai1_3;

public class TestPoint
{
    public static void main(String[] args)
    {
        Point2D point2D1 = new Point2D();
        System.out.println(point2D1);
        Point2D point2D2 = new Point2D(1.1f, 2.2f);
        System.out.println(point2D2);

        Point3D point3D1 = new Point3D();
        System.out.println(point3D1);
        Point3D point3D2 = new Point3D(3.3f,4.4f,5.5f);
        System.out.println(point3D2);
    }
}
