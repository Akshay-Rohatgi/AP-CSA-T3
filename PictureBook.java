public class PictureBook extends Book {
    private String illustrator;

    public PictureBook(String a, String b, String i) {
        super(a, b);
        illustrator = i;
    }

    public void printBookInfo() {
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }
}
