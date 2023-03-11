package LinkedList_Assignment_2;
import java.util.Scanner;
public class delEveryNnodes {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        head = deleteNnodes(head, 2, 3);
        System.out.println();
        print(head);
    }
    private static Node<Integer> deleteNnodes(Node<Integer>head, int m, int n)
    {
        if(m==0 || head==null)
        {
            return null;
        }
        if(n==0)
        {
            return head;
        }
        Node<Integer> currHead = head;
        Node<Integer> temp = null;

        while(currHead!=null)
        {
            int take = 0;
            int skip = 0;
            while(currHead!=null && take<m){
                if(temp == null)
                {
                    temp = currHead;
                }
                else
                {
                    temp.next = currHead;
                    temp = currHead;
                }
                currHead=currHead.next;
                take+=1;
            }
            while(currHead!=null && skip<n)
            {
                currHead = currHead.next;
                skip+=1;
            }
        }
        if(temp!=null){
            temp.next = null;
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