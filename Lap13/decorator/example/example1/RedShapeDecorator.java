package decorator.example.example1;

public class RedShapeDecorator extends ShapeDecorator
{
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw(){
        shape.draw();
    }

    public void setRedBorder(Shape shape) {
        System.out.println("Border is red");
    }
}
