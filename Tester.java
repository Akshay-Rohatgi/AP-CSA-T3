import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie","F.D. Bedford");
        myBook.printBookInfo();

        ArrayList<Book> myLibrary = new ArrayList<Book>();

        Book book1 = new Book("Frankenstein", "Mary Shelley");
        Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
//        Book book3 = (Book) new PictureBook("blue", "blue");

        myLibrary.add(book1);
        myLibrary.add(book2);

        System.out.println(myLibrary.toString());

        BookListing listing1 = new BookListing(book1, 10.99);
        listing1.printDescription();

        BookListing listing2 = new BookListing(book2, 12.99);
        listing2.printDescription();

    }
}
