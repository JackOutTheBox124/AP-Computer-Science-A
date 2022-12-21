public class GameSpinner_Runner
{
  public static void main(String [] args)
  {
    GameSpinner g = new GameSpinner(4);
    
    //FIRST RUN:
    System.out.println("RUN LENGTH: " + g.currentRun() + " SHOULD EQUAL 0");     
    System.out.println("FIRST RANDOM VALUE: " + g.spin());
    System.out.println("**********************************");
    
    //SECOND RUN:
    System.out.println("RUN LENGTH: " + g.currentRun() + " SHOULD EQUAL 1");     
    System.out.println("SECOND RANDOM VALUE: " + g.spin());
    System.out.println("**********************************");
    
    //THIRD RUN:
    System.out.println("RUN LENGTH: " + g.currentRun() + " SHOULD BE 2 IF LAST TWO RANDOM NUMBERS ARE EQUAL, EQUAL TO 1 OTHERWISE");     
    System.out.println("THIRD RANDOM VALUE: " + g.spin());
    System.out.println("**********************************");
    
    //FOURTH RUN:
    System.out.println("CHECK RUN LENGTH VALUES BELOW. COUNT THE NUMBER OF EQUAL RANDOM NUMS GENERATED IN ROW, AND COMPARE WITH THE RUN LENGTH VALUE");
    System.out.println("RUN LENGTH: " + g.currentRun());     
    System.out.println("FORTH RANDOM VALUE: " + g.spin());
    System.out.println("**********************************");
    
    //FIFTH RUN:
    System.out.println("RUN LENGTH: " + g.currentRun());     
    System.out.println("FIFTH RANDOM VALUE: " + g.spin());
    System.out.println("**********************************");
    
    //SIXTH RUN:
    System.out.println("RUN LENGTH: " + g.currentRun());     
    System.out.println("SIXTH RANDOM VALUE: " + g.spin());
    System.out.println("**********************************");
    
    
  }
}