import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSorts {
    private ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;

    public SelectionSorts(int size) {
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        TestSelection j = new TestSelection(data);
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
            SelectionSorts s = new SelectionSorts(SIZE);
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

class TestSelection {

    private final ArrayList<Integer> input;

    public TestSelection(ArrayList<Integer> n) {
        this.input = n;
        sort();
    }

    public ArrayList<Integer> getData() {
        return input;
    }

    void sort(){

        int a = 0;
        int j=0;
        int b = 0;

        for(int i=1;i<input.size();i++){

            a = input.get(i-1);
            b = i-1;

            for(j=i;j<input.size();j++){
                if(input.get(j)<a){
                    a = input.get(j);
                    b = j;
                }
            }

            swap(i-1, b);
        }
    }

    public void swap(int s,int d){
        int temp = input.get(d);
        input.set(d, input.get(s));
        input.set(s, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>(Arrays.asList(12, 11, 13, 6, 7)); // {12, 11, 13, 5, 6, 7};

        System.out.println(n);
        TestSelection t = new TestSelection(n);
        System.out.println(t.getData());

    }

}
