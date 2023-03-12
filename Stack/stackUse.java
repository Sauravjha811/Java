package Stack_Java;
public class stackUse {
    public static void main(String[] args) throws StackEmptyException, StackFullException {
        //stackUsingArray stack = new stackUsingArray();
       // stack.push(10);
       // stack.push(20);
       // stack.push(30);
       // System.out.println(stack.top());
       // System.out.println(stack.pop());
       // System.out.println(stack.size());
       // System.out.println(stack.isEmpty());
        // Using Stack we can easily print the reverse of the array.
       // int arr[] ={1,2,3,4,5};
       // for(int i=0;i<arr.length;i++){
       //     stack.push(arr[i]);
       // }
       // for(int i=0;i<arr.length;i++){
        //    stack.push(arr[i]);
       // }
       // for(int i=0;i<arr.length;i++){
       //     stack.push(arr[i]);
       // }
        //while(!stack.isEmpty()){
        //    System.out.print(stack.pop()+" ");
        //}
        stackUsingLL<Integer> stack = new stackUsingLL<>();
        int arr[] = {5,6,7,1,9};

        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }
    }
}