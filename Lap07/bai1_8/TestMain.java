package bai1_8;

public class TestMain
{
    public static void main(String[] args)
    {
        Movable m1 = new MovablePoint(5,6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        Movable m2 = new MovableCircle(1,2,3,4,20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        Movable m3 = new MovableRectangle(10,20,30,40,5,6);
        System.out.println(m3);
        m3.moveUp();
        m3.moveRight();
        System.out.println(m3);
    }
}
