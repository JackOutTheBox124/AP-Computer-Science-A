package UnitFive.ClassCodingActivities.CoinClasses;

public class Coin {
  private int face;
  public Coin() {
    flip();
  }

  public void flip() {
    this.face = (int)(Math.random() * 2);
  }

  public void setSide(int side) {
    if (side == 1) {
      this.face = 1;
    } else {
      this.face = 0;
    }
  }

  public int getSide() {
    return this.face;
  }

  //Returns true if the current face of the coin is heads.
  public boolean isHeads() {
    return(face == 1);
  }

  public String toString() {

    if(face == 1) {
      return ("Heads");
    }
    else {
      return ("Tails");
    }
  }
}
