package UnitNine.LessonTwo.U9_L2_Activity_One;

/**
 * In this exercise you will return to your <code>SpecialityCoffee</code> class which you created for the last coding
 * activity (a sample solution to this exercise is already provided but you may paste your own code from the previous
 * lesson if you prefer). This time you will override the <code>Coffee</code> method <code>getPrice</code>
 * which returns the price in cents for a given coffee.
 * <br>
 * The <code>SpecialityCoffee</code> method <code>getPrice</code> should return the price given by the
 * <code>Coffee</code> method for that object, plus an extra charge for the flavored syrup.
 * This extra charge is 50 cents if the coffee size is "large" or "extra large", and 30 cents otherwise.
 * <br>
 * You should test your code by running the main method of the runner class.
 * Do not add a main method to your SpecialityCoffee.java file or your code will not be scored correctly.
 */
public class SpecialityCoffee extends Coffee
{

  // Additional member variable
  private String flavor;

  public SpecialityCoffee()
  {
    // Calls super-constructor to create default coffee then sets flavor
    super();
    flavor = "vanilla";
  }

  public SpecialityCoffee(String size, String type, String flavor)
  {
    // Calls constructor below with a mix of parameters and default values
    this(size, false, 1, type, flavor);
  }

  public SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
  {
    // Calls super-constructor to set first 4 variables then sets flavor
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }

  @Override
  public int getPrice() {
    // switch (super.getSize()) {
    //   case "large", "extra large" -> { return super.getPrice() + 50; }
    //   default -> { return super.getPrice() + 30; }
    // }
    switch (super.getSize()) {
      case "large":
      case "extra large":
        return super.getPrice() + 50;
      default:
        return super.getPrice() + 30;
    }
  }

  public String toString()
  {
    // Calls Coffee toString and appends flavor to end
    return super.toString() + " with " + flavor;
  }

}
