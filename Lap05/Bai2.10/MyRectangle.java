package oop4;

import oop2.MyPoint;

public class MyRectangle
{
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2){
        this.topLeft = new MyPoint(x1,y1);
        this.bottomRight = new MyPoint(x2,y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public double lengthDiagonalLine(){
        return Math.sqrt(Math.pow(this.topLeft.getX() - this.bottomRight.getX(), 2) + Math.pow(this.topLeft.getY() - this.bottomRight.getY(), 2));
    }

    public String toString(){
        return "MyRectangle[topleft = (" + this.topLeft.getX() + "," + this.topLeft.getY() + "), bottomright = (" + this.bottomRight.getX() + "," + this.bottomRight.getY() + ")]";
    }
}
