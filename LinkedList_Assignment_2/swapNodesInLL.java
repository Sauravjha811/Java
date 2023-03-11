package LinkedList_Assignment_2;
import java.util.Scanner;
public class swapNodesInLL {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        System.out.println();
        head = swapElement(head,2,4);
        print(head);
    }
    private static Node<Integer> swapElement(Node<Integer>head, int i, int j)
    {
        if(i==j)
        {
            return head;
        }
        Node<Integer> currHead = head, prev = null;
        Node<Integer> firstNode=null, secondNode=null,firstNodePre=null,secondNodePre=null;
        int pos=0;

        while(currHead!=null)
        {
            if(pos==i)
            {
                firstNodePre=prev;
                firstNode=currHead;
            }
            else if(pos==j)
            {
                secondNodePre=prev;
                secondNode=currHead;
            }
            prev=currHead;
            currHead=currHead.next;
            pos+=1;
        }
        if(firstNodePre!=null){
            firstNodePre.next=secondNode;
        }
        else
        {
            head = secondNode;
        }
        if(secondNodePre!=null){
            secondNodePre.next=firstNode;
        }
        else
        {
            head = firstNode;
        }
        Node<Integer> currFirstNode = secondNode.next;
        secondNode.next= firstNode.next;
        firstNode.next=currFirstNode;

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
