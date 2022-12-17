package UnitFive.TIP;

import java.awt.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Contains two overloaded methods called generator. Each method will return a (somewhat) random {@link java.lang.String String} password following the requirements below:
 * <br>
 * {@link PasswordGenerator#generate()} - Returns a random {@link java.lang.String String} password 8 characters long that has EXACTLY one special character, one number, one capital letter, and the rest lower case letters.
 * <br>
 * {@link PasswordGenerator#generate(int)} - Returns a random {@link java.lang.String String} password {@code n} characters long
 */
public class PasswordGenerator {

  private static final Random rand = new Random();

  public static void main(String[] args) throws InterruptedException {
    // creates a new Scanner
    Scanner scan = new Scanner(System.in);
    int len;
    // asks user if they want to designate password length
    System.out.println("Do you want to designate the length of your password? YES/NO");
    String custom = scan.nextLine().toUpperCase();
    // if the user inputs "yes", the program asks for them to then input a password length greater than 5 and loops forever until they enter a number greater than 5
    if (custom.equals("YES")) {
      System.out.println("Enter the length of your password (over 5 characters)");
      len = scan.nextInt();
      if(len <= 5) {
        while(len <= 5) {
          System.out.println("Please enter a value over 5");
          len = scan.nextInt();
        }
      }
      // prompts user to move mouse randomly and then calls the genRand() method to give the Random object rand a unique seed
      System.out.println("Please move your mouse around randomly for the next 12 seconds");
      TimeUnit.SECONDS.sleep(2);
      rand.setSeed(genRand());
      // runs generate method with password length from user input
      System.out.println("Your random password of length " + len + " is: " + generate(len));
    }
    else {
      System.out.println("Please move your mouse around randomly for the next 12 seconds");
      TimeUnit.SECONDS.sleep(2);
      rand.setSeed(genRand());
      // runs generate method without any parameters for a default password length of 8
      System.out.println("Your random password of length 8 is: " + generate());
    }
  }

  /**
   * Returns a random {@link java.lang.String String} password 8 characters long that has EXACTLY one special character, one number, one capital letter, and the rest lower case letters.
   *
   * @return a random {@link java.lang.String String} password 8 characters long.
   */
  public static String generate() {
    // creates a new charArray with a size of 8 elements
    char[] passArr = new char[8];

    // range of 33-47 which has a difference of 14, so I added 33 to the result to get a range of 33 + (number between 0 and 14)
    // special character
    passArr[0] = (char) (rand.nextInt(14 + 1) + 33);
    // range of 48-57 which has a difference of 9, so I added 43 to the result to get a range of 48 + (number between 0 and 9)
    // number
    passArr[1] = (char) (rand.nextInt(9 + 1) + 48);
    // range of 65-90 which has a difference of 25, so I added 65 to the result to get a range of 65 + (number between 0 and 25)
    // capital letter
    passArr[2] = (char) (rand.nextInt(25 + 1) + 65);

    // loop runs 5 times to fill the 5 remaining elements
    // undercase letters
    for (int i = 1; i <= 5; i++) {
      // range of 97-122 which has a difference of 25, so I added 97 to the result to get a range of 97 + (number between 0 and 25)
      passArr[2 + i] = (char) (rand.nextInt(25 + 1) + 97);
    }
    // calls the shuffleArray(char[] arr) method to shuffle the list
    shuffleArray(passArr);
    // returns the password to the user as a joined String
    return new String(passArr);
  }

  /**
   * Returns a random {@link java.lang.String String} password.
   * @param n length of password.
   * @return a random {@link java.lang.String String} password {@code n} characters long.
   */
  public static String generate(int n) {
    // creates a new charArray with a size equal to that of the parameter n
    char[] passArr = new char[n];
    // for loop that loops n times
    for (int i = 0; i < n; i++) {
      // range of 33-122 which has a difference of 89, so I added 33 to the result to get a range of 33 + (number between 33 and 122)
      passArr[i] = (char) (rand.nextInt(89 + 1) + 33);
    }
    // calls the shuffleArray(char[] arr) method to shuffle the list
    shuffleArray(passArr);
    // returns the password to the user as a joined String
    return new String(passArr);
  }

  /**
   * Generates random seed to use for a {@link Random} object that can be used by calling the {@link Random#setSeed(long) Random.setSeed(long seed)} method
   * @return random seed
   * @throws InterruptedException if interrupted while sleeping which occurs while taking mouse input for a random seed
   */
  private static long genRand() throws InterruptedException {
    // idk why i did it like this i just thought itd be a bit more random
    long seed1 = 0;
    long seed2 = 0;
    long seed3 = 0;
    long seed4 = 0;
    long seed5 = 0;

    // for loop to generate the random seed by collecting 10 data points
    for (int i = 0; i < 10; i++) {
      // waits 1 second
      TimeUnit.SECONDS.sleep(1);
      // gets the location of the mouse as a Point object
      Point mouseInfo = MouseInfo.getPointerInfo().getLocation();
      // switch statement to assign values to different seeds depending on the value of i
      switch (i) {
        case 0, 1 -> seed1 += mouseInfo.getX() + mouseInfo.getY();
        case 2, 3 -> seed2 += mouseInfo.getX() + mouseInfo.getY();
        case 4, 5 -> seed3 += mouseInfo.getX() + mouseInfo.getY();
        case 6, 7 -> seed4 += mouseInfo.getX() + mouseInfo.getY();
        default -> seed5 += mouseInfo.getX() + mouseInfo.getY();
      }
    }
    // returns a long equal to all the seed values multiplied together. It at least goes up to an 8k monitor before hitting the max value of a long, i think at least
    return seed1 * seed2 * seed3 * seed4 * seed5;
  }

  /**
   * Modern version of the <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>, modernized for computer use by Richard Durstenfeld in 1964
   * <br>
   * Randomly shuffles the array using the {@link }
   * @param arr char array to shuffle
   */
  private static void shuffleArray(char[] arr) {
    // loops through array
    for (int i = arr.length - 1; i > 0; i--) {
      // sets index to a random integer between 0 and i+1
      int index = rand.nextInt(i + 1);
      // temp char value so the element of arr at index is not lost when it gets a new value
      char temp = arr[index];
      // moves element i of arr to element index of arr
      arr[index] = arr[i];
      // assigns the char value stored in temp to element i of arr
      arr[i] = temp;
    }
  }
}