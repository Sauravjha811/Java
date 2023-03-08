package LinkedList_1;

import java.util.Scanner;

public class AppendLastNToFirst {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        head = Append(head, 3);
        print(head);
    }

    private static Node<Integer> Append(Node<Integer> head, int n) {
        if (head == null || n == 0) {
            return head;
        }
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        Node<Integer> Initialhead = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        Node<Integer> temp = slow.next;
        slow.next = null;
        fast.next = Initialhead;
        head = temp;
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
