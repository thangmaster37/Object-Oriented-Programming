package bai1_5;

public class ResizableCircle extends Circle implements Resizable
{
    public ResizableCircle(double radius){
        super(radius);
    }

    public String toString(){
        return "ResizableCircle[Circle[radius = " + radius + "]]";
    }

    public void resize(int percent){
        this.radius *= percent / 100.0;
    }
}
