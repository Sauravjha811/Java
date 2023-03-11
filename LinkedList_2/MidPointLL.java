package LinkedList_Assignment_2;
import java.util.Scanner;
public class MidPointLL {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        printRec(head);
        System.out.println();
        Node<Integer> mid = midPoint(head);
        printRec(mid);
    }
    private static Node<Integer> midPoint(Node<Integer> head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = null;
        return slow;
    }
    private static void printRec(Node<Integer> head)
    {
        if(head==null)
        {
            return;
        }
        System.out.print(head.data+" ");
        printRec(head.next);
    }
    private static Node<Integer> OptimizedTakeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;

        while (data != -1) {
            Node<Integer> currNode = new Node<>(data);
            if (head == null) {
                head = currNode;
                tail = currNode;
            } else {
                tail.next = currNode;
                tail = currNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
}
