package UnitSeven.Lab;


import java.util.ArrayList;
import java.util.Scanner;

/** Unit 7 Lab: AddressBook
 * Person.java constructs a Person object to be used to
 * create a Contact object to add to an address book of contacts
 */
public class Person {
  String first;
  String last;
  String fullName;

  /** Constructs a Person object by prompting user to enter a first and last name
   * Changes each entry to title case
   * Assigns entries to the fullName instance variable
   */
  public Person() {
    Scanner scan = new Scanner(System.in);

    //FIRST NAME
    System.out.print("Enter first name: ");
    first = scan.nextLine();
    first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
    //LAST NAME
    System.out.print("Enter last name: ");
    last = scan.nextLine();
    last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
    //FULL NAME in the form first + space + last
    fullName = first + " " + last;
  }

  /** @return Getter method for first name instance variable
   */
  public String getFirst() {
    return first;
  }

  /** @return Getter method for last name instance variable
   */
  public String getLast() {
    return last;
  }

  /** @return String that is the full name of the person, in the form first + space + last
   */
  public String toString() {
    return fullName;
  }
}