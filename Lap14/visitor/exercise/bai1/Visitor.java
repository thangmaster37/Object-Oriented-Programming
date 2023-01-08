package visitor.exercise.bai1;

public interface Visitor
{
    void visit(BusinessBook book);

    void visit(DesignPatternBook book);

    void visit(JavaCoreBook book);

}
