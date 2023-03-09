package LinkedList_Assignment_2;
import java.util.Scanner;
public class MergeSortInLL {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        printRec(head);
        System.out.println();
        head=MergeSort(head);
        printRec(head);
    }
    private static Node<Integer> findMid(Node<Integer>head)
    {
        if(head==null)
        {
            return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private static Node<Integer> MergeSort(Node<Integer>head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> mid = findMid(head);
        Node<Integer> half1 = head;
        Node<Integer> half2 = mid.next;
        mid.next = null;

        half1=MergeSort(half1);
        half2=MergeSort(half2);

        Node<Integer> finalHead=merge(half1, half2);
        return finalHead;
    }
    private static Node<Integer> merge(Node<Integer>head1, Node<Integer>head2)
    {
        if(head1==null)
        {
            return head2;
        }
        if(head2==null)
        {
            return head1;
        }
        Node<Integer> newHead=null,newTail=null;
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
                newTail=head1;
                head1=head1.next;
            }
            else
            {
                newTail.next=head2;
                newTail=head2;
                head2 = head2.next;
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
