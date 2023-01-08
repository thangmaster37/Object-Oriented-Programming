package oop3;

public class Book
{
    private String name;
    private Author[] author;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorInfos() {
        StringBuilder str = new StringBuilder();
        str.append("{ ");
        for (Author author : this.getAuthors()) {
            str.append(String.format("Author[ name = %s, email = %s, gender = %c ],", author.getName(), author.getEmail(), author.getGender()));
        }

        str.delete(str.length() - 1, str.length());
        str.append(" }");

        return str.toString();
    }

    public String toString() {
        return "Book[" +
                "name = '" + name + '\'' +
                ", author = [" + getAuthorInfos() +
                "], price = " + price +
                ", qty = " + qty +
                ']';
    }
    public String getAuthorNames(){
        StringBuilder str = new StringBuilder("");
        for (Author author: this.getAuthors()) {
            str.append(author.getName()).append(",");
        }
        str.delete(str.length()-1, str.length());
        return str.toString();
    }
}
