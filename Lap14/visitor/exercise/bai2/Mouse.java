package visitor.exercise.bai2;

public class Mouse implements ComputerPart
{
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
