public class DiverseArray extends Runner {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] sums = new int[arr2D.length];
        for (int k = 0; k < arr2D.length; k++) {
            sums[k] = arraySum(arr2D[k]);
        }
        return sums;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int checkSum;
        int[] sums = rowSums(arr2D);
        for(int a = 0; a < sums.length - 1; a++) {
            for (int b = a + 1; b < sums.length; b++) {
                if (sums[a] == sums[b]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] mat1 = {
                { 1, 3, 2, 7, 3 },                       // row 1
                { 10, 10, 4, 6, 2 },                     // row 2
                { 5, 3, 5, 9, 6 },                       // row 3
                { 7, 6, 4, 2, 1 }                        // row 4
        };
        int[][] mat2 = {
                { 1, 1, 5, 3, 4 },                       // row 1
                { 12, 7, 6, 1, 9 },                      // row 2
                { 8, 11, 10, 2, 5 },                     // row 3
                { 3, 2, 3, 0, 6 }                        // row 4
        };

        System.out.println("Mat1 Diverse: " + isDiverse(mat1));
        System.out.println();
        System.out.println("Mat2 Diverse: " + isDiverse(mat2));
    }

    @Override
    public void run() {
        int[][] mat1 = {
                { 1, 3, 2, 7, 3 },                       // row 1
                { 10, 10, 4, 6, 2 },                     // row 2
                { 5, 3, 5, 9, 6 },                       // row 3
                { 7, 6, 4, 2, 1 }                        // row 4
        };
        int[][] mat2 = {
                { 1, 1, 5, 3, 4 },                       // row 1
                { 12, 7, 6, 1, 9 },                      // row 2
                { 8, 11, 10, 2, 5 },                     // row 3
                { 3, 2, 3, 0, 6 }                        // row 4
        };

        System.out.println("Mat1 Diverse: " + isDiverse(mat1));
        System.out.println();
        System.out.println("Mat2 Diverse: " + isDiverse(mat2));
    }

    @Override
    public String desc() {
        return "Diverse Array";
    }
}


