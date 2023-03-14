package Queue_Java;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class revKelementQueue {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        Queue<Integer> q1 = new LinkedList<>();
        for(int elem:arr){
            q1.add(elem);
        }
        q1=kRevElements(q1,4);
        while(!q1.isEmpty()){
            System.out.print(q1.remove()+" ");
        }

    }
    private static Queue<Integer> kRevElements(Queue<Integer> q1, int k){
        if(k>q1.size()){
            k%=q1.size();
        }
        if(q1.size()==0 || q1.size()==1){
            return q1;
        }
        if(k<=0){
            return q1;
        }
        Stack<Integer> s1 = new Stack<>();
        for(int i=0;i<k;i++){
            s1.push(q1.remove());
        }
        while(!s1.isEmpty()){
            q1.add(s1.pop());
        }
        for(int i=0;i<q1.size()-k;i++){
            q1.add(q1.poll());
        }
    return q1;
    }
}
