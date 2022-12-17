package UnitFive.ClassCodingActivities.DieClasses;

/*This class represents a die being rolled.
 * The die can be any number of sides from 4-20.
 *
 * Attributes: Number of sides and face value
 * Behaviors: roll and state of the face value after the roll
 */

public class Die
{
  //DECLARE VARIABLES (die "attributes")
  private int faceValue;
  private int numSides;

  /**This is the default constructor that calls the other constructor and automatically
  puts the default of 6 sides in for the numSides if the user doesn't enter a number.
  This is called "Constructor Chaining"
  */
  public Die() //default constructor
  {

    this(6); //calls the other constructor ("this" must be the first line)
  }

  /**This constructs a die with a default of 4 sides if the user passes a value outside the range of 4-20
  * Then it rolls the die automatically.
  * @param sides number of sides to give the die
  */
  public Die(int sides) //NumSides
  {
    numSides = 4;
    if (sides >= 4 && sides <=20)
    {
      numSides = sides; //this.numSides = numSides;
    }
    roll();
  }

  /** Rolls the die (Mutator method) */
  public void roll()
  {
    faceValue = (int)(Math.random() *numSides +1);
  }

  /** Gets the value of the die face
   * (Accessor method)
  * @return value of die face
  */
  public int getValue()
  {
    return faceValue;
  }

  /** Outputs the value of the die in the form of
  * <pre>
  *   Number of sides: numSides
  *   Random Value: faceValue
  */
  public String toString()
  {
    return "Number of sides: " + numSides + "\n" + "Random Value: " + faceValue;
  }
}