package LCD;

public class Node {
    public Object data;
    public Node next;
    public Node prev;

    public Node(Object data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node(Object data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
