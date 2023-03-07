package LinkedList_1;

public class IncrementEveryEle extends LinkedListUse {
    public static void main(String[] args) {
        Node <Integer> head = createLinkedList();
        Increment(head);
        print(head);

    }
    public static void print(Node<Integer> head)
    {
        Node<Integer> temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }
    public static void Increment(Node<Integer> head)
    {
        Node<Integer> temp = head;
        while(temp!=null)
        {
            temp.data++;
            temp=temp.next;
        }
    }
}
