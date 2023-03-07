package LinkedList_1;

import java.util.ArrayList;

public class IntroToArrayList {
    public static void main(String[] args) {
        // create arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1, 3);
        System.out.println(arr.size());
        for (int element : arr) {
            System.out.println(element);
        }
        System.out.println(arr.get(2));

        ArrayList<String> list = new ArrayList<String>();
        list.add("Ant");
        list.add("Bat");
        list.add("Car");
        list.add("Door");
        list.add("Euro");
        // replace the element car with bus.
        list.set(2,"Bus");
        list.remove(3);
        String j = "Ant";
        list.remove(j);
        for(String i : list)
        {
            System.out.print(i+" ");
        }
    }
}
