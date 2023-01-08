package visitor.exercise.bai2;

public class Computer implements ComputerPart
{
    private ComputerPart[] computerParts;

    public Computer(ComputerPart[] computerParts){
        this.computerParts = computerParts;
    }

    public void accept(ComputerPartVisitor computerPartVisitor){
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);

    }
}
