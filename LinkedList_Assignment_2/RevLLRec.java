package LinkedList_Assignment_2;
import java.util.Scanner;
public class RevLLRec {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        printRec(head);
        head = rev(head);
        System.out.println();
        printRec(head);
    }
    private static Node<Integer> rev(Node<Integer> head)
    {
        if(head==null)
        {
            return head;
        }
        if(head.next==null)
        {
            return head;
        }
        // creates a tail nodes to stores the head.next address.
        Node<Integer> tail = head.next;
        // recursive function or method rev the linkedlist to n-1 element.
        Node<Integer> smallHead = rev(head.next);
        tail.next = head;
        head.next = null;
        return smallHead;
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
