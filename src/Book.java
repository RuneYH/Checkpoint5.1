public class Book {
    private String t;
    private String author;
    private int price;

    public void setTitle(String title) {
        this.t = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void printBookDetails() {
        System.out.println("Title: " + this.t);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println();
    }
}