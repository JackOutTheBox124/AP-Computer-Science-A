package UnitSeven.Lab;

import java.util.Scanner;

/** Unit 7 Lab: AddressBook
 * Cell.java constructs a Cell object that contains valid 10 digit cell phone number
 * or defaults to all zeros if a valid number is not entered
 * Object is to be used to add to an address book of contacts
 * @author Jack
 * @version 10-FEB-2023
 */

public class Cell {
  String number;

  Scanner scan = new Scanner(System.in);


  /** Constructs a Cell object by prompting user to enter a 10-digit number with no spaces or special characters and calls the validNum(number) method to do this
   */
  public Cell() {
    System.out.println("Enter a 10 digit cell number with no spaces or special characters:\n");
    number = validNum(scan.nextLine());
  }
  /** Checks the number entered is exactly a 10-digit number with no spaces or special characters
   * Assigns the 10 digit String 0000000000 otherwise
   * @return String that is length of 10 characters between 48-57 on ASCII, called in constructor
   */
  public String validNum(String n) {
    StringBuilder validNumber = new StringBuilder();
    for (int i = 0; i < n.length(); i++) {
      if (n.charAt(i) >= 48 && n.charAt(i) <= 57) {
        validNumber.append(n.charAt(i));
      }
    }
    return validNumber.length() == 10 ? validNumber.toString() : "0000000000";
  }

  /** @return String that is the number in the form (000)000-0000
   */
  public String toString() {
    return "(" + number.substring(0, 3) + ")" + number.substring(3, 6) + "-" + number.substring(6);
  }
}