package UnitThree.Lab;

import java.util.Scanner;

public class Horoscope {
  public static void main(String[] args) {
    // Initiates a new scanner
    Scanner scan = new Scanner(System.in);
    // Initializes two variables to be used later as empty strings
    String zodiac = "";
    String msg = "";

    // asks user for abbreviated month of birth
    System.out.println("In which month were you born? (abbreviate month to first 3 letters)");
    String month = scan.nextLine().toUpperCase();
    // asks user birthdate in month
    System.out.println("What day were you born?");
    int day = scan.nextInt();

    // Switch case using months input from user as cases
    switch (month) {
      case "JAN":
        // if it is the first part of the month, the variable zodiac is set to Capricorn but if it's the second part, it gets set to Aquarius
        if (1 <= day && day <= 19) {
          zodiac = "Capricorn";
        }
        else if (20 <= day && day <= 31) {
          zodiac = "Aquarius";
        }
        break;
      case "FEB":
        if (1 <= day && day <= 18) {
          zodiac = "Aquarius";
        }
        else if (19 <= day && day <= 29) {
          zodiac = "Pisces";
        }
        break;
      case "MAR":
        if (1 <= day && day <= 20) {
          zodiac = "Pisces";
        }
        else if (21 <= day && day <= 31) {
          zodiac = "Aries";
        }
        break;
      case "APR":
        if (1 <= day && day <= 19) {
          zodiac = "Aries";
        }
        else if (20 <= day && day <= 30) {
          zodiac = "Taurus";
        }
        break;
      case "MAY":
        if (1 <= day && day <= 20) {
          zodiac = "Taurus";
        }
        else if (21 <= day && day <= 31) {
          zodiac = "Gemini";
        }
        break;
      case "JUN":
        if (1 <= day && day <= 20) {
          zodiac = "Gemini";
        }
        else if (21 <= day && day <= 30) {
          zodiac = "Cancer";
        }
        break;
      case "JUL":
        if (1 <= day && day <= 22) {
          zodiac = "Cancer";
        }
        else if (23 <= day && day <= 31) {
          zodiac = "Leo";
        }
        break;
      case "AUG":
        if (1 <= day && day <= 22) {
          zodiac = "Leo";
        }
        else if (23 <= day && day <= 31) {
          zodiac = "Virgo";
        }
        break;
      case "SEP":
        if (1 <= day && day <= 22) {
          zodiac = "Virgo";
        }
        else if (23 <= day && day <= 30) {
          zodiac = "Libra";
        }
        break;
      case "OCT":
        if (1 <= day && day <= 22) {
          zodiac = "Libra";
        }
        else if (23 <= day && day <= 31) {
          zodiac = "Scorpio";
        }
        break;
      case "NOV":
        if (1 <= day && day <= 21) {
          zodiac = "Scorpio";
        }
        else if (22 <= day && day <= 30) {
          zodiac = "Sagittarius";
        }
        break;
      case "DEC":
        if (1 <= day && day <= 21) {
          zodiac = "Sagittarius";
        }
        else if (22 <= day && day <= 31) {
          zodiac = "Capricorn";
        }

        // No default statement here, the switch statement below deals with the string being empty
    }
    // Switch case using the zodiacs from users as cases
    switch (zodiac) {
      // sets the value of the msg variable to the corresponding zodiac message
      case "Aries"        -> msg = "You'll have to give more than initially planned, considering what you'll gain.";
      case "Taurus"       -> msg = "This person may not bring anything new to the table, but he or she still has something valuable to offer.";
      case "Gemini"       -> msg = "Protecting what's yours could result in you reaping half the gains. You have to give to get. Be generous, and you can expect the same.";
      case "Cancer"       -> msg = "No sooner do you settle one debt then you're faced with another, but your financial outlook improves after the 22nd.";
      case "Leo"          -> msg = "An associate isn't trying to be deceptive; it's just that this person doesn't know how to break the news.";
      case "Virgo"        -> msg = "Make a point of honoring all obligations -- no matter how tedious and conscientiousness now will be rewarded handsomely later.";
      case "Libra"        -> msg = "You may be penalized for breaking an agreement, but see if you can be compensated for it.";
      case "Scorpio"      -> msg = "You resent being saddled with such a heavy burden, but take it in stride.";
      case "Sagittarius"  -> msg = "The downside to collaboration is running everything you do by someone else, you'll learn a few things too.";
      case "Capricorn"    -> msg = "You need time to yourself, it's the only way to differentiate what you want from what you feel is expected.";
      case "Aquarius"     -> msg = "Quit while you're ahead, bring the discussion to a close and move on.";
      case "Pisces"       -> msg = "Seek an older relative's advice, even if this person doesn't know exactly what you're going through";
      // if there is no zodiac passed through, the default case sets the value of the msg variable to an error
      default             -> msg = "Error entering month or day";
    }
    // prints out horoscope message. If the zodiac variable hasn't been to anything other than what it was initialized as, only the text from the msg variable gets printed
    System.out.println((zodiac.length() > 0 ? zodiac + ": " : "") + msg);
  }
}
