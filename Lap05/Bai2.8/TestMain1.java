package oop3;

public class TestMain1
{
    public static void main(String[] args)
    {
        MyCircle circle1 = new MyCircle();
        System.out.println(circle1);

        MyCircle circle2 = new MyCircle(1,2 , 2);
        System.out.println(circle2);

        System.out.println(circle2.getArea());
        System.out.println(circle2.getCircumference());
        System.out.println(circle2.distance(circle1));
    }
}
