package Hash_Map;
import java.util.HashMap;
import java.util.Set;
public class inbuiltHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        // insert elements in the hashmap.
        map.put("abc",1);
        map.put("def",3);
        map.put("ghi",5);
        // size 
        System.out.println(map.size());
        //presence
        if(map.containsKey("abc")){
            System.out.println("map has abc");
        }
        if(map.containsKey("jkl")){
            System.out.println("jkl has map");
        }
        else 
        {
            System.out.println("jkl has not map");
        }
        // get value
        if(map.containsKey("abc")){
            int v = map.get("abc");
            System.out.println(v);
        }
        if(map.containsKey("skj")){
            int v1 = map.get("skj");
            System.out.println(v1);
        }
        // remove
        map.remove("abc");
        // iterator
        Set<String> keys = map.keySet();
        for(String s:keys){
            System.out.println(s);
        }
    }
}

