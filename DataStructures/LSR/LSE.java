public class LSE<e> {
    Node<e> first;
    int size;

    public LSE() {
        this.first = null;
        this.size = 0;
    }

    public boolean insert(e data) {
        Node<e> newNode = new Node<e>(data);

        if (this.first == null) {
            try {
                this.first = newNode;
                this.size = 1;
                return true;
            } catch (Exception e) {
                return false;
            }

        }

        Node current = this.first;
        while (current.next != null)
            current = current.next;

        try {
            current.next = newNode;
            this.size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean insert(int index, e data) {
        if (index < 0 || index > this.size)
            return false;

        if (index == 0) {
            this.first = new Node(data, this.first);
            this.size++;
            return true;
        }

        Node current = this.first;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        current.next = new Node(data, current.next);
        this.size++;
        return true;
    }

    public boolean remove(int index) {
        if (this.first == null || index < 0 || index >= this.size)
            return false;

        if (index == 0) {
            this.first = this.first.next;
            this.size--;
            return true;
        }

        Node current = this.first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        this.size--;
        return true;
    }

    public boolean remove(Object data) {
        if (this.first == null || data == null)
            return false;

        boolean removed = false;

        while (this.first != null && this.first.data.equals(data)) {
            this.first = this.first.next;
            this.size--;
            removed = true;
        }

        Node current = this.first;

        while (current != null && current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                this.size--;
                removed = true;
            }
            current = current.next;
        }

        return removed;
    }

    public Object get(int index) {
        if (this.first == null || index < 0 || index >= this.size)
            return null;

        Node current = this.first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

}
