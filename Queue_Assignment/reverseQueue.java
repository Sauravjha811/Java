package Queue_Java;
import java.util.LinkedList;
import java.util.Queue;
public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>();
        int arr[]={10,20,30,40,50,60,70,80,90};
        for(int elem:arr){
            q1.add(elem);
        }
        reverse(q1);
        while(!q1.isEmpty()){
            System.out.print(q1.remove()+" ");
        }
    }
    private static void reverse(Queue<Integer>q1){
        if(q1.size()==0 || q1.size()==1){
            return;
        }
        int x = q1.remove();
        reverse(q1);
        q1.add(x);
    }
}
