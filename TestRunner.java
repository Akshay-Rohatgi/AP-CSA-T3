public class TestRunner extends Runner {

    @Override
    public String desc() {
        return "Runs all sorts";
    }

    @Override
    public void run() {
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

        System.out.println("--------------------------");
        System.out.println("---BUBBLE SORT RESULTS---");
        System.out.println("--------------------------");

        System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);

        System.out.println("--------------------------");


        sum=0;
        time=0;

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

        System.out.println("--------------------------");
        System.out.println("--INSERTION SORT RESULTS--");
        System.out.println("--------------------------");

        System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);

        System.out.println("--------------------------");


        sum=0;
        time=0;

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

        System.out.println("--------------------------");
        System.out.println("----MERGE SORT RESULTS----");
        System.out.println("--------------------------");

        System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);

        System.out.println("--------------------------");


        sum=0;
        time=0;


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

        System.out.println("--------------------------");
        System.out.println("--SELECTION SORT RESULTS--");
        System.out.println("--------------------------");

        System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
        System.out.println("--------------------------\n");


    }

}
