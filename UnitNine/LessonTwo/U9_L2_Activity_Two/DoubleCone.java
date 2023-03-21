package UnitNine.LessonTwo.U9_L2_Activity_Two;

public class DoubleCone extends Cone {

  private String flavor1;
  private String flavor2;
  private String topping;

  public DoubleCone(String f, boolean w) {
    super(f, w);
    flavor1 = f;
    flavor2 = f;
  }

  public DoubleCone(String f1, String f2, boolean w) {
    super(f1, w);
    flavor1 = f1;
    flavor2 = f2;
  }

  public void setFlavor(String f) {
    super.setFlavor(f);
    flavor1 = f;
    flavor2 = f;
  }
  public void setFlavor(String f1, String f2) {
    super.setFlavor(f1);
    flavor1 = f1;
    flavor2 = f2;
  }
  public void addTopping(String t) {
    topping = t;
  }
  public String toString() {
    StringBuilder s = new StringBuilder("double ").append(super.toString());
    if (flavor1.equals(flavor2)) {
      s.append(" x2");
    } else {
      s.append(" and ").append(flavor2);
    }
    if (!topping.equals("")) {
      s.append(" with ").append(topping);
    }
    return s.toString() ;
  }

}