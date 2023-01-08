package Bai2_2;

public class TestCylinder
{
    public static void main(String[] args)
    {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(3.0, 2.0, "green");
        System.out.println(cylinder2);
        System.out.println(cylinder2.getVolume());
    }
}
