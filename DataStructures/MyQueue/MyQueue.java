package MyQueue;

public class MyQueue<t> {
    public Node<t> head;
    public Node<t> tail;

    public MyQueue() {
        head = null;
        tail = null;
    }

    public boolean add(t data) {
        try {
            if (isEmpty()) {
                head = new Node<t>(data);
                tail = head;
            } else {
                tail = tail.next = new Node<t>(data);
            }

            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public t poll() {
        try {
            if (isEmpty()) {
                return null;
            }

            t data = head.data;
            head = head.next;
            return data;

        } catch (Exception e) {
            return null;
        }
    }

    public t peek() {
        try {
            if (isEmpty()) {
                return null;
            }

            return head.data;

        } catch (Exception e) {
            return null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int size = 0;
        Node<t> temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

}
