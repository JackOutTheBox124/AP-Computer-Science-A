package UnitNine.LessonOne.U1_L1_Activity_One;

//TODO: javadoc

/**
 * For this coding activity you will need to write a subclass of the Coffee class which you can view in the Coffee.java file. This class has the following attributes: size (String), isSkinny (boolean), shots (int) and type (String). You will not need to edit this class for the exercise.
 *
 * You will write a SpecialityCoffee class which extends the Coffee class, and has the additional attribute flavor (String). You will write 3 constructors for your class: the first will be a default constructor with no parameters which creates a small non-skinny, single-shot latte with vanilla. The second will take three parameters: size, type and flavor and set the relevant attributes to these values, and all other values to default. The final constructor has 5 parameters representing each of the attributes of a SpecialityCoffee. When you have written the constructors, you should add a toString method which prints the SpecialityCoffee as though it was a Coffee object, but adds "with" and the flavor to the end of this String.
 *
 * The table below summarizes the state of the object created by calls to the three different constructors, along with what would be printed by the toString method in each case.
 *
 * new SpecialityCoffee()	new SpecialityCoffee("large", "mocha", "caramel")	new SpecialityCoffee("medium", true, 2, "cappuccino", "gingerbread")
 * size	"small"	"large"	"medium"
 * isSkinny	false	false	true
 * shots	1	1	2
 * type	"latte"	"mocha"	"cappuccino"
 * flavor	"vanilla"	"caramel"	"gingerbread"
 * toString()	"small 1-shot latte with vanilla"	"large 1-shot mocha with caramel"	"medium skinny 2-shot cappuccino with gingerbread"
 * You should test your code by running the main method of the runner class. Do not add a main method to your SpecialityCoffee.java file or your code will not be scored correctly.
 *
 * Note: Be sure your class is spelled "Speciality", not "Specialty".
 * https://not-an-iplogger.com/5r4dXiCe.png
 */
public class SpecialityCoffee extends Coffee {
  private String flavor;

  public SpecialityCoffee() {
    super("small", false, 1, "latte");
    this.flavor = "vanilla";
  }

  public SpecialityCoffee(String size, String type, String flavor) {
    super(size, false, 1, type);
    this.flavor = flavor;
  }

  public SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor) {
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }

  public String toString() {
    return super.toString() + " with " + flavor;
  }
}
