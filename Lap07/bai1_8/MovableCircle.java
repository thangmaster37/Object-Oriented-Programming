package bai1_8;

public class MovableCircle extends MovablePoint implements Movable
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        //center = new MovablePoint(x, y, xSpeed, ySpeed);
        super(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    public String toString(){
        return "(" + x + "," + y + "), speed = (" + x + ", " + y + "), radius = " + radius;
    }

    public void moveUp(){
        this.y -= ySpeed;
    }

    public void moveDown(){
        this.y += ySpeed;
    }

    public void moveLeft(){
        this.x -= xSpeed;
    }

    public void moveRight(){
        this.x += xSpeed;
    }
}
