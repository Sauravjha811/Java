package LinkedList_Assignment_2;
import java.util.Scanner;
public class mergeTwoSortedLL {
    public static void main(String[] args) {
        Node<Integer> head1 = OptimizedTakeInput();
        Node<Integer> head2 = OptimizedTakeInput();
        printRec(head1);
        System.out.println();
        printRec(head2);
        Node<Integer> head3 = MergeLL(head1, head2);
        System.out.println();
        printRec(head3);
    }
    private static Node<Integer> MergeLL(Node<Integer>head1, Node<Integer>head2)
    {
        if(head1==null)
        {
            return head2;
        }
        if(head2==null)
        {
            return head1;
        }
        Node<Integer> newHead=null, newTail=null;
        if(head1.data<head2.data)
        {
           newHead=head1;
           newTail=head1;
           head1=head1.next;
        }
        else
        {
            newHead=head2;
            newTail=head2;
            head2=head2.next;
        }
        while(head1!=null && head2!=null)
        {
            if(head1.data<head2.data)
            {
                newTail.next = head1;
                newTail=newTail.next;
                head1=head1.next;
            }
            else
            {
                newTail.next = head2;
                newTail=newTail.next;
                head2=head2.next;
            }
        }
        if(head1!=null)
        {
            newTail.next=head1;
        }
        if(head2!=null)
        {
            newTail.next=head2;
        }
        return newHead;
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
