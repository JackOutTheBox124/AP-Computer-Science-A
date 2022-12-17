package UnitFive.FRQs.GameSpinner;

public class GameSpinner {

  private int sectors;
  private int currentRun = 0;
  private int lastNum;

  public GameSpinner(int sectors) {
    this.sectors = sectors;
  }

  public int spin() {
    int num = (int) (Math.random() * sectors) + 1;
    if (num == lastNum || lastNum == 0) {
      currentRun++;
    } else {
      currentRun = 1;
    }
    lastNum = num;
    return num;
  }

  public int getNum() {
    return lastNum;
  }

  public int currentRun() {
    return currentRun;
  }
}