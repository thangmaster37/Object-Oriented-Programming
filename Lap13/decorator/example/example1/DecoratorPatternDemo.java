package decorator.example.example1;

public class DecoratorPatternDemo
{
    public static void main(String[] args)
    {
        Shape shape = new Rectangle();
        shape.draw();
        Shape shapeDecorator = new ShapeDecorator(shape);
        shapeDecorator.draw();
        Shape redShapeDecorator = new RedShapeDecorator(shape);
        redShapeDecorator.draw();
        RedShapeDecorator redShapeDecorator1 = new RedShapeDecorator(shape);
        redShapeDecorator1.setRedBorder(shape);
    }
}
