import java.util.Arrays;
import java.util.List;

public class tt1chall2 extends Runner {

    @Override
    public void run() {
        List<Integer> qa = Arrays.asList(1, 4, 5, 8);
        List<Integer> qb = Arrays.asList(2, 3, 6, 7);

        Queue<Integer> q1 = new Queue<>();
        Queue<Integer> q2 = new Queue<>();

        Queue<Integer> o = new Queue<>();

        for(int num : qa) { q1.push(num); }
        for(int num : qb) { q2.push(num); }

        System.out.println("(1st Queue) " + q1.display());
        System.out.println("(2nd Queue) " + q2.display());

        while((q1.display() != null) || (q2.display() != null)) {
            try {
                if((q1.peak() < q2.peak()))  {
                    o.push(q1.peak());
                    q1.pop();
                }
                else if((q2.peak()) < q1.peak() || ((q1.peak()) == null) || (q2.peak() == null)) {
                    o.push(q2.peak());
                    q2.pop();
                }
            } catch (Exception e) {
                if(q1.peak() == null) {
                    o.push(q2.peak());
                    q2.pop();
                    break;
                }
                else if(q2.peak() == null) {
                    o.push(q1.peak());
                    q1.pop();
                    break;
                }
            }
        }

        System.out.println(o.display());

    }

    @Override
    public String desc() {
        return "Tech Talk 1 Challenge 2";
    }
}
