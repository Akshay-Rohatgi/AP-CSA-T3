public class IntByReference extends Runner {
    private int value;

    // Hack: create IntByReference, swapToLowHighOrder and toString methods

    public IntByReference(int n) {
        value = n;
    }

    public void swapToLowHighOrder(IntByReference num) {
        int blue = this.value;
        int red = num.value;

        if (blue > red) {
            num.value = blue;
            this.value = red;
        }

    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    // static method that enables me to see numbers swapped by reference (before, after)
    public static void swapper(int n0, int n1) {
        IntByReference a = new IntByReference(n0);
        IntByReference b = new IntByReference(n1);
        System.out.println("Before: " + a + " " + b);
        a.swapToLowHighOrder(b);  // conditionally build swap method to change values of a, b
        System.out.println("After: " + a + " " + b);
        System.out.println();
    }

    // static main method that provides some simple test cases
    public void run() {
        IntByReference.swapper(21, 16);
        IntByReference.swapper(16, 21);
        IntByReference.swapper(16, -1);
    }
}