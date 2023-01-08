package oop2;

public class TestTriangle
{
    public static void main(String[] args)
    {
        MyTriangle triangle1 = new MyTriangle(1,1,2,2,3,3);
        System.out.println(triangle1);

        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getType());
    }
}
