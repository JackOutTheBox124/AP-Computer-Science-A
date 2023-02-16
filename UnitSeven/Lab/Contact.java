package UnitSeven.Lab;

/** Unit 7 Lab: AddressBook
 * Contact.java constructs a Contact object that contains a name and cell phone number
 * to be used to add to an address book of contacts
 * @author Jack
 * @version 10-FEB-2023
 */

//START OF CLASS
public class Contact {
  Person person;
  Cell cell;

  /** Constructs a Contact object with a full name and cell number
   * @param p {@link Person} object and Cell object
   */
  public Contact(Person p, Cell c) {
    this.person = p;
    this.cell = c;
  }

  /** @return Getter method for Person instance variable */
  public Person getPerson() {
    return person;
  }

  /** @return String that is the full name of the person, and cell number
   * in the form "Contact: " + (the person toString) + "\n" + "Cell: " + (the cell toString)
   */
  public String toString() {
    return "Contact: " + person.toString() + "\n" + "Cell: " + cell.toString();
  }
}