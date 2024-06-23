
public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int quantity;

    public Book(String title, String author, String isbn, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void sellQuantity(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Not enough copies available to sell.");
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Price: " + price + ", Quantity: " + quantity;
    }
}
