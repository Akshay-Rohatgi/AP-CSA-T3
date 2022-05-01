import java.util.ArrayList;

public class Hailstone {
    public static int hailstoneLength(int n) {
        int count = 0;

        while ( n != 1 ) {
            if ( (n % 2) == 0 ) {
                n = n/2;
                count++;
            } else {
                n = (3*n) + 1;
                count++;
            }
        }

        count++;
        return count;

    }

    public static boolean isLongSeq(int n) {
        if (hailstoneLength(n) > n) {
            return true;
        }
        return false;
    }

    public static double propLong(int n) {
        int r;
        double l = 0.0;

        for (int i = 0; i < n; i++) {
            r = (int) (Math.random() * (10-1)) + 1;
            if (isLongSeq(r)) {
                l++;
            }
        }

        return (l/n);

    }

    public static void main(String[] args) {
        System.out.println(hailstoneLength(8));
        System.out.println(isLongSeq(5));
        System.out.println(propLong(10));
    }

}
