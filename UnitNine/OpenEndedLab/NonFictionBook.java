package UnitNine.OpenEndedLab;

public class NonFictionBook extends Book {
  private String subject;

  // Default constructor
  public NonFictionBook() {
    super();
    subject = "";
  }

  // Constructor with parameters
  public NonFictionBook(String title, String author, double price, String subject) {
    super(title, author, price);
    this.subject = subject;
  }

  // Getter and setter
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  // Additional method
  public void displayBookInfo() {
    System.out.println("Title: " + getTitle());
    System.out.println("Author: " + getAuthor());
    System.out.println("Price: $" + getPrice());
    System.out.println("Subject: " + subject);
  }

  // toString method
  @Override
  public String toString() {
    return super.toString() + ", Subject: " + subject + "]";
  }
}
