public class Book {
    private String title; // Book's title
    private Author author; // Book's author
    private double price;  // Book's price
    private int qty;       // Book's quantity

    // Constructor to initialize Book
    public Book(String title, Author author, double price, int qty) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getter for title
    public String getName() {
        return title;
    }

    // Getter for author
    public Author getAuthor() {
        return author;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for quantity
    public int getQty() {
        return qty;
    }

    // Setter for quantity
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Override toString method
    @Override
    public String toString() {
        return "'" + title + "' by " + author.toString();
    }
}
