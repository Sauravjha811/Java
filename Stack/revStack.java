package Stack_Java;
import java.util.Stack;
public class revStack {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> extra = new Stack<>();
        input.push(8);
        input.push(4);
        input.push(3);
        input.push(2);
        reverse(input, extra);
        // print the stack.
        while(!input.isEmpty()){
            System.out.print(input.pop()+" ");
        }
    }
    public static void reverse(Stack<Integer>Input, Stack<Integer> extra)
    {
        if(Input.size()<=1){
           return;
        }
        int lastElem = Input.pop();
        reverse(Input,extra);
        while(!Input.isEmpty()){
            int top = Input.pop();
            extra.push(top);
        }
        Input.push(lastElem);
        while(!extra.isEmpty()){
            int top = extra.pop();
            Input.push(top);
        }
    }
}
