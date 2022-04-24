import java.util.ArrayList;

// Use and implementation of last-in first-out (LIFO) principle

public class Queue<x> {
    // Generic x, allows us to take any type of data
    private ArrayList<x> q = new ArrayList<x>();

    public Queue() {

    }

    // Add to dataset
    public void push(x data){
        q.add(data);
    }

    // Remove from top
    public void pop(){
        if(q.isEmpty()){
            System.out.println("null, no data found");
        }
        else{
            q.remove(0);
        }
    }

    // Check top of dataset
    public x peak(){
        if(q.isEmpty()) {
            return null;
        }
        else {
            return q.get(0);
        }
    }

    // Clear dataset
    public void clear(){
        q.clear();
    }

    // length
    public int length(){
        return q.size();
    }

    // Simply returns the arraylist being used
    public ArrayList<x> display(){
        return q;
    }

}