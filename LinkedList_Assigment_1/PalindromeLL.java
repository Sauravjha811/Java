package LinkedList_1;

import java.util.Scanner;

public class PalindromeLL {
    public static void main(String[] args) {
        Node<Integer> head = OptimizedTakeInput();
        print(head);
        head = revLL(head);
        System.out.println();
        print(head);
        System.out.println(isPalindrome(head));
    }

    private static Node<Integer> revLL(Node<Integer> head) {
        Node<Integer> currNode = head;
        Node<Integer> prev = null;
        Node<Integer> fwd = null;
        while (currNode != null) {
            fwd = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = fwd;
        }
        return prev;
    }

    private static boolean isPalindrome(Node<Integer> head) {
        if (head == null || head.next == null) {
            return true;
        }
        // find the linkedlist center.
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node<Integer> secondHead = slow.next;
        slow.next = null;

        secondHead = revLL(secondHead);

        // compare two sublists now.
           Node<Integer> firstSubList = secondHead;
           Node<Integer> secondSubList = head;

           while(firstSubList!=null)
           {
            if(firstSubList.data!=secondSubList.data)
            {
                return false;
            }
            firstSubList = firstSubList.next;
            secondSubList = secondSubList.next;
           }
           // Rejoin the LinkedList to its original form.
           firstSubList = head;
           secondSubList = revLL(secondHead);
           while(firstSubList.next!=null)
           {
            firstSubList=firstSubList.next;
           }
           firstSubList.next = secondSubList;

           return true;
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