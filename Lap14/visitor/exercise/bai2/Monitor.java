package visitor.exercise.bai2;

public class Monitor implements ComputerPart
{
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
