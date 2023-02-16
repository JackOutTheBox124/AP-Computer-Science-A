package UnitSeven.FRQ.ProductReview;

public class ProductReviewRunner {

  public static void main(String [] args) {
    // Create ProductReview objects
    ProductReview r1 = new ProductReview("Mr. Fun Rollerskates", "They are the best.");

    ProductReview r2 = new ProductReview("Wespetal Book of Bumpkin Jokes", "You would be a fool to buy this.");

    ProductReview r3 = new ProductReview("Wespetal Book of Bumpkin Jokes", "Waste of money");

    ProductReview r4 = new ProductReview("Lolly pops", "They are the best tasting.");

    ProductReview r5 = new ProductReview("Mr. Fun Rollerskates", "They are the best in the world.");

    ProductReview r6 = new ProductReview("Lolly pops", "They are the best way to become unhealthy.");

    // Creating ReviewCollector objects
    // Add the objects to the reviewList using the method constructed for PART A
    ReviewCollector list = new ReviewCollector();
    list.addReview(r1);
    list.addReview(r2);
    list.addReview(r3);
    list.addReview(r4);
    list.addReview(r5);
    list.addReview(r6);

    // Test the adding of the ProductReview objects to the ReviewCollector Arraylist reviewList (Part A)
    System.out.println("This is the reviewList ArrayList:\n");

    for(int i = 0; i < list.getReviewList().size(); i++) {
      System.out.println(list.getReviewList().get(i)+ "\n");
    }
    //Test the adding of the ProductReview objects to the ReviewCollector Arraylist productList (Part A) if the name has not already been added
    System.out.println("This is the productList ArrayList (Should NOT contain duplicate names):\n");

    for(int i = 0; i < list.getProductList().size(); i++) {
      System.out.println(list.getProductList().get(i));
    }

    //Test the good reviews (Part b) if the review from the ProductList contains the word "best" (all lowercase)
    System.out.println("\nGood reviews (Lolly Pops) should equal 2: " + (list.getNumGoodReviews("Lolly pops")));

    System.out.println("\nGood reviews (Wespetal Book of Bumpkin Jokes) should equal 0: " + (list.getNumGoodReviews("Wespetal Book of Bumpkin Jokes")));
  }
}