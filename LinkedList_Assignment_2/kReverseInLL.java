package LinkedList_Assignment_2;
import java.util.Scanner;
public class kReverseInLL {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        System.out.println();
        int k=3;
        head=reverseKtimes(head,k);
        print(head);
    }
    private static Node<Integer> reverseKtimes(Node<Integer> head,int k){
        if(k==0 || k==1){
            return head;
        }
        Node<Integer> currNode=head, fwd=null, prev=null;
        int count=0;

        // reverse first k nodes of LL.
        while(count<k && currNode!=null){
            fwd=currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode = fwd;
            count++;
        }
        if(fwd!=null)
        {
            head.next=reverseKtimes(fwd, k);
        }
        return prev;
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
