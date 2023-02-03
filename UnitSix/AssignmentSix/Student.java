package UnitSix.AssignmentSix;

public class Student
{
  private String name;
  private double gpa;
  private int year;

  public Student(String name, double gpa, int year)
  {
    this.name = name;
    this.gpa = gpa;
    this.year = year;
  }

  public String getName()
  {
    return this.name;
  }

  public double getGpa()
  {
    return this.gpa;
  }

  public int getYear()
  {
    return this.year;
  }

  public String toString()
  {
    return "{\n\tname: " + this.name + ",\n\tgpa: " + this.gpa + ",\n\tyear: " + this.year + "\n}";
  }
}
