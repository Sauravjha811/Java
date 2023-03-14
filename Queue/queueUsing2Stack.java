package Queue_Java;
import java.util.Stack;
public class queueUsing2Stack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    int size;

    public queueUsing2Stack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    // enqueue in the queue using 2 stacks.
    public void enqueue(int x){
        // Move all elements from s1 to s2.
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        // now push data to the s1.
        s1.push(x);
        size++;
        // Push everything back to s1.
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    // Dequeue of the element from the queue.
    public int dequeue(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty");
            System.exit(0);
        }
        // return top of the s1 stack.
        int x = s1.peek();
        size--;
        s1.pop();
        return x;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
}
