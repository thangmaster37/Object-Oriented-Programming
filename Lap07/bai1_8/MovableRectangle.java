package bai1_8;

public class MovableRectangle extends MovablePoint implements Movable
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        super(x1, y1, xSpeed, ySpeed);
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    public String toString(){
        return "TotLeft = (" + topLeft.x + ", " + topLeft.y + "), BottomRight = (" + bottomRight.x + ", " + bottomRight.y + ")";
    }

    public void moveUp(){
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown(){
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight(){
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
