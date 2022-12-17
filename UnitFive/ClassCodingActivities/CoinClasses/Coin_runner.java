package UnitFive.ClassCodingActivities.CoinClasses;

public class Coin_runner {
  public static void main(String[] args) {
    Coin c = new Coin();
    System.out.println(c);

    for (int i = 0; i < 29; i++) {
      c.flip();
      System.out.println(c.toString());
    }

    c.setSide(1);
    System.out.println(c);

    c.flip();
    System.out.println(c.getSide());
  }
}
