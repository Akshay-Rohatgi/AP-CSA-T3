import java.util.ArrayList;
import java.util.Arrays;

public class tt1chall1 extends Runner {

    @Override
    public void run() {

        ArrayList<String> wordlist = new ArrayList<String>(Arrays.asList("Seven slimy snakes sallying slowly slithered southward".split(" ")));

        Queue<String> nq = new Queue<>();

        for (String item : wordlist ) {
            System.out.println("Enqueued data: " + item);
            nq.push(item);
            System.out.println("Words count: " + nq.length() + " " + nq.display().toString().replaceAll("\\]", "").replaceAll("\\[", "").replaceAll(" "," ").replaceAll(",", " "));
        }

        while (!(nq.peak() == null)) {
            System.out.println("Dequeued data: " + nq.peak());
            nq.pop();
            System.out.println("Words count: " + nq.length() + " " + nq.display().toString().replaceAll("\\]", "").replaceAll("\\[", "").replaceAll(" "," ").replaceAll(",", " "));
        }

    }

    @Override
    public String desc() {
        return "Tech Talk 1, Challenge 1";
    }

}
