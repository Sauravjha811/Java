package LinkedList_1;
import java.util.Scanner;
public class EliminatesDupFromLL {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        head = removeDup(head);
        System.out.println();
        print(head);
    }
    private static Node<Integer> removeDup(Node<Integer> head)
    {
        Node<Integer> currNode = head;
        while(currNode.next!=null)
        {
            if(currNode.data.equals(currNode.next.data))
            {
                currNode.next = currNode.next.next;
            }
            else
            {
                currNode=currNode.next;
            }
            //return head;
        }
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
