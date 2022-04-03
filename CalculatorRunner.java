import java.util.Scanner;

public class CalculatorRunner extends Runner {
    @Override
    public void run() {
        System.out.print("Expression> ");
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();
        Calculator running = new Calculator(exp);
        System.out.println("Original expression: " + exp + "\n" +
                "Tokenized expression: " + running.getTokens().toString() + "\n" +
                "Reverse Polish Notation: " + running.getReverse_polish().toString() + "\n" +
                "Final result: " + String.format("%.2f", running.getRes()));

    }

    @Override
    public String desc() {
        return "Calculator";
    }
}
