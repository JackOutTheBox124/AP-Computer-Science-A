package UnitSeven.FRQ.ProductReview;

import java.util.ArrayList;


public class ReviewCollector
{
  private ArrayList<ProductReview> reviewList;
  private ArrayList<String> productList;


  /**Constructs a ReviewCollector object and intialized the instance variables*/
  public ReviewCollector() {
    reviewList = new ArrayList<ProductReview>();
    productList = new ArrayList<String>();
  }

//PART A
  /**Adds a new review to the collection of the reviews, as described in part(a)*/
  public void addReview(ProductReview prodReview) {
    reviewList.add(prodReview);
    if(!productList.contains(prodReview.getName())) {
      productList.add(prodReview.getName());
    }
  }
//PART B
  /**Returns the number of good reviews for a given product nsmer, as described in part (b)
   The review is consider good if it contains the string "best" (all lowercase), returns 0 otherwise
   */
  public int getNumGoodReviews(String prodName) {
    int goodReviews = 0;
    for(ProductReview p : reviewList) {
      if(p.getName().equals(prodName) && p.getReview().contains("best")) {
        goodReviews++;
      }
    }
    return goodReviews;
  }

  /**Returns the String ArrayList of the productList*/
  public ArrayList<String> getProductList() {
    return productList;
  }

  /**Returns the ProductReview ArrayList of the reviewList*/
  public ArrayList<ProductReview> getReviewList() {
    return reviewList;
  }
}