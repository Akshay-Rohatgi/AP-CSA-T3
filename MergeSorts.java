import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSorts {
    private ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;

    public MergeSorts(int size) {
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        TestMerge j = new TestMerge(data);
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
            MergeSorts s = new MergeSorts(SIZE);
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

class TestMerge
{
    //method to merge two sorted arraylists (only needs to peek)

    void merge(ArrayList<Integer> arr, int l, int m, int r) {
        // size
        int n1 = m - l + 1;
        int n2 = r - m;

        // temp to hold info during sorts
        int L[] = new int [n1];
        int R[] = new int [n2];

        // copy
        for (int i=0; i<n1; ++i)
            L[i] = arr.get(l + i);
        for (int j=0; j<n2; ++j)
            R[j] = arr.get(m + 1 + j);


        // merge

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr.set(k, L[i]);
                i++;
            }
            else {
                arr.set(k, R[j]);
                j++;
            }
            k++;
        }

        // copy last few elements of l
        while (i < n1) {
            arr.set(k, L[i]);
            i++;
            k++;
        }

        // copy last few elements of r
        while (j < n2) {
            arr.set(k, R[j]);
            j++;
            k++;
        }
    }

    // Main function that sorts using merge()
    void sort(ArrayList<Integer> arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    static void printArray(ArrayList<Integer> arr) {
        for (Integer integer : arr) System.out.print(integer + " ");
        System.out.println();
    }

    private final ArrayList<Integer> finalArr;

    public TestMerge(ArrayList<Integer> arr) {
        this.finalArr = arr;
        this.sort(finalArr, 0, finalArr.size()-1);
    }

    public ArrayList<Integer> getData() {
        return finalArr;
    }

    // Tester method
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(12, 11, 13, 6, 7)); // {12, 11, 13, 5, 6, 7};

        System.out.println(arr);

        TestMerge ob = new TestMerge(arr);
        ob.sort(arr, 0, arr.size()-1);

        System.out.println(arr);

    }
}
