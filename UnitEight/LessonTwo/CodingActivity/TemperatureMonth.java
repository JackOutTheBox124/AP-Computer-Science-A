package UnitEight.LessonTwo.CodingActivity;


// For this assignment, you will complete 4 methods in the TemperatureMonth class. This class has a single member variable temperature which is a 2-D array of double values. Each value represents the average temperature on a single day. Each row of the matrix represents a single week, and the entire matrix represents a month.
//
// Unlike in the Gregorian calendar used in most western countries, in the calendar system used in this class months always consist of a whole number of weeks, however you may not assume that the number of days in a week is 7, or that the number of weeks in a month is 4. In other words the parameter 2-D array may have any number of rows and columns but each row will be the same length.
//
// You will implement the following methods:
//
// getMaxTempWeekly - Returns a 1-d array of doubles, where each double is the maximum temperature for a week (i.e. the first element is the maximum of values in the first row of the temperature array, the second element is the maximum of the second row etc.)
//
// getMinTempWeekly - Returns a 1-d array of doubles, where each double is the minimum temperature for a week (i.e. the first element is the minimum of values in the first row of the temperature array, the second element is the minimum of the second row etc.)
//
// getRange - Returns a double, which is the difference between the maximum temperature in the month and the minimum temperature in the month (i.e. If maximum temperature in the month was 80.0, and the minimum temperature in the month was 62.0, then the method returns 18.0)
//
// getCertainTemp(int week, int day) - Returns a double, which is the temperature on a certain day of the month. It takes in 2 parameters, where the first one is the week and the second parameter is the day of the week (e.g. getCertainTemp(2,3) returns temperature on 3rd week, i.e. 3rd row, for 4th day, i.e. 4th entry on the second row).
//
// For example, if the matrix of temperatures was as follows:
//
//         +------+------+------+------+------+------+------+
//         | 74.4 | 63.5 | 62.8 | 65.6 | 69.9 | 70.9 | 77.3 |
//         +------+------+------+------+------+------+------+
//         | 75.0 | 79.5 | 65.4 | 79.4 | 63.8 | 62.1 | 77.5 |
//         +------+------+------+------+------+------+------+
//         | 71.1 | 68.1 | 62.0 | 71.5 | 60.1 | 76.7 | 74.1 |
//         +------+------+------+------+------+------+------+
//         | 71.0 | 61.6 | 73.2 | 77.2 | 66.9 | 62.7 | 71.4 |
//         +------+------+------+------+------+------+------+
// Then the returns of these methods should be:
//
// getMaxTempWeekly: [77.3 79.5 76.7 77.2 ]
// getMinTempWeekly: [62.8 62.1 60.1 61.6 ]
// getRange: 19.4
// getCertainTemp(2, 3): 71.5 (bolded in the table)
//
// Use the runner class to test your methods but do not add a main method to your TemperatureMonth.java file or your code will not be scored correctly.
public class TemperatureMonth {
  private double[][] temperature;

  public TemperatureMonth(double[][] temperature) {
    this.temperature = temperature;
  }

  public double[] getMaxTempWeekly() {
    double[] result = new double[temperature.length];
    for (int i = 0; i < temperature.length; i++) {
      double max = temperature[i][0];
      for (int j = 1; j < temperature[i].length; j++) {
        if (temperature[i][j] > max) {
          max = temperature[i][j];
        }
      }
      result[i] = max;
    }
    return result;
  }

  public double[] getMinTempWeekly() {
    double[] result = new double[temperature.length];
    for (int i = 0; i < temperature.length; i++) {
      double min = temperature[i][0];
      for (int j = 1; j < temperature[i].length; j++) {
        if (temperature[i][j] < min) {
          min = temperature[i][j];
        }
      }
      result[i] = min;
    }
    return result;
  }

  public double getRange() {
    double max = temperature[0][0];
    double min = temperature[0][0];
    for (double[] doubles : temperature) {
      for (double aDouble : doubles) {
        if (aDouble > max) {
          max = aDouble;
        }
        if (aDouble < min) {
          min = aDouble;
        }
      }
    }
    return max - min;
  }

  public double getCertainTemp(int week, int day) {
    return temperature[week][day];
  }
}