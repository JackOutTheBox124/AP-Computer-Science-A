package UnitNine.OpenEndedLab;

import java.util.ArrayList;

public class Bookstore {
  public static void main(String[] args) {
    // Creating objects of different data types
    Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 10.99);
    FictionBook book2 = new FictionBook("The Hobbit", "J.R.R. Tolkien", 12.99, "Fantasy");
    NonFictionBook book3 = new NonFictionBook("A Brief History of Time", "Stephen Hawking", 15.99, "Science");

    // Adding objects to an ArrayList
    ArrayList<Book> bookList = new ArrayList<>();
    bookList.add(book1);
    bookList.add(book2);
    bookList.add(book3);

    // Calling methods on objects stored in the ArrayList (excluding toString)
    for (Book book : bookList) {
      if (book instanceof FictionBook) {
        ((FictionBook) book).displayBookInfo();
      } else if (book instanceof NonFictionBook) {
        ((NonFictionBook) book).displayBookInfo();
      }
      System.out.println();
    }

    // Calling toString on each object in the ArrayList
    for (Book book : bookList) {
      System.out.println(book.toString());
    }
  }
}
