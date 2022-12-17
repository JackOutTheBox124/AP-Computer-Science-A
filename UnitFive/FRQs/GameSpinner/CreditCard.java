package UnitFive.FRQs.GameSpinner;

/** A utility class for validating credit card numbers. */
public class CreditCard {

  /**
   * Validates a given credit card number.
   *
   * @param number the credit card number to validate
   * @return true if the credit card number is valid, false otherwise
   */
  public static boolean validate(long number) {
    // Convert the credit card number to a string
    String numStr = String.valueOf(number);
    // Get the length of the credit card number
    int numLength = numStr.length();

    // Validate the length of the credit card number
    if (numLength < 13 || numLength > 16) {
      // Credit card numbers must have a length of at least 13 digits and at most 16 digits
      return false;
    }

    // Validate the first digit of the credit card number
    char firstDigit = numStr.charAt(0);
    if (firstDigit != '4' && firstDigit != '5' && firstDigit != '3' && firstDigit != '6') {
      // The first digit of a valid credit card number must be 4, 5, 3, or 6
      return false;
    }

    // Initialize the sum to 0
    int sum = 0;

    // Loop through the credit card number and sum the digits, applying the Luhn algorithm
    // Start at the second-to-last digit and work backwards, adding the result of doubling every other digit to the sum
    for (int i = numLength - 2; i >= 0; i -= 2) {
      int digit = Character.getNumericValue(numStr.charAt(i));
      sum += digit * 2;
      if (digit >= 5) {
        // If the doubled digit is greater than or equal to 5, subtract 9 from the sum
        sum -= 9;
      }
    }
    // Now, start at the last digit and work backwards, adding every other digit to the sum
    for (int i = numLength - 1; i >= 0; i -= 2) {
      sum += Character.getNumericValue(numStr.charAt(i));
    }

    // Return true if the sum is divisible by 10, false otherwise
    return sum % 10 == 0;
  }
}