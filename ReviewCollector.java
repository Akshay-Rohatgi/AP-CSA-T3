import java.util.ArrayList;

public class ReviewCollector {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    public void addReview(ProductReview prodReview) {
        reviewList.add(prodReview);
        boolean found = false;

        for (String p : productList) {
            if ( prodReview.getName().equals(p)) {
                found = true;
            }
        }

        if (!found) {
            productList.add(prodReview.getName());
        }


    }

    public int getNumGoodReviews(String prodName) {
        int n = 0;
        for (String p : productList) {
            if ((p.indexOf(prodName) != -1) && (p.indexOf("best") != -1)) {
                n += 1;
            }
        }
        return n;
    }

}
