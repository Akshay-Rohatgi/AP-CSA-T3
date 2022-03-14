## Akshay Individual Github Pages

Challenge `TT0`:

I created a new menu that's much more efficient than the original one provided
```java
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
```

Hashmap of `Runner` Objects, each new option/challenge will be a class that extends the Runner object. 

We can't add different types of objects to the hashmap, so we have to use a base Runner abstract class for everything. 

```java
public abstract class Runner {
    public abstract void run();
}
```

Actual switching of values for IntByReference
```java
public class IntByReference extends Runner {

    public void swapToLowHighOrder(IntByReference num) {
        int blue = this.value;
        int red = num.value;

        if (blue > red) {
            num.value = blue;
            this.value = red;
        }

    }

```

Using stringbuilder with nested for loops
```java
@Override
public String toString() {
    int[][] kp = keypad();
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < kp.length; i++) {
        s.append("\n");
        for (int j = 0; j < kp[i].length; j++) {
            if (kp[i][j] < 0) {
                s.append(" ");
            } else {
                s.append(kp[i][j]);
            }
        }
    }

    s.append("\n");
    s.append("\n");

    for (int b = kp.length - 1; b >= 0; b--) {
        s.append("\n");
        for (int c = kp[b].length -1; c >= 0; c--) {
            if (kp[b][c] < 0) {
                s.append(" ");
            } else {
                s.append(kp[b][c]);
            }
        }
    }

    s.append("\n");
    return s.toString();
}
```


