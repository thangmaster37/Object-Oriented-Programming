package visitor.exercise.bai1;

public class BusinessBook implements Book
{
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return "Call Me Fox";
    }

}
