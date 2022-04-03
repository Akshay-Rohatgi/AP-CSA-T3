import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSorts {
    private ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;

    public InsertionSorts(int size) {
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        TestInsertion j = new TestInsertion(data);
        data = j.getData();
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }

    public static void main(String[] args) {
        int sum=0, time=0, TIMES=12, SIZE=5000;

        for(int i=0; i< TIMES; i++) {
            InsertionSorts s = new InsertionSorts(SIZE);
            for(int j = 0; j<s.getData().size(); j++) {
                // To see data, uncomment next line
                // System.out.println(s.getData());
                sum += s.getData().get(j);
            }
            System.out.println("Average random: " + sum / ((i+1)*SIZE));
            System.out.println("Nanoseconds: " + s.getTimeElapsed());
            time += s.getTimeElapsed();
        }
        System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
    }
}

class TestInsertion {
    private final ArrayList<Integer> input;

    public TestInsertion(ArrayList<Integer> input) {
        this.input = input;
        sort(); // sort immediately
    }

    // actual sort itself
    void sort() {
        for(int k=1; k<input.size(); k++)   {
            int temp = input.get(k);
            int j= k-1;
            while(j>=0 && temp <= input.get(j))   {
                input.set(j + 1, input.get(j));
                j = j-1;
            }
            input.set(j + 1, temp);
        }
    }

    // get data method

    public ArrayList<Integer> getData() {
        return input;
    }

    // Tester method
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>(Arrays.asList(12, 11, 13, 6, 7));
        System.out.println(n);
        TestInsertion t = new TestInsertion(n);
        System.out.println(t.getData());
    }

}
