public class BookListing {
    private double price;
    private Book book;

    public BookListing(Book b, double p) {
        price = p;
        book = b;
    }

    public void printDescription() {
        book.printBookInfo();
        System.out.print(", $" + price);
    }

}
