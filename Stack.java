import java.util.ArrayList;

// Implementation and use of first-in first-out (FIFO) principle

public class Stack<x> {
    private ArrayList<x> s = new ArrayList<x>();

    //constructor, making sure that we will be able to call the code
    public void stack(){

    }

    // add data
    public void add(x info){
        s.add(info);
    }

    // Same as queue, except this removes last item that came in, rather than the last item in the list
    public x pop(){
        if(!s.isEmpty()){
            var k = s.get(s.size() -1);
            s.remove(s.size()-1);
            return k;
        }
        else{
            System.out.println("null");
        }
        return null;
    }

    // Peak at top of dataset
    public x peak(){
        if(!s.isEmpty()){
            return s.get(s.size() -1 );
        }
        else{
            return null;
        }
    }

    //view length of stack
    public int length(){
        return s.size();
    }

    //clear stack
    public void clear(){
        s.clear();
    }

    // Display arraylist
    public void display(){
        System.out.println(s);
    }

    // Custom toString method used for testing/debugging
    @Override
    public String toString() {
        return "Stack{" +
                "s=" + s +
                '}';
    }
}