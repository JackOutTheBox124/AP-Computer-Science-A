package UnitFive.FRQs.GameSpinner;

public class GameSpinner{
    private int sectors;
    private int currentRun;
    private int last_spin;
    private int spin;
    public GameSpinner(int s){
       if (s > 0){
          sectors = s;
       }
       else {
          sectors = 1;
       }
      }
    public int currentRun(){
       return(currentRun);
    }
    public int spin(){
       spin = (int)(Math.random() * sectors) + 1;
       if (last_spin == 0){
          last_spin = spin;
          }
       if (spin == last_spin){
          currentRun++;
       }
       else {
          currentRun = 1;
       }
       last_spin = spin;
       return (spin);
    }
    public int getValue(){
        return(last_spin);
    }
   }