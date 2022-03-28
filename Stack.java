import java.util.ArrayList;

public class Stack<x> {
    private ArrayList<x> s = new ArrayList<x>();

    //constructor, making usre that we will be able to call the code
    public void stack(){

    }

    public void add(x info){
        s.add(info);
    }

    public x pop(){
        if(!s.isEmpty()){
            s.remove(s.size()-1);
            return s.get(s.size()-1);
        }
        else{
            System.out.println("null");
        }
        return null;
    }

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

    public void display(){
        System.out.println(s);
    }

}
