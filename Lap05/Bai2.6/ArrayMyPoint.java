package oop2;

public class ArrayMyPoint
{
    private MyPoint[] points = new MyPoint[10];

    public MyPoint[] array()
    {
        for (int i = 0; i < points.length; i++)
        {
            points[i] = new MyPoint(i + 1, i + 1);
        }
        return points;
    }
    public ArrayMyPoint(){
        this.points = array();
    }
    public MyPoint[] getArray(){
        return points;
    }
}
