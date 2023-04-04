package UnitNine.OpenEndedLab;

public class Book {
  private String title;
  private String author;
  private double price;

  // Default constructor
  public Book() {
    title = "";
    author = "";
    price = 0.0;
  }

  // Constructor with parameters
  public Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  // Getters and setters
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // toString method
  @Override
  public String toString() {
    return "Book[Title: " + title + ", Author: " + author + ", Price: $" + price + "]";
  }
}
