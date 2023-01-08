package oop3;

import oop2.MyPoint;

public class MyCircle
{
    private MyPoint center;
    private int radius;

    public MyCircle(){
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX(){
        return this.center.getX();
    }

    public void setCenterX(int x){
        this.center.setX(x);
    }

    public int getCenterY(){
        return this.center.getY();
    }

    public void setCenterY(int y){
        this.center.setY(y);
    }

    public int[] getCenterXY(){
        int[] array = {this.center.getX(), this.center.getY()};
        return array;
    }

    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    public String toString(){
        return "MyCircle[radius = " + radius + ", center = (" + getCenterX() + "," + getCenterY() + ")]";
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return Math.PI * radius * 2;
    }

    public double distance(MyCircle another){
        return Math.sqrt(Math.pow(getCenterX() - another.getCenterX(), 2) + Math.pow(getCenterY() - another.getCenterY(), 2));
    }

}
