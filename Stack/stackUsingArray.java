package Stack_Java;
public class stackUsingArray {
    // make a reference of array
    public int data[];
    // index of the top most element of the stack.
    private int topIndex;

    public stackUsingArray(){
        data = new int[10];
        topIndex=-1;
    }
    //public stackUsingArray(int size){
    //     data = new int[size];
     //    topIndex=-1;
   // }
    // method for caluculate the size of the stack.
    public int size(){
        return topIndex+1;

    }
    // method to check stack is empty or not.
    public boolean isEmpty(){
       // if(topIndex==-1)
       //     return true;
       // else
       // return false;
        return topIndex==-1;
    }
    // method to push or insert the elements on the stack.
    public void push(int elem)//throws StackFullException
    {
        // if stack full
        if(topIndex==data.length-1)
        {
            //StackFullException e = new StackFullException();
            //throw e;
           // throw new StackFullException();
           doubleCapcity();
        }
        data[++topIndex]=elem;
    }
    private void doubleCapcity(){
        System.out.println("Doble capacity inside");
        int temp[] = data;
        data = new int [2*temp.length];
        for(int i=0;i<temp.length;i++)
        {
             data[i]=temp[i];
        }
    }
    // method to get the top elements of the stack.
    public int top()throws StackEmptyException{
        if(topIndex==-1){
            throw new StackEmptyException();
        }
        return data[topIndex];
    }
    // method to pop or delete the elements of the stack.
    public int pop()throws StackEmptyException {
        if(topIndex==-1){
            throw new StackEmptyException();
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }
}
