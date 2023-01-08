package oop4;

public class TestMain
{
    public static void main(String[] args)
    {
        MyRectangle rectangle1 = new MyRectangle(1,2,3,4);
        System.out.println(rectangle1);

        System.out.println(rectangle1.lengthDiagonalLine());
    }
}
