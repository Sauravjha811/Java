package Hash_Map;

public class MapUse {
    public static void main(String[] args) {
        Map<Integer,Integer> hash = new Map<>();
        hash.insert(1,101);
        hash.insert(2,102);
        hash.insert(3,103);
        System.out.println(hash.size());
        System.out.println(hash.getValue(2));
        System.out.println(hash.remove(2));
        System.out.println(hash.getValue(2));

        System.out.println("example:-");
        Map<String, Integer> map = new Map<>();
        for(int i=0;i<20;i++) {
        map.insert("abc" +i, i+1);
        System.out.println(map.loadFactor());
        }
        map.remove("abc3");
        map.remove("abc7");
        for(int i=0;i<20;i++) {
        System.out.println("abc"+ i+":" + map.getValue("abc" + i));
    }
}
}
