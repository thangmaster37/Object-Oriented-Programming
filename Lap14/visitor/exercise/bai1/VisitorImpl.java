package visitor.exercise.bai1;

public class VisitorImpl implements Visitor
{
    public void visit(BusinessBook book) {
        System.out.println("BusinessBook");
        System.out.println("Publisher: " + book.getPublisher());
    }

    public void visit(DesignPatternBook book) {
        System.out.println("DesignPatternBook");
        System.out.println("Resource: " + book.getResource());
        System.out.println("Best Seller: " + book.getBestSeller());
    }

    public void visit(JavaCoreBook book) {
        System.out.println("JavaCoreBook");
        System.out.println("Resource: " + book.getResource());
        System.out.println("Favourite Book: " + book.getFavouriteBook());
    }

}
