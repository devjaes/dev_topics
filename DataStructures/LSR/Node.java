public class Node<e> {
    e data;
    Node<e> next;

    public Node(e data, Node<e> next) {
        this.data = data;
        this.next = next;
    }

    public Node(e data) {
        this(data, null);
    }
}