package Bai2_1;

public class Line
{
    private Point begin;
    private Point end;

    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY){
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX();
    }

    public int getBeginY(){
        return begin.getY();
    }

    public int getEndX(){
        return end.getX();
    }

    public int getEndY(){
        return end.getY();
    }

    public void setBeginX(int beginX){
        begin.setX(beginX);
    }

    public void setBeginY(int beginY){
        begin.setY(beginY);
    }

    public void setEndX(int endX){
        end.setX(endX);
    }

    public void setEndY(int endY){
        end.setY(endY);
    }

    public void setXY(int endX, int endY){
        end.setX(endY);
        end.setY(endY);
    }

    public String toString(){
        return "BeginX = " + getBeginX() + " and BeginY = " + getBeginY() + " and EndX = " + getEndX() + " and EndY = " + getEndY();
    }

    public double getLength(){
        return Math.sqrt(Math.pow(getBeginX() - getEndX(), 2) + Math.pow(getBeginY() - getEndY(), 2));
    }

    public double getGradient(){
        return Math.atan2(Math.abs(getEndY() - getBeginY()), Math.abs(getEndX() - getBeginX()));
    }

}
