package visitor.exercise.bai1;

public class DesignPatternBook implements ProgrammingBook
{
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getResource() {
        return "Head First Design Patterns";
    }

    public String getBestSeller() {
        return "HUS";
    }

}
