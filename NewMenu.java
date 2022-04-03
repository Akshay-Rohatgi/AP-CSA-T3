import java.util.HashMap;
import java.util.Scanner;

public class NewMenu {
    public static void main(String[] args) {
        newMenu();
    }

    public static void newMenu() {
        HashMap<Integer, Runner> menuOpts = new HashMap<Integer, Runner>();

        menuOpts.put(1, new HelloWorld());
        menuOpts.put(2, new Matrix(new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} }));
        menuOpts.put(3, new IntByReference(1));
        menuOpts.put(4, new tt1chall1());
        menuOpts.put(5, new tt1chall2());
        menuOpts.put(6, new tt1chall3());
        menuOpts.put(7, new Calculator("100 + 200 * 3"));


        while ( true ) {
            System.out.println("-------------------------");
            System.out.println("Choose from these choices");
            System.out.println("-------------------------\n");
            for (int i = 0; i < menuOpts.size(); i++) {
                System.out.println((i + 1) + " : " + menuOpts.get(i + 1).desc());
            }

            System.out.print("num> ");

            try {

                Scanner blue = new Scanner(System.in);

//                if ( blue.nextInt() == 8 ) {
//                    System.exit(0);
//                }

                menuOpts.get(blue.nextInt()).run();

            } catch (Exception e) {

                System.out.println("Invalid Input");
                System.exit(1);

            }
        }
    }

}
