package LinkedList_Assignment_2;

import java.util.Scanner;

public class FindNodeInLLRec {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        // using index.
        System.out.println("Node Data is present at-" + findNodeRec(head, 15, 0));
        System.out.println("Node Data is present at-" + findNodeRec1(head, 15));

    }

    private static int findNodeRec1(Node<Integer> head, int n) {
        if (head == null) {
            return -1;
        }
        if (head.data.equals(n)) {
            return 0;
        }
        int smallAns = findNodeRec1(head.next, n);
        if (smallAns == -1) {
            return -1;
        }
        return 1 + smallAns;
    }

    private static int findNodeRec(Node<Integer> head, int n, int index) {
        if (head == null) {
            return -1;
        }
        if (head.data == n) {
            return index;
        }
        return findNodeRec(head.next, n, index + 1);
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
