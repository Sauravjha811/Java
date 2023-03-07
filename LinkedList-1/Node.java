package LinkedList_1;

public class Node<T> {
    // Node consists of two elements
    // 1. data   2. address or reference of the next node.
    T data;
    Node<T> next;

    Node(T data)
    {
        this.data = data;
    }
}
