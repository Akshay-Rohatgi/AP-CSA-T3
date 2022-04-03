//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class TestInsertion {
//    private final ArrayList<Integer> input;
//
//    public TestInsertion(ArrayList<Integer> input) {
//        this.input = input;
//        sort();
//    }
//
//    void sort() {
//        for(int k=1; k<input.size(); k++)   {
//            int temp = input.get(k);
//            int j= k-1;
//            while(j>=0 && temp <= input.get(j))   {
//                input.set(j + 1, input.get(j));
//                j = j-1;
//            }
//            input.set(j + 1, temp);
//        }
//    }
//
//    public ArrayList<Integer> getData() {
//        return input;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer> n = new ArrayList<Integer>(Arrays.asList(12, 11, 13, 6, 7));
//        System.out.println(n);
//        TestInsertion t = new TestInsertion(n);
//        System.out.println(t.getData());
//    }
//
//}
