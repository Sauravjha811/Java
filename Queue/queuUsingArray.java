package Queue_Java;

public class queuUsingArray {
    // create an array to stores the elements of the queue
    // front points the first element of the queue
    // rear points to the last element of the queue
    // size variable stores the size of the queue.
    private int data[];
    private int front;
    private int rear;
    private int size;

    // default consturctor without any argument.
    public queuUsingArray(){
        data = new int[5];
        front = -1;
        rear = -1;
    }

    // size method provide the size of the queue.
    public int size(){
        return size;
    }
    // isEmpty method tells the queue is empty or not in boolean true or false.
    public boolean isEmpty(){
        return size==0;
    }
    // enqueue method adding the elem in the queue
    public void enqueue(int elem) throws QueueFullException{
        // size equals to the length of the array throw exception.
        if(size==data.length){
            throw new QueueFullException();
        }
        // if size == 0, then we should initailize the front to 0.
        if(size==0){
            front=0;
        }
        rear++;
        data[rear]=elem;
        size++;
    }
    public int front() throws QueueEmptyException{
        if(size==0){
            throw new QueueEmptyException();
        }
        return data[front];
    }
    public int dequeue() throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException();
        }
        int temp=data[front];
        front++;
        size--;
        if(size==0){
            front=-1;
            front=-1;
        }
        return temp;
    }
}
