import java.util.ArrayList;

public class ReviewCollector extends Runner {
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

    public ArrayList<ProductReview> getReviewList() {
        return reviewList;
    }

    public ArrayList<String> getProductList() {
        return productList;
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


    public void run() {
//        ReviewCollector r = new ReviewCollector();

        ProductReview p1 = new ProductReview("grape", "the best");
        addReview(p1);
        System.out.println("Review List " + getReviewList().toString());
        System.out.println("Product List " + getProductList().toString());

        ProductReview p2 = new ProductReview("grape", "the best");
        addReview(p2);
        System.out.println("Review List " + getReviewList().toString());
        System.out.println("Product List " + getProductList().toString());

        ProductReview p3 = new ProductReview("crimson", "also the best");
        addReview(p3);
        System.out.println("Review List " + getReviewList().toString());
        System.out.println("Product List " + getProductList().toString());

        ProductReview p4 = new ProductReview("blue", "average L haver");
        addReview(p4);
        System.out.println("Review List " + getReviewList().toString());
        System.out.println("Product List " + getProductList().toString());

        System.out.println("Number of good reviews for blue: " + getNumGoodReviews("blue"));

    }

    @Override
    public String desc() {
        return "2020 Q3";
    }

}
