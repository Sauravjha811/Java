package Queue_Java;
import java.util.Queue;
import java.util.LinkedList;
public class stackUsing2Queue {
    // define the data members
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int size;

    public stackUsing2Queue() {
        // implement the constructor
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        size = 0;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void push(int element){
        q1.add(element);
        size+=1;
    }
    public int pop(){
        if(q1.isEmpty()){
            System.out.println("Stack is Empty");
        }
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int top = q1.remove();
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        size-=1;
        return top;
    }
    public int top(){
        if(q1.isEmpty()){
            System.out.println("Stack is Empty");
        }
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int top = q1.peek();
        q2.add(q1.remove());

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return top;
    }
}
