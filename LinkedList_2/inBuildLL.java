package LinkedList_Assignment_2;
import java.util.LinkedList;
public class inBuildLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1,100);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.addFirst(90);
        list.set(0,50);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        list.remove();
    }
}
