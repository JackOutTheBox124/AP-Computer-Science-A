package FRQs.GameSpinner;
import java.util.Scanner;
public class GameSpinner_Game{
   public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      GameSpinner s1 = new GameSpinner(10);
      GameSpinner s2 = new GameSpinner(10);
      GameSpinner s3 = new GameSpinner(10);
      boolean escape = false;
      double wallet = 1000;
      double mult = 1;
      System.out.println("Welcome to Game Spinner!");
      while (escape == false && wallet >= 0){
         System.out.println("Which wheel would you like to spin?");
         System.out.println(" (1) Normal Spinner \n (2) Double Spinner \n (3) Slot Machine \n (4) Coin Flip \n (5) Lucky Wheel \n (6) Mystery Wheel \n (7) Good and Evil Wheel \n (8) THE WHEEL OF DOOM! \n (0) Escape");
         System.out.println("Wallet: " + wallet);
         int spinner = scan.nextInt();
         switch (spinner){
            case 0:
               System.out.println("You can never escape your fate");
               escape = true;
               break;
            case 1:
               s1.spin();
               if (s1.getValue() % 2 == 1){
                    System.out.println("You Spun a " + s1.getValue() + " You Lose " + (((100 * ((s1.getValue() + 1)/2)) + 10)  - (10 * mult)) + " buckaroos");
                    wallet = wallet - (((100 * ((s1.getValue() + 1)/2)) + 10)  - (10 * mult));
                    }
                if (s1.getValue() % 2 == 0){
                    System.out.println("You Spun a " + s1.getValue() + " You Won " + ((100 * (s1.getValue() / 2)) * mult) + "buckaroos");
                    wallet = wallet + ((100 * (s1.getValue() / 2)) * mult);
                     }
               break;
               case 2:
                  s1.spin();
                  s2.spin();
                  if (s1.getValue() == s2.getValue()){
                     System.out.println("DOUBLE!");
                     wallet = wallet + (200 * mult);
                  }
                  System.out.println("Wheel 1:");
                  if (s1.getValue() % 2 == 1){
                     System.out.println("You Spun a " + s1.getValue() + " You Lose " + (((100 * ((s1.getValue() + 1)/2)) + 10)  - (10 * mult)) + " buckaroos");
                     wallet = wallet - (((100 * ((s1.getValue() + 1)/2)) + 10)  - (10 * mult));
                  }
                  if (s1.getValue() % 2 == 0){
                     System.out.println("You Spun a " + s1.getValue() + " You Won " + ((100 * (s1.getValue() / 2)) * mult) + "buckaroos");
                     wallet = wallet + ((100 * (s1.getValue() / 2)) * mult);
                  }
                  System.out.println("Wheel 2:");
                  if (s1.getValue() % 2 == 1){
                     System.out.println("You Spun a " + s2.getValue() + " You Lose " + (((100 * ((s2.getValue() + 1)/2)) + 10)  - (10 * mult)) + " buckaroos");
                     wallet = wallet - (((100 * ((s2.getValue() + 1)/2)) + 10)  - (10 * mult));
                  }
                  if (s1.getValue() % 2 == 0){
                     System.out.println("You Spun a " + s2.getValue() + " You Won " + ((100 * (s2.getValue() / 2)) * mult) + "buckaroos");
                     wallet = wallet + ((100 * (s2.getValue() / 2)) * mult);
                  }
                  break;
               case 3:
                  s1.spin();
                  s2.spin();
                  s3.spin();
                     System.out.println(s1.getValue() + " " + s2.getValue() + " " + s3.getValue());
                  if (s1.getValue() == s2.getValue() && s2.getValue() == s3.getValue()){
                     System.out.println("JACKPOT! \n YOU WON: " + (1000 * mult) + " Buckaroos");
                     wallet = wallet + (1000 * mult);
                  }
                  else if (s1.getValue() == s2.getValue() || s2.getValue() == s3.getValue() || s3.getValue() == s1.getValue()){
                     System.out.println("DOUBLE!");
                     wallet = wallet + (250 * mult);
                  }
                  else {
                     System.out.println("No Matches");
                     wallet = wallet - 100;
                  }
                  break;
               case 4:
                  s1.spin();
                  if (s1.getValue() % 2 == 1){
                     System.out.println("HEADS \n You Got " + (500 * mult) + " Buckaroos");
                     wallet = wallet + (500 * mult);
                     }
                  if (s1.getValue() % 2 == 0){
                     System.out.println("TAILS \n You Lost " + (510 - (10 * mult)) + " Buckaroos");
                     wallet = wallet - (510 - (10 * mult));
                     }
                  break;
               case 5:
                  s1.spin();
                  System.out.println("You walk into an empty room \n The only thing you see is an ominous light \n Nothing seemed to have happened. But, you feel... different?");
                  if (s1.getValue() % 2 == 1){
                     mult = mult - (s1.getValue() * 0.05) + (s1.currentRun() * 0.01);
                     }
                  if (s1.getValue() % 2 == 0){
                      mult = mult + (s1.getValue() * 0.05) + (s1.currentRun() * 0.01);
                  }
                  
                 
  

               
         }
         wallet = wallet % 0.01;
         if (wallet < 0){
            System.out.println("Get outa here brokey! \n Never come back!");
         }
      }






   }
}            