import java.util.ArrayList;

public class Hailstone extends Runner {
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

    @Override
    public void run() {
        System.out.println("Length with starter n=8 " + hailstoneLength(8));
        System.out.println("isLongSeq with starter n=5 " + isLongSeq(5));
        System.out.println("propLong with 10 tests " + propLong(10));
    }

    @Override
    public String desc() {
        return "2020 Q1";
    }
}
