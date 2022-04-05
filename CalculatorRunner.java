import java.util.Scanner;

public class CalculatorRunner extends Runner {
    @Override
    public void run() {
        System.out.print("Expression> ");
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();
        if (exp.toString().equals("test")) {
            this.testDataRunner();

        } else {
            Calculator running = new Calculator(exp);
            System.out.println("Original expression: " + exp + "\n" +
                    "Tokenized expression: " + running.getTokens().toString() + "\n" +
                    "Reverse Polish Notation: " + running.getReverse_polish().toString() + "\n" +
                    "Final result: " + running.getAns());
        }

    }

    public void testDataRunner() {
        Calculator r1 = new Calculator("100 + 200  * 3");
        System.out.println("Original expression: " + "100 + 200  * 3" + "\n" +
        "Tokenized expression: " + r1.getTokens().toString() + "\n" +
        "Reverse Polish Notation: " + r1.getReverse_polish().toString() + "\n" +
        "Final result: " + r1.getAns());
        Calculator r2 = new Calculator("(100 + 200)  * 3");
        System.out.println("Original expression: " + "100 + 200  * 3" + "\n" +
        "Tokenized expression: " + r2.getTokens().toString() + "\n" +
        "Reverse Polish Notation: " + r2.getReverse_polish().toString() + "\n" +
        "Final result: " + r2.getAns());
//        Calculator r3 = new Calculator("100.2 - 99.3");
//        System.out.println("Original expression: " + "100.2 - 99.3" + "\n" +
//                "Tokenized expression: " + r3.getTokens().toString() + "\n" +
//                "Reverse Polish Notation: " + r3.getReverse_polish().toString() + "\n" +
//                "Final result: " + String.format("%.2f", r3.getRes()));
        Calculator r4 = new Calculator("300 % 200");
        System.out.println("Original expression: " + "300 % 200" + "\n" +
        "Tokenized expression: " + r4.getTokens().toString() + "\n" +
        "Reverse Polish Notation: " + r4.getReverse_polish().toString() + "\n" +
        "Final result: " + r4.getAns());
        Calculator r5 = new Calculator("300/200");
        System.out.println("Original expression: " + "300/200" + "\n" +
        "Tokenized expression: " + r5.getTokens().toString() + "\n" +
        "Reverse Polish Notation: " + r5.getReverse_polish().toString() + "\n" +
        "Final result: " + r5.getAns());
        Calculator r6 = new Calculator("200 % 300 + 5 + 300 / 200 + 1 * 100");
        System.out.println("Original expression: " + "200 % 300 + 5 + 300 / 200 + 1 * 100" + "\n" +
        "Tokenized expression: " + r6.getTokens().toString() + "\n" +
        "Reverse Polish Notation: " + r6.getReverse_polish().toString() + "\n" +
        "Final result: " + r6.getAns());
    }

    @Override
    public String desc() {
        return "Calculator";
    }
}
