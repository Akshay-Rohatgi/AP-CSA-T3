import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    private final String expression;
    private ArrayList<String> tokens;
    private ArrayList<String> reverse_polish;
    private Double result;

    private final Map<String, Integer> SEPARATORS = new HashMap<>();
    {
        // Map<"separator", not_used>
        SEPARATORS.put(" ", 0);
        SEPARATORS.put("(", 0);
        SEPARATORS.put(")", 0);
    }

    private final Map<String, Integer> OPERATORS = new HashMap<>();
    {
        // Map<"token", precedence>
        OPERATORS.put("^", 3);
        OPERATORS.put("*", 3);
        OPERATORS.put("/", 3);
        OPERATORS.put("%", 3);
        OPERATORS.put("+", 4);
        OPERATORS.put("-", 4);
    }

    // Create a 1 argument constructor expecting a mathematical expression
    public Calculator(String expression) {
        // original input
        this.expression = expression;

        // parse expression into terms
        this.termTokenizer();

        // place terms into reverse polish notation
        this.tokensToReversePolishNotation();

        // calculate reverse polish notation
        this.rpnToResult();
    }

    // Term Tokenizer takes original expression and converts it to ArrayList of tokens
    private void termTokenizer() {
        // contains final list of tokens
        this.tokens = new ArrayList<>();

        int start = 0;  // term split starting index
        StringBuilder multiCharTerm = new StringBuilder();    // term holder
        for (int i = 0; i < this.expression.length(); i++) {
            Character c = this.expression.charAt(i);
            if ( isOperator(c.toString() ) || isSeperator(c.toString())  ) {
                // 1st check for working term and add if it exists
                if (multiCharTerm.length() > 0) {
                    tokens.add(this.expression.substring(start, i));
                }
                // Add operator or parenthesis term to list
                if (c != ' ') {
                    tokens.add(c.toString());
                }
                // Get ready for next term
                start = i + 1;
                multiCharTerm = new StringBuilder();
            } else {
                // multi character terms: numbers, functions, perhaps non-supported elements
                // Add next character to working term
                multiCharTerm.append(c);
            }

        }
        // Add last term
        if (multiCharTerm.length() > 0) {
            tokens.add(this.expression.substring(start));
        }
    }

    // Test if token is an operator
    private boolean isOperator(String token) {
        // find the token in the hash map
        return OPERATORS.containsKey(token);
    }

    // Test if token is an separator
    private boolean isSeperator(String token) {
        // find the token in the hash map
        return SEPARATORS.containsKey(token);
    }

    // Compare precedence of operators.
    private Boolean isPrecedent(String token1, String token2) {
        // token 1 is precedent if it is greater than token 2
        return (OPERATORS.get(token1) - OPERATORS.get(token2) >= 0) ;
    }

    private void tokensToReversePolishNotation () {
        // contains final list of tokens in RPN
        this.reverse_polish = new ArrayList<>();

        // stack is used to reorder for appropriate grouping and precedence
        Stack<String> tokenStack = new Stack<String>();
        for (String token : tokens) {
            switch (token) {
                // If left bracket push token on to stack
                case "(":
                    tokenStack.add(token);
                    break;
                case ")":
                    while (tokenStack.peak() != null && !tokenStack.peak().equals("("))
                    {
                        reverse_polish.add( (String)tokenStack.pop() );
                    }
                    tokenStack.pop();
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "%":
                case "^":
                    // While stack
                    // not empty AND stack top element
                    // and is an operator
                    while (tokenStack.peak() != null && isOperator(tokenStack.peak()))
                    {
                        if ( isPrecedent(token, (String) tokenStack.peak() )) {
                            reverse_polish.add((String)tokenStack.pop());
                            continue;
                        }
                        break;
                    }
                    // Push the new operator on the stack
                    tokenStack.add(token);
                    break;
                default:    // Default should be a number, there could be test here
                    this.reverse_polish.add(token);
            }
        }
        // Empty remaining tokens
        while (tokenStack.peak() != null) {
            reverse_polish.add((String)tokenStack.pop());
        }

    }

    public boolean checkIfNum(String item) {
        try {
            int intValue = Integer.parseInt(item);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public ArrayList<String> getReverse_polish() {
        return reverse_polish;
    }

    public ArrayList<String> getTokens() {
        return tokens;
    }


    double res;

    public double getRes() {
        return res;
    }

    // Takes RPN and produces a final result
    private double rpnToResult()
    {
        int a;
        int b;
        // Stack used to hold calculation while process RPN
        Stack calculation = new Stack();

        ArrayList<String> copy = new ArrayList<>();

        System.out.println(reverse_polish);

        for ( int i = 0; i < reverse_polish.size(); i++)
        {
            if (checkIfNum(reverse_polish.get(i)))
            {
                calculation.add(reverse_polish.get(i));

            }
            else
            {
                // Pop the two top entries

                a = Integer.parseInt(calculation.pop().toString());
                b = Integer.parseInt(calculation.pop().toString());
                System.out.println(calculation);
                // Based off of Token operator calculate result

                switch ( (String) reverse_polish.get(i)) {
                    // If left bracket push token on to stack
                    case "(":
                    case ")":
                        calculation.add(a);
                        calculation.add(b);
                        System.out.println(" parentheses " + calculation);
                        break;
                    case "+":
                        calculation.add(a+b);
                        System.out.println(" added " + calculation);
                        break;
                    case "-":
                        calculation.add(a-b);
                        System.out.println(" minus " + calculation);
                        break;
                    case "*":
                        calculation.add(a*b);
                        System.out.println(" multiply " + calculation);
                        break;
                    case "/":
                        calculation.add(a/b);
                        System.out.println(" divide " + calculation);
                        break;
                    case "^":
                        calculation.add(a^b);
                        System.out.println(" power " + calculation);
                        break;
                    default:
                        calculation.add(a);
                        calculation.add(b);
                        System.out.println(" default " + calculation);
                        break;

                }
                //reverse_polish.remove(i);
                System.out.println(calculation);

            }
        }
        res = Double.parseDouble(calculation.pop().toString());
        return res;
    }


}
