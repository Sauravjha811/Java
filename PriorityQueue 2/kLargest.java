package PriorityQueue_2;
import java.util.ArrayList;
import java.util.PriorityQueue;;
public class kLargest {
    public static void main(String[] args) {
        int arr[] ={1,3,5,7,9,2,4,6,8,0};
        ArrayList<Integer> Kelement = findK(arr,5);
        for(int i:Kelement){
            System.out.print(i+" ");
        }
    }
    private static ArrayList<Integer> findK(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]>pq.peek()){
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
