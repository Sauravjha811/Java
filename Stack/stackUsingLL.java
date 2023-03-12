package Stack_Java;
import LinkedList_1.Node;
// Generic datatype can be used for general purpose used of stack.
public class stackUsingLL<T> {
    private Node<T> head;
    private int size;
    private Node<T> tail;
    // constructor for intialize the variables.
    public stackUsingLL() {
        head=null;
        size=0;
    }
    // method for size
    public int size(){
        return size;
    }
    // check stack is empty or not.
    public boolean isEmpty(){
        if(size==0) return true;
        else
        return false;
    }
    // Pushing happening at he begining of the LL
    public void push(T elem){
        Node<T> newNode = new Node<T>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }
    // since pushing is happening at first node
    public T top() throws StackEmptyException{
        if(head==null){
            throw new StackEmptyException();
        }
        return head.data;
    }
    public T pop() throws StackEmptyException{
        if(head==null){
            throw new StackEmptyException();
        }
        // since we are pushing data in the first so the so we must remove the data from front itself
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}
