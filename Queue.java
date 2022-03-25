import java.util.ArrayList;

public class Queue<x> {

    private ArrayList<x> q = new ArrayList<x>();

    public Queue() {

    }

    public void push(x data){
        q.add(data);
    }


    public void pop(){
        if(q.isEmpty()){
            System.out.println("null, no data found");
        }
        else{
            q.remove(0);
        }
    }

    public x peak(){
        if(q.isEmpty()) {
            return null;
        }
        else {
            return q.get(0);
        }
    }

    public void clear(){
        q.clear();
    }

    public int length(){
        return q.size();
    }

    public ArrayList<x> display(){
        return q;
    }

}