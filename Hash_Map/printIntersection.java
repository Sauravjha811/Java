package Hash_Map;
import java.util.HashMap;
public class printIntersection {
    public static void main(String[] args) {
        int arr1[] = { 2,6,8,5,4,3};
        int arr2[] = {2,3,4,7};
        printCommon(arr1,arr2);
    }
    private static void printCommon(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            else {
                map.put(arr1[i],1);
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                int frequency = map.get(arr2[i]);
				if(frequency>0)
				{
					System.out.print(arr2[i]+" ");
					map.put(arr2[i],frequency-1);
				}
                map.remove(arr2[i]);
            }
        }
    }
}
