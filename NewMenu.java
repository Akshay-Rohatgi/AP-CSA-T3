import java.util.HashMap;
import java.util.Scanner;

public class NewMenu {
    public static void main(String[] args) {
        newMenu();
    }

    public static void newMenu() {
        HashMap<Integer, Runner> menuOpts = new HashMap<Integer, Runner>();

        menuOpts.put(1, new HelloWorld());

        System.out.println("-------------------------");
        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        for (int i = 0; i < menuOpts.size(); i++) {
            System.out.println((i+1) + " : " + menuOpts.get(i+1).toString());
        }

        System.out.print("num> ");

        try {

            Scanner blue = new Scanner(System.in);
            menuOpts.get(blue.nextInt()).run();

        } catch (Exception e) {

            System.out.println("Invalid Input");
            System.exit(1);

        }

    }

}
