package Bai2_1;

public class LineSub extends Point
{
    Point end;
    public LineSub(int beginX, int beginY, int endX, int endY){
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end){
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public String toString(){
        return "Begin = (" + getX() + "," + getY() + ")" + " End = (" + end.getX() + "," + end.getY() + ")";
    }

    public Point getBegin(){
        return this;
    }

    public Point getEnd(){
        return end;
    }

    public void setBegin(Point point){
        setX(point.getX());
        setY(point.getY());
    }

    public void setEnd(Point point){
        this.end = point;
    }

    public int getBeginX(){
        return getX();
    }

    public int getBeginY(){
        return getY();
    }

    public int getEndX(){
        return end.getX();
    }

    public int getEndY(){
        return end.getY();
    }

    public void setBeginX(int beginX){
        setX(beginX);
    }

    public void setBeginY(int beginY){
        setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY){
        setX(beginX);
        setY(beginY);
    }

    public void setEndX(int endX){
        end.setX(endX);
    }

    public void setEndY(int endY){
        end.setY(endY);
    }

    public void setEndXY(int endX, int endY){
        end.setX(endX);
        end.setY(endY);
    }

    public double getLength(){
        return Math.sqrt(Math.pow(getBeginX() - getEndX(), 2) + Math.pow(getBeginY() - getEndY(), 2));
    }

    public double getGradient(){
        return Math.atan2(Math.abs(getEndY() - getBeginY()), Math.abs(getEndX() - getBeginX()));
    }


}
