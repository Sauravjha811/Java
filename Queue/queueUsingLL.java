package Queue_Java;
import LinkedList_1.Node;
public class queueUsingLL {
    private Node<Integer> front;
    private Node<Integer> rear;
    private int size;

    public queueUsingLL(){
		front=null;
		rear=null;
		size=0;
	}
	public int getSize(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public void enqueue(int data){
		Node<Integer> newNode = new Node<Integer>(data);
		if(front==null){
			front=newNode;
			rear=newNode;
		}
		else{
			rear.next=newNode;
			rear=newNode;
		}
		size=size+1;
	}
	public int dequeue (){
		if(front!=null){
			int temp = front.data;
			front = front.next;
			size = size-1;
			return temp;
		}
		else{
			return -1;
		}
	}
	public int fornt(){
		if(front!=null){
			return front.data;
		}
		else{
			return -1;
		}
	}

}  
