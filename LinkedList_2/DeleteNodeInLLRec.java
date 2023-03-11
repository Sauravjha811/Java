package LinkedList_Assignment_2;
import java.util.Scanner;
public class DeleteNodeInLLRec {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        head=DeleteNodeRec(head,2);
        System.out.println();
        print(head);
    }
    private static Node<Integer> DeleteNodeRec(Node<Integer>head, int pos)
    {
        if(head==null)
        {
            return head;
        }
        if(pos==0)
        {
            return head.next;
        }
        head.next = DeleteNodeRec(head.next, pos-1);
        return head;
    }
    private static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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
