package LinkedList_Assignment_2;
import java.util.Scanner;
public class bubbleSortInLL {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        System.out.println();
        head=bubbleSort(head);
        print(head);
    }
    private static Node<Integer> bubbleSort(Node<Integer> head)
    {
        int n = length(head);
        for(int i=0;i<(n-1);i++){
            Node<Integer> prev = null;
            Node<Integer> currNode = head;
            for(int j=0;j<n-i-1;j++){
                if(currNode.data<=currNode.next.data)
                {
                    prev = currNode;
                    currNode = currNode.next;
                }
                else
                {
                    if(prev==null){
                        Node<Integer> fwd = currNode.next;
                        head = head.next;
                        currNode.next = fwd.next;
                        fwd.next=currNode;
                        prev = fwd;
                    }
                    else
                    {
                        Node<Integer> fwd = currNode.next;
                        prev.next = fwd;
                        currNode.next = fwd.next;
                        fwd.next = currNode;
                        prev=fwd;
                    }
                }
            }
        }
        return head;
    }
    private static int length(Node<Integer> head)
    {
        int count=0;
        while(head!=null)
        {
            head=head.next;
            count++;
        }
        return count;
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
