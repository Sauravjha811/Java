package Queue_Java;
import java.util.Queue;
import java.util.LinkedList;
public class InbuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(12);
        q1.add(21);
        q1.add(31);
        q1.add(41);
        System.out.println(q1.size());
        System.out.println(q1.peek());
        System.out.println(q1.poll());
        System.out.println(q1.remove());
    }
}
