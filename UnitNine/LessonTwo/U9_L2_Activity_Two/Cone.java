package UnitNine.LessonTwo.U9_L2_Activity_Two;

public class Cone
{

  private String flavor;
  private boolean waffle;

  public Cone(String f, boolean w)
  {
    waffle = w;
    flavor = f;
  }

  public void setFlavor(String f)
  {
    flavor = f;
  }

  public String toString()
  {
    String s = "";
    if (waffle)
      s += "waffle ";
    s += "cone with " + flavor;
    return s;
  }

}