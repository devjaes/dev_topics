package MyQueue;

public class Node<t> {
    t data;
    Node<t> next;

    public Node(t data) {
        this.data = data;
        next = null;
    }

    public Node(t data, Node<t> next) {
        this.data = data;
        this.next = next;
    }

}
