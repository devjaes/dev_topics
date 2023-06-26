public class LDE {
    public Node first;
    public Node last;
    public int size;

    public LDE() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean append(Object data) {
        if (data.equals(null))
            return false;

        try {
            this.last = this.last.next = new Node(data, this.last, null);
            this.size++;
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean preppend(Object data) {
        if (data.equals(null))
            return false;
        try {
            if (this.size == 0) {
                this.first = this.last = new Node(data, null, null);
                return true;
            }
            this.first.next.previous = this.first = new Node(data, null, this.first);
            this.size++;
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean insert(Object data, int index) {
        if (data.equals(null) || index < 0 || index > this.size)
            return false;

        if (index == 0)
            return this.preppend(data);

        if (index == this.size)
            return this.append(data);

        try {

            Node current;

            if (index < this.size / 2) {
                current = this.first;

                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
            } else {
                current = this.last;

                for (int i = this.size - 1; i > index; i--) {
                    current = current.previous;
                }
            }

            current.previous.next = current.next.previous = current = new Node(data, current.previous, current);
            this.size++;
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    public boolean removeFirst() {
        if (this.size == 0)
            return false;

        if (this.size == 1) {
            this.first = this.last = null;
            this.size = 0;
            return true;
        }

        this.first = this.first.next;
        this.first.previous = null;
        this.size--;
        return true;
    }

    public boolean removeLast() {
        if (this.size == 0)
            return false;

        if (this.size == 1) {
            this.first = this.last = null;
            this.size = 0;
            return true;
        }

        this.last = this.last.previous;
        this.last.next = null;
        this.size--;
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= this.size)
            return false;

        if (index == 0) {
            return this.removeFirst();
        }

        if (index == this.size - 1) {
            return this.removeLast();
        }

        Node current;

        if (index < this.size / 2) {
            current = this.first;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = this.last;

            for (int i = this.size - 1; i > index; i--) {
                current = current.previous;
            }
        }

        current.next = current.next.next;
        current.next.previous = current;
        this.size--;
        return true;
    }

    public boolean remove(Object data) {
        if (data.equals(null) || this.size == 0)
            return false;

        boolean isRemoved = false;

        while (this.first.data != null && this.first.data.equals(data) && this.size > 0) {
            this.remove(0);
            isRemoved = true;
        }

        if (this.size == 0)
            return isRemoved;

        Node current = this.first;

        while (current.next != null) {

            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                
                if (current.next != null) {
                    current.next.previous = current;
                    this.size--;
                } else {
                    this.removeLast();
                }
                isRemoved = true;
            } else {
                current = current.next;
            }
        }

        return isRemoved;
    }

    public Node get(int index) {
        if (index < 0 || index >= this.size)
            return null;

        Node current;

        if (index < this.size / 2) {
            current = this.first;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = this.last;

            for (int i = this.size - 1; i > index; i--) {
                current = current.previous;
            }
        }

        return current;
    }
}
