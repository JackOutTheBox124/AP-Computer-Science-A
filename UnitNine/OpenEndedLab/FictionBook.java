package UnitNine.OpenEndedLab;

public class FictionBook extends Book {
  private String genre;

  // Default constructor
  public FictionBook() {
    super();
    genre = "";
  }

  // Constructor with parameters
  public FictionBook(String title, String author, double price, String genre) {
    super(title, author, price);
    this.genre = genre;
  }

  // Getter and setter
  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  // Additional method
  public void displayBookInfo() {
    System.out.println("Title: " + getTitle());
    System.out.println("Author: " + getAuthor());
    System.out.println("Price: $" + getPrice());
    System.out.println("Genre: " + genre);
  }

  // toString method
  @Override
  public String toString() {
    return super.toString() + ", Genre: " + genre + "]";
  }
}
