package LinkedList_Assignment_2;

import java.util.Scanner;

public class EvenAfterOddLL {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        System.out.println();
        head = evenOdd(head);
        print(head);
    }

    private static Node<Integer> evenOdd(Node<Integer> head) {
        if (head == null) {
            return head;
        }
        Node<Integer> oddHead = null, oddTail = null, evenHead = null, evenTail = null;
        while (head != null) {
            if (head.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = head;
                    evenTail = head;
                } else {
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = head;
                    oddTail = head;
                } else {
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;
        }
        if (oddHead == null) {
            return evenHead;
        } else {
             oddTail.next = evenHead;
        }
        if (evenHead != null)
        {
            evenTail.next = null;
        }
        return oddHead;
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
