package LinkedList_1;

import java.util.Scanner;

public class DeleteNodeInLL {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        head = deleteNode(head, 4);
        System.out.println();
        print(head);
    }

    private static Node<Integer> deleteNode(Node<Integer> head, int index) {
        if (head == null) {
            return head;
        }
        if(index<0)
        {
            return head;
        }
        if(index==0)
        {
            return head.next;
        }
        Node<Integer> currNode = head;
        int currPos = 0;
        while(currNode!=null && currPos<index-1)
        {
            currPos = currPos+1;
            currNode = currNode.next;
        }
        if(currNode==null || currNode.next==null)
        {
            return head;
        }
        currNode.next = currNode.next.next;
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
