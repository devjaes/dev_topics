package Stacks;

public class MyStack<t> {
    public Node<t> head;

    public MyStack() {
        head = null;
    }

    public boolean push(t data) {
        try {
            if (isEmpty()) {
                head = new Node<t>(data);

            } else {
                head = new Node<t>(data, head);
            }

            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public t pop() {
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
