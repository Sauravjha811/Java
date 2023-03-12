package Stack_Java;
import java.util.Stack;
public class inbuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
