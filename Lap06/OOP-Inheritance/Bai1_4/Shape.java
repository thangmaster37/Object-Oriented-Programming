package Bai1_4;

public class Shape
{
    private String color;
    private boolean filled;

    public Shape(){
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void isFilled(boolean filled){
        this.filled = filled;
    }

    public String toString(){
        return "Shape[color = " + color + ", filled = " + filled + "]";
    }
}
