package LinkedList_1;

public class printIthNode {
    public static void main(String[] args) {
        Node<Integer> head = createLL();
        int index = 2;
        printIth(head,index);
    }
    private static void printIth(Node<Integer>head,int index)
    {
        Node<Integer> temp = head;
        int curr = 0;
        while(temp!=null&& curr<index)
        {
            curr++;
            temp=temp.next;
        }
        if(temp!=null)
        {
            System.out.print(temp.data);
        }

    }

    private static Node<Integer> createLL()
    {
        Node<Integer> n1 = new Node<Integer>(3);
        Node<Integer> n2 = new Node<Integer> (4);
        Node<Integer> n3 = new Node<Integer> (5);
        Node<Integer> n4 = new Node<Integer> (2);
        Node<Integer> n5 = new Node<Integer> (6);
        Node<Integer> n6 = new Node<Integer> (1);
        Node<Integer> n7 = new Node<Integer> (9);
        n1.next =n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        return n1;
    }
}
