public class Range implements NumberGroup {
    private int min;
    private int max;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean contains(int n) {
        return n >= min && n <= max;
    }
}
