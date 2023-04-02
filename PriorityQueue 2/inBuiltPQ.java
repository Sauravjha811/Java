package PriorityQueue_2;
import java.util.PriorityQueue;
public class inBuiltPQ {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,9,8,7,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        while(!pq.isEmpty()){
            System.out.println(pq.poll()+" ");
        }
    }
}

