package PriorityQueue_2;
import java.util.Collections;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class kSmallest {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,2,4,6,8,0};
        ArrayList<Integer> Kelement = findSmallest(arr,5);
        for(int i: Kelement){
            System.out.print(i+" ");
        }
    }
    private static ArrayList<Integer> findSmallest(int[]arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(pq.peek()>arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        ArrayList<Integer> output = new ArrayList<>();
        while(!pq.isEmpty()){
            output.add(pq.poll());
        }
        return output;
    }
}
