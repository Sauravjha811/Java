package Hash_Map;
import java.util.HashMap;
import java.util.ArrayList;
public class removeDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,3,2,2,3,1,6,2,5};
        ArrayList<Integer> output = remove(arr);
        System.out.println(output);
    }
    private static ArrayList<Integer> remove(int[] arr){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                continue;
            }
            output.add(arr[i]);
            map.put(arr[i],true);
        }
        return output;
    }
}
