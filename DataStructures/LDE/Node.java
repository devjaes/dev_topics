public class Node {
    public Object data;
    public Node previous;
    public Node next;

    public Node(Object data, Node previous, Node next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public Node(Object data) {
        this(data, null, null);
    }

}