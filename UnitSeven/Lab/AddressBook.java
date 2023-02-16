package UnitSeven.Lab;

import java.util.ArrayList;
import java.util.Scanner;

/** Unit 7 Lab: AddressBook: Client file that creates and sorts an address book
 * to be used to add to an address book of contacts
 * @author Jack
 * @version 10-FEB-2023
 */
public class AddressBook
{

  /**Void method that sorts an ArrayList of contacts by the last name using the Insertion Sort Algorithm this list
   * using getter methods getPerson() and getLast() to isolate the last name
   * @param list {@link ArrayList} of contacts
   */
  public static void sortContacts(ArrayList<Contact> list)
  {
    //DECLARING VARIABLES TO MAKE METHOD EASIER TO READ
    int pointer;
    Contact contactToSort;  //using this like a temp variable
    String lastToCompare;  //need to get to the String lastName

//START THE POINTER AT POSITION 1 AND LOOK BACKWARDS USING 2ND LOOP
    //REMEMBER: OUTSIDE LOOP IS USED TO KEEP TRACK OF THE CURRENT POSITION AND REASSIGN THE POINTER

    for(int i = 1; i < list.size(); i++)
    {
      pointer = i;
      lastToCompare = list.get(i).getPerson().getLast();
      contactToSort = list.get(i);

      /* WHILE GOING BACKWARDS, KEEP COMPARING THE contactToSort WITH THE PREVIOUS CONTACT's last name
       * UNTIL WE FIND A GREATER VALUE OR WE GET TO THE START.
       */

      while (pointer > 0 && (list.get(pointer-1).getPerson().getLast()).compareTo(lastToCompare) > 0 ) //similar to (a[pointer-1] >= valueToSort)
      {
        list.set(pointer, list.get(pointer - 1));
        pointer--;
      }
      list.set(pointer, contactToSort);
    }
  }

  /**Void method that finds all contacts from an ArrayList of contacts
   * by prompting the user to enter a first or last name to find
   * and changing the name to title case
   * Prints up the contacts found or Name(s) not found otherwise
   * @param list {@link ArrayList} of contacts
   */
  public static void findContact(ArrayList<Contact> list) {
    //insert code here
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a first or last name to find: ");
    String name = scan.nextLine();
    name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    // find contact containing name

    boolean found = false;
    System.out.println("Name(s) found:");
    for (Contact contact : list) {
      if (contact.getPerson().getFirst().equals(name) || contact.getPerson().getLast().equals(name)) {
        System.out.println(contact.toString());
        found = true;
      }
    }
    if (!found) {
      System.out.println("Name(s) not found.");
    }
  }

  //********************************************************************************
//MAIN METHOD
  public static void main(String []args)
  {
    Scanner scan = new Scanner(System.in);

    //CREATE A NEW ARRAYLIST OF CONTACT OBJECCTS
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    //PROMPT THE USER FOR HOW MANY CONTACTS TO ADD
    System.out.println("How many contacts would you like to add?");

    int count = scan.nextInt();

    //ADD PERSON AND CELL OBJECTS AS A CONTACT TO THE ARRAYLIST
    while (count > 0) {
      Person person = new Person();
      Cell cellPhone = new Cell();
      Contact contact = new Contact(person, cellPhone);

      contacts.add(contact);
      count--;
    }

    //PRINTS THE UNSORTED ADDRESS BOOK
    //insert for each loop
    System.out.println("Final UNSORTED AddressBook:");
    for (Contact contact : contacts) {
      System.out.println(contact.toString());
    }

    //CALL TO THE sortContacts(contacts)  METHOD
    sortContacts(contacts);

    System.out.println("Final SORTED AddressBook:");
    //PRINTS THE SORTED ADDRESS BOOK
    //insert for each loop
    for (Contact contact : contacts) {
      System.out.println(contact.toString());
    }

    //CALL TO THE findContact(contacts)  METHOD
    findContact(contacts);

  }
}