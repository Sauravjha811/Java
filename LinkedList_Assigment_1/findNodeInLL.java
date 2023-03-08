package LinkedList_1;
import java.util.Scanner;
public class findNodeInLL {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        System.out.println("Node Data is present at-"+findNode(head,15));
        
    }
    private static int findNode(Node<Integer> head, int n)
    {
        Node<Integer> currNode = head;
        int currPos=0;
        while(currNode!=null)
        {
           if(currNode.data==n)
           {
            return currPos;
           }
           else
           {
            currPos++;
            currNode = currNode.next;
           }
        }
        return -1;
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
/*if(head==null)
		{
			return -1;
		}
		LinkedListNode<Integer>temp = head;
		int count=0;
		while(temp!=null && temp.data!=n)
		{
			temp = temp.next;
			count++;
		}
		if(temp!=null)
		{
			return count;
		}
		else
		{
			return -1;
		}
	} */