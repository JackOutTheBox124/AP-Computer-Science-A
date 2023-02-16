## Unit 7 Lab: AddressBook

This lab will consist of 4 classes that will simulate adding and sorting contacts into an address book.
None of the classes will extend any other class. The idea for this lab will be to create objects of different data types (Person, Cell, Contact) and
review the concepts of searching data, sorting data, String processing, ArrayLists, and class design. After each class, attach the.java file to
the lab. Download the template for each class with some code and/or the comments already completed. After each class I will review the
results with you so you can compare what you wrote with the requirements.


### Person.java 
```
/** Unit 7 Lab: AddressBook
* Person.java constructs a Person object
to be used to
* create a Contact object to add to an
address book of contacts
* @author: YOURNAME
* @version CURRENT DATE
*/
```
```
IMPORTS:
java.util.Scanner
```
#### Instance variables:

```
String first
String last
String fullName
```
#### Methods:

```
String getFirst()
String getLast()
String toString()
```
### Cell.java 
```
/** Unit 7 Lab: AddressBook
* Cell.java constructs a Cell object that
contains valid 10 digit cell phone number
* or defaults to all zeros if a valid
number is not entered
* Object is to be used to add to an
address book of contacts
* @author:YOURNAME
* @version CURRENT DATE
*/
```
```
IMPORTS:
java.util.Scanner
```
#### Instance variables:

```
Person person
Cell cell
```
#### Methods:

```
String
validNum(String n)
```
```
String toString()
```

#### Contact.java 
```
/** Unit 7 Lab: AddressBook
* Contact.java constructs a Contact
object that contains a name and cell phone
number
* to be used to add to an address book of
contacts
* @author: YOURNAME
* @version CURRENT DATE
*/
```
```
IMPORTS:
NONE
```
#### Instance variables:

```
String number
```
#### Methods:

```
Person getPerson()
String toString()
```

### AddressBook.java
```
/** Unit 7 Lab: AddressBook: Client file
that creates and sorts an address book
* to be used to add to an address book of
contacts
* @author: YOURNAME
* @version CURRENT DATE
*/
```
```
IMPORTS:
java.util.Scanner
java.util.ArrayList
```
#### Main method variables:

```
ArrayList<Contact> contacts
= new ArrayList<Contact>()
```
```
int count (for num of
contacts
```
```
static void
sortContacts(Array
List<Contact>
list)
```
```
static void
findContact(ArrayL
ist<Contact> list)
```

## EVALUATION

#### Person.java 5 pts


- [ ] Constructor assigns the first and last name of the contact through prompting the user to enter both separately(1 pt)
- [ ] Constructor joins the first and last name entered to the instance variable fullName (1 pt)
- [ ] Accessor methods for first and last name return the values (1 pt)
- [ ] toString() returns String that is the full name of the Person, in the form first + space + last(2 pts)
## Cell.java 8 pts

- [ ] Constructor prompts user to enter a 10-digit number with no spaces or special characters(1 pt)
- [ ] Constructor calls the validNum(number) method(2 pts)
- [ ] validNum(number)method checks the number entered is exactly a 10-digit number with no spaces or special characters
- [ ] Assigns the 10 digit String 0000000000 otherwise(1pt)
- [ ] Return String that is length of 10 characters between 48-57 on ASCII(2 pts)
- [ ] toString() method returns String that is the number in the form (000)000-0000(2 pts)

## Contact.java 5 pts

- [ ] Constructor assigns the instance variables Person person and Cell cell using the parameters of a Person p and Cell c (1 pt)
- [ ] Accessor method getPerson()returns the person instance variable (1 pt)
- [ ] toString() method returns String in the form "Contact:" + person.toString() + "\n" + "Cell: " + cell.toString() (2 pts)

## AddressBook.java(Client/runner file) 17 pts

- [ ] Using the partially written Insertion Sort method header and variables, finish the “while loop” that goes backwards. (4 pts)
- [ ] Keep comparing the contactToSort with the previous contact’s last name until we find a greater value, or we get to the start of the list
- [ ] Write one line of code outside the while loop (but inside the for loop) in the insertion sort method that swaps the names to put them in order. (2 pts)
- [ ] HINT: revisit the insertion sort code attached to the assignment that was done with integers, and adapt the code to Strings.
- [ ] Write the void method findContact(ArrayList<Contact>list)that finds all contacts from an ArrayList of contacts
- [ ] User is prompted to enter a first or last name to find (2 pts)
- [ ] Name is changed to title case in the method(2 pts)
- [ ] Method prints up the contacts found or Name(s) not found otherwise(2 pts)
- [ ] Write a while loop in your main method that adds contacts to the ArrayList<Contacts> contacts (3 pts)
- [ ] The loop should first create a newPerson p object,then a Cell c object, then add p,cas a new Contact
- [ ] Write a for-each loop in your main method that prints the unsorted contact list, and then the sorted contact list (2 pts)

## TOTAL = ______________/ 35 pts


