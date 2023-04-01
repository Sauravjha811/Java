package Hash_Map;
import java.util.HashMap;
public class maxFrequencyNum {
    public static void main(String[] args) {
        int arr[] = {2,12,2,11,12,2,1,2,2,11,12,2,6};
        System.out.println("Max frequency Num of the array is:-"+maxFre(arr));
    }
    private static int maxFre(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                hm.put(i,1);
            }
        }
        int max=0, ans = Integer.MIN_VALUE;
        for(int i:arr){
            if(hm.get(i)>max){
                max = hm.get(i);
                ans = i;
            }
        }
        return ans;
    }
}
