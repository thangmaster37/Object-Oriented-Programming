package oop3;

public class TestMain
{
    public static void main(String[] args)
    {
        MyLine line1 = new MyLine(1,2,3,4);
        System.out.println(line1);

        MyLine line2 = new MyLine(line1.getBegin(), line1.getEnd());
        System.out.println(line2);

        MyLine line3 = new MyLine(3,4,5,6);
        System.out.println(line3);
        line3.setBegin(line1.getBegin());
        line3.setEnd(line1.getEnd());
        System.out.println(line3);

        MyLine line4 = new MyLine(1,3,5,7);
        System.out.println(line4);
        line4.setBeginX(2);
        line4.setBeginY(10);
        line4.setEndX(9);
        line4.setEndY(30);
        System.out.println(line4);

        System.out.println();
        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());
    }
}
