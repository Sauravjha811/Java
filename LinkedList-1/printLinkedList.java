package LinkedList_1;

public class printLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        print(head);
        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        node2.next = node1;
        print1(node2);
    }
    public static void print(Node<Integer> head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
       // System.out.println("print"+head);
       //System.out.println(head.data);
       //System.out.println(head.next.data);
      // System.out.println(head.next.next.data);

    }
    public static void print1(Node<Integer> head){
        Node<Integer> temp = head;
    
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
        temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    public static Node<Integer> createLinkedList()
    {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        //System.out.println("n1-"+n1+" "+"data-"+n1.data+" reference-"+n1.next);
        n2.next = n3;
       // System.out.println("n2-"+n2+" "+"data-"+n2.data+" reference-"+n2.next);
        n3.next = n4;
        //System.out.println("n3-"+n3+" "+"data-"+n3.data+" reference-"+n3.next);
       // System.out.println("n4-"+n4+" "+"data-"+n4.data+" reference-"+n4.next);
        return n1;
    }

}
