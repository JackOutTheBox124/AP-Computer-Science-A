public class TheFishy {
  public static void main(String[] args) {
    long now = System.currentTimeMillis();
    slow();
    System.out.println("slow elapsed " + (System.currentTimeMillis() - now) + " ms");

    now = System.currentTimeMillis();
    fast();
    System.out.println("fast elapsed " + (System.currentTimeMillis() - now) + " ms");
  }
  private static void fast() {
    StringBuilder s = new StringBuilder();
    s.append("*".repeat(100000));
  }

  private static void slow() {
    String s = "";
    for(int i=0;i<100000;i++)
      s+="*";
  }
}