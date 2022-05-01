import java.util.Arrays;

public class ArrayResizer {
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int i = 0; i < array2D[r].length; i++) {
            if (array2D[r][i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static int numNonZeroRows(int[][] array2D) {
        int count = 0;
        int temp;
        int j;
        for (int k = 0; k < array2D.length; k++) {
            temp = 0;
            j = 0;
            while (temp == 0 && j < array2D[k].length) {
                if (array2D[k][j] == 0) {
                    temp = 1;
                    count += 1;
                }
                j++;
            }
        }
        return count;
    }

    public static int[][] resize(int[][] array2D) {
        int size = numNonZeroRows(array2D);

        int[][] smaller = new int[size][array2D[0].length];

        int count = 0;
        int j;


        for (int i = 0; i < array2D.length; i++) {
            if (isNonZeroRow(array2D, i)) {
                smaller[count] = array2D[i];
//                for (j = 0; j < array2D[i].length; j++) {
//                    smaller[count][j] = array2D[i][j];
//                    System.out.println(array2D[i][j]);
//                }
                count++;
            }
        }

        return smaller;

    }

    public static void main(String[] args) {
        int[][] arr = {{2, 1, 0},

                {1, 3, 2},

                {0, 0, 0},

                {4, 5, 6}};

        System.out.println(numNonZeroRows(arr));
        int[][] smaller = resize(arr);
        System.out.println(Arrays.deepToString(smaller));

    }

}
