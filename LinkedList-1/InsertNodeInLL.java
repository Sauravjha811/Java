package LinkedList_1;
import java.util.Scanner;
public class InsertNodeInLL {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        head=InsertNode(head,2,35);
        System.out.println();
        print(head);
    }
    private static Node<Integer> InsertNode(Node<Integer>head,int pos, int data)
    {
        int currPos=0;
        Node<Integer> newNode = new Node<>(data);
        if(pos==0)
        {
             newNode.next = head;
             head = newNode;
             return head;
        }
        Node<Integer> temp = head;
        while(temp!=null && currPos<(pos-1))
        {
            temp=temp.next;
            currPos++;
        }
        if(temp==null)
        {
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
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
}
