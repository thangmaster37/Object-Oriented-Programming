package oop3;

public class TestMain2
{
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        System.out.println(authors[0]);
        System.out.println(authors[1]);
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);

        System.out.println(javaDummy.getAuthorInfos());
        System.out.println(javaDummy.getAuthorNames());
    }
}
