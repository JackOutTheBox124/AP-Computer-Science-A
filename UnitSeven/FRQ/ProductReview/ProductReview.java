package UnitSeven.FRQ.ProductReview;

public class ProductReview
{
  private String name;
  private String review;

  /**Constructs a ProductReview object and intialized the instance variables*/
  public ProductReview(String pName, String pReview) {
    name = pName;
    review = pReview;

  }

  /**Returns the name of the product*/
  public String getName() {
    return name;
  }

  /**Returns the review of the product*/
  public String getReview() {
    return review;
  }

  /**Returns the printed name and review in specified format*/
  public String toString() {
    return "Name: " + name + "\nReview: " + review;
  }
}