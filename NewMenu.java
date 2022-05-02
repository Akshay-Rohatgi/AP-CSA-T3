import java.util.HashMap;
import java.util.Scanner;

public class NewMenu {
    public static void main(String[] args) {
        newMenu();
    }

    public static void newMenu() {
        HashMap<Integer, Runner> menuOpts = new HashMap<Integer, Runner>();

        // Add items to hashmap of menu options, add menu # and then runner class associated with it
        menuOpts.put(1, new HelloWorld());
        menuOpts.put(2, new Matrix(new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} }));
        menuOpts.put(3, new IntByReference(1));
        menuOpts.put(4, new tt1chall1());
        menuOpts.put(5, new tt1chall2());
        menuOpts.put(6, new tt1chall3());
        menuOpts.put(7, new CalculatorRunner());
        menuOpts.put(8, new TestRunner());
        menuOpts.put(9, new DiverseArray());
        menuOpts.put(10, new HiddenWord("foo"));
        menuOpts.put(11, new SparseArray());
        menuOpts.put(12, new MultipleGroups());
        menuOpts.put(13, new Hailstone());
        menuOpts.put(14, new GameSpinner(12));
        menuOpts.put(15, new ReviewCollector());
        menuOpts.put(16, new Theater(3, 2, 1));
        menuOpts.put(17, new Leave());

        while ( true ) {
            System.out.println("-------------------------");
            System.out.println("Choose from these choices");
            System.out.println("-------------------------\n");
            // Loop through and print descriptions
            for (int i = 0; i < menuOpts.size(); i++) {
                System.out.println((i + 1) + " : " + menuOpts.get(i + 1).desc());
            }

            System.out.print("num> ");

            // Try running user-specified option
            Scanner blue = new Scanner(System.in);
            menuOpts.get(blue.nextInt()).run();
//            try {
//
//                Scanner blue = new Scanner(System.in);
//                menuOpts.get(blue.nextInt()).run();
//
//            } catch (Exception e) {
//
//                System.out.println("Invalid Input");
//
//            }
        }
    }

}
