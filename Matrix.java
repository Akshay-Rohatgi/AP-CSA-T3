import java.util.Arrays;

public class Matrix extends Runner {
    private final int[][] matrix;

    // store matrix
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // Hack: create toString method using nested for loops to format output of a matrix


    @Override
    public String toString() {
        int[][] kp = keypad();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < kp.length; i++) {
            s.append("\n");
            for (int j = 0; j < kp[i].length; j++) {
                if (kp[i][j] < 0) {
                    s.append(" ");
//                    System.out.print(" ");
                } else {
                    s.append(kp[i][j]);
//                    System.out.print(kp[i][j]);
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
//                    System.out.print(" ");
                } else {
                    s.append(kp[b][c]);
//                    System.out.print(kp[i][j]);
                }
            }
        }

        s.append("\n");
//        System.out.println(s);
        return s.toString();
    }

    public String toString(boolean x) {
        int[][] num = numbers();
        StringBuilder s2 = new StringBuilder();
        for (int r = 0; r < num.length; r++) {
            s2.append("\n");
            for (int t = 0; t < num[r].length; t++) {
                s2.append(num[r][t]);
            }

        }

        s2.append("\n");
        s2.append("\n");

        for (int r = num.length - 1; r >= 0; r--) {
            s2.append("\n");
            for (int t = num[r].length -1; t >= 0; t--) {
                s2.append(num[r][t]);
            }
        }


        return s2.toString();
    }

    // declare and initialize a matrix for a keypad
    static int[][] keypad() {
        return new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} };
    }

    // declare and initialize a random length arrays
    static int[][] numbers() {
        return new int[][]{ { 0, 1 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };
    }

    // tester method for matrix formatting
    public void run() {
        Matrix m0 = new Matrix(keypad());
        System.out.println("Keypad:");
        System.out.println(m0);
//        m0.blue();

        Matrix m1 = new Matrix(numbers());
        System.out.println("Numbers Systems:");
        System.out.println(m1.toString(true));
    }

}