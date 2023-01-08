package bai1_3;

public class TestMain
{
    public static void main(String[] args)
    {
        Movable m1 = new MovablePoint(10,20, 1, 2);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
    }
}
