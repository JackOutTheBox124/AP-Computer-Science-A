package UnitOne.ClassCodeAlong;
import java.util.Scanner;
public class DataDemo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
//PRIMITIVE DATA TYPES SMALLEST TO LARGEST:
    //NOTE: if no value is assigned default values are stores (


    //boolean: (only 2 values, t or f)
    boolean value1 = true;
    boolean value2 = false;

    System.out.println(value1 + " " + value2);

    //booleans are used for "conditional" statements-More on that later!
    boolean b = (1==1);
    System.out.println(b);

    // char: (2 ^ 16 combinations!)
    char letter = 'A';
    letter = 125; //WHY can I put an int in here???
    System.out.println("Letter: " + letter);


    // int: (2 ^ 32 combinations from -2147483648 to 2147483647)
    System.out.println("Enter an integer: ");

    int x = scan.nextInt(); // Can I put a decimal/double in here?
    System.out.println("You entered: " + x);

    //Instead of remembering this range, we can use these "final" values

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE); //ADD 1 and observe
    System.out.println(Integer.MAX_VALUE + 1); //Overflow!
    System.out.println(Integer.MIN_VALUE + 1);

    //Double: (2 ^ 64 combinations)
    System.out.println("Enter a decimal number: ");

    double y = scan.nextDouble(); //Can I put an int in here?
    System.out.println("You entered: " + y);

    //An example of a final value that is a double
    System.out.println(Math.PI);
    //Math.PI = 5.2; DOES NOT WORK
    final double TAX_RATE = .03;
    //TAX_RATE = .04; DOES NOT WORK
    System.out.println(TAX_RATE);

    //There is no such method as nextChar() because methods don't work on primitives
    System.out.println("enter a name ");
    String name = scan.nextLine();

    System.out.print("The first letter at " + name + " is:");
    char firstLetter = name.charAt(0);
    System.out.println(firstLetter);

  }

}
