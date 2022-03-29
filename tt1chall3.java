import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tt1chall3 extends Runner {

    @Override
    public void run() {
        List<Integer> og = Arrays.asList(1, 2, 3, 4);

        Queue<Integer> ne_w = new Queue<>();

        for(int n : og ) { ne_w.push(n); }


        Stack<Integer> fin = new Stack<>();

        int m = ne_w.length();

        for(int i = 0; i < m; i++) {
            fin.add(ne_w.peak());
            ne_w.pop();
        }

        ArrayList<Integer> changed = new ArrayList<Integer>();

        int r = fin.length();
        for(int i = 0; i < r; i++) {
            changed.add(fin.peak());
            fin.pop();
        }

        System.out.println("Before: " + og.toString().replaceAll("\\]", "").replaceAll("\\[", "").replaceAll(" "," ").replaceAll(",", " "));

        System.out.println("After: " + changed.toString().replaceAll("\\]", "").replaceAll("\\[", "").replaceAll(" "," ").replaceAll(",", " "));

    }

    @Override
    public String desc() {
        return "Tech Talk 1, Challenge 3";
    }
}
