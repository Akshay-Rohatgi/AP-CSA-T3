import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSorts {
    private ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;

    public BubbleSorts(int size) {
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        TestBubble j = new TestBubble(data);
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
            BubbleSorts s = new BubbleSorts(SIZE);
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

class TestBubble {
    private ArrayList<Integer> list = new ArrayList<>();
    private final ArrayList<Integer> input;

    // actual bubble sort, similar to what we did in trimester 1
    void sort() {
        int temp;
        for (int i=0; i< input.size(); i++){
            for(int j= i; j< input.size()-1; j++){
                int first = input.get(i);
                int sec = input.get(j + 1);
                if (first > sec)  {
                    temp = input.get(j + 1);
                    input.set(j + 1, input.get(i));
                    input.set(i, temp);
                }
            }
            list.add(input.get(i));
        }

    }

    // list getter method
    public ArrayList<Integer> getData() {
        return list;
    }

    // Sort the second initialization happens
    public TestBubble(ArrayList<Integer> l) {
        this.input = l;
        sort();
    }

    // Tester method
    public static void main(String[] args) {


        ArrayList<Integer> n = new ArrayList<Integer>(Arrays.asList(12, 190, 13, 6, 7));

        TestBubble ob = new TestBubble(n);
        System.out.println(ob.getData());

    }
}

