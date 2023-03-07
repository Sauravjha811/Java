package LinkedList_1;
import java.util.Scanner;
public class TakeInputInLL {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
    }
    private static void print(Node<Integer>head)
    {
        Node<Integer> temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    private static Node<Integer> OptimizedTakeInput()
    {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null,tail=null;

        while(data!=-1)
        {
            Node<Integer> currNode = new Node<>(data);
            if(head==null)
            {
                head = currNode;
                tail = currNode;
            }
            else
            {
                tail.next = currNode;
                tail = currNode;
            }
            data=sc.nextInt();
        }
        return head;
    }
    private static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;

        while(data!=-1)
        {
            Node<Integer> currNode = new Node<>(data);
            if(head==null)
            {
                head = currNode;
            }
            else
            {
                Node<Integer> tail = head;
                while(tail.next!=null)
                {
                    tail=tail.next;
                }
                tail.next = currNode;
            }
            data=sc.nextInt();
        }
        return head;
    }
}
