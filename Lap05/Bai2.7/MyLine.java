package oop3;

import oop2.MyPoint;

public class MyLine
{
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2){
        this.begin = new MyPoint(x1,y1);
        this.end = new MyPoint(x2,y2);

    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX();
    }

    public int getBeginY(){
        return begin.getY();
    }

    public void setBeginX(int x){
        this.begin.setX(x);
    }

    public void setBeginY(int y){
        this.begin.setY(y);
    }

    public int getEndX(){
        return end.getX();
    }

    public int getEndY(){
        return end.getY();
    }

    public void setEndX(int x){
        this.end.setX(x);
    }

    public void setEndY(int y){
        this.end.setY(y);
    }

    public int[] getBeginXY(){
        int[] array = {begin.getX(), begin.getY()};
        return array;
    }

    public void setBeginXY(int x, int y){
        this.begin.setX(x);
        this.begin.setY(y);
    }

    public int[] getEndXY(){
        int[] array = {end.getX(), end.getY()};
        return array;
    }

    public void setEndXY(int x, int y){
        this.end.setX(x);
        this.end.setY(y);
    }

    public double getLength(){
        return this.begin.distance();
    }

    public double getGradient(){
        return Math.atan2(this.begin.getY(), this.begin.getX());
    }

    public String toString(){
        return "MyLine[begin = (" + this.begin.getX() + "," + this.begin.getY() + "), end = (" + this.end.getX() + "," + this.end.getY() + ")]";
    }
}
