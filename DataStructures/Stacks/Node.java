package Stacks;

public class Node<t> {
    public Node<t> next;
    public t data;

    public Node(t data) {
        this.data = data;
        next = null;
    }

    public Node(t data, Node<t> next) {
        this.data = data;
        this.next = next;
    }

}
