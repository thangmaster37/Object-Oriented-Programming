package visitor.exercise.bai1;

public class JavaCoreBook implements ProgrammingBook
{
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getResource() {
        return "Youtube: Java tutorial";
    }

    public String getFavouriteBook() {
        return "300 bài code thiếu nhi";
    }

}
