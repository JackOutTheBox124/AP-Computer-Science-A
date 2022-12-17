package UnitFive.LessonEight.U5_L8_Coding_Activity;

public class Car {
  private String make;
  private String model;
  private int year;
  private double mpg;
  private static int num = 0;
  private int carID;

  /** Constructs a new car with make and model set to "None", year set to 0 and MPG set to 0. */
  public Car() {
    make = "None";
    model = "None";
    year = 2000;
    mpg = 0;
    num++;
    carID = num;
  }

  /**
   * Constructs a new car with variables initialized to the values specified. The year should not be greater than 2022.
   * @param make a string representing the make of the car
   * @param model a string representing the model of the car
   * @param year an integer representing the year the car was made
   * @param mpg a double representing the miles per gallon
   */
  Car(String make, String model, int year, double mpg) {
    this.make = make;
    this.model = model;
    this.year = year >= 1885 ? Math.min(year, 2022) : 2000;
    this.mpg = mpg >= 0 ? mpg : 0;
    num++;
    carID = num;
  }

  /**
   * Returns the car information as a String in the following format:
   * <pre>
   *   Id: carID
   *   Make: carMake
   *   Model: carModel
   *   Year: carYear
   *   MPG: carMpg
   * </pre>
   * @return
   */
  @Override
  public String toString() {
    return "Id: " + carID +
         "\nMake: " + make +
         "\nModel: " + model +
         "\nYear: " + year +
         "\nMPG: " + mpg;
  }
}
