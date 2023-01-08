package bai1_4;

public class TestMain
{
    public static void main(String[] args)
    {
        Movable m1 = new MovablePoint(20,30, 2, 5);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
        System.out.println();

        MovablePoint m2 = new MovableCircle(30,40, 4, 7, 2);
        System.out.println(m2);
        m2.moveUp();
        System.out.println(m2);
        m2.moveDown();
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
