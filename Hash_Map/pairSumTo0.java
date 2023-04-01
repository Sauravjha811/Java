package Hash_Map;
import java.util.HashMap;
public class pairSumTo0 {
    public static void main(String[] args) {
        int arr[] = {-2,2,6,-2,2,-6,3};
        countPair(arr);
    }
    public static int PairSum(int[] input, int size) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int key: input)
		{
			if(map.containsKey(key))
			{
				map.put(key,map.get(key)+1);
			}
			else{
				map.put(key,1);
			}
		}
		int countPairs = 0;
		for(Integer i: map.keySet())
		{
			if(map.containsKey(-i) && i!=0)
			{
				countPairs+=(map.get(i)*map.get(-i));
			}
		}
        countPairs=countPairs/2;
		if(map.containsKey(0)){
			int val = map.get(0);
			countPairs=countPairs+(val*(val-1))/2;
		}
		return countPairs;
	}

    private static void countPair(int [] arr){
        HashMap<Integer,Integer> h = new HashMap<>();
        int finalCount=0;
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            if(h.containsKey(key)){
                int value = h.get(key);
                h.put(key,value+1);
            }
            else 
            {
                h.put(key,1);
            }
        }
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            if(h.containsKey(-key) && h.get(key)!=0){
                int time;
                if(key == (-key)){
                    int occurences = h.get(key);
                    System.out.println(occurences);
                    time = (occurences*(occurences-1))/2;
                    finalCount += time;
                    System.out.println(finalCount);
                    h.put(key,0);
                    continue;
                }
                System.out.println("1st "+finalCount);
                time = h.get(key)*h.get(-key);
                finalCount+= time;
                System.out.println("2nd "+finalCount);
                h.put(key,0);
                h.put(-key,0);
            }
        }
        System.out.println("Total no of count is:-"+finalCount);
    }
}
