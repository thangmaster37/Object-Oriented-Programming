package visitor.exercise.bai2;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor
{
    public void visit(Computer computer) {
        System.out.println("Visit computer");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Visit keyboard");
    }

    public void visit(Mouse mouse) {
        System.out.println("Visit mouse");
    }

    public void visit(Monitor monitor) {
        System.out.println("Visit monitor");
    }

}
