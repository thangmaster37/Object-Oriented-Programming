package Bai2_1;

public class TestLineSub
{
    public static void main(String[] args)
    {
        LineSub l1 = new LineSub(1,2,3,4);
        System.out.println(l1);
        LineSub l2 = new LineSub(new Point(1,2), new Point(4,5));
        System.out.println(l2);

        System.out.println(l1.getBegin());
        System.out.println(l2.getBegin());

        l1.setBegin(new Point(5, 10));
        System.out.println(l1);

        l2.setBeginXY(3,6);
        System.out.println(l2);

        System.out.println(l1.getLength());
        System.out.println(l1.getGradient());


    }
}
