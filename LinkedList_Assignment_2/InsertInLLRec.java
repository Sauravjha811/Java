package LinkedList_Assignment_2;
import java.util.Scanner;
public class InsertInLLRec {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        head = insertRec(head,20,2);
        System.out.println();
        print(head);
    }
    private static Node<Integer> insertRec(Node<Integer>head, int element, int pos)
    {
        if(head==null && pos>0)
        {
            return head;
        }
        if(pos==0)
        {
            Node<Integer> newNode = new Node<Integer>(element);
            newNode.next=head;
            return newNode;
        }
        else
        {
            head.next = insertRec(head.next,element,pos-1);
            return head;
        }
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
