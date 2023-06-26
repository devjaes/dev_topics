package LCS;

public class CircleList<T> {
    public Node<T> head;
    public Node<T> tail;
    public int size;

    public CircleList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean prepend(T data) {
        try {
            if (head == null) {
                head = tail = new Node<>(data);
                tail.next = head;

            } else {
                tail.next = head = new Node<>(data, head);
            }

            size++;
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean append(T data) {
        try {
            if (head == null) {
                head = tail = new Node<>(data);
                tail.next = head;

            } else {
                tail = tail.next = new Node<>(data, head);
            }

            size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean add(T data) {
        Node<T> newNode = new Node<>(data);

        try {
            if (head == null) {
                newNode.next = head = tail = newNode;

            } else {
                tail = tail.next = newNode;
                tail.next = head;
            }

            size++;
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean add(T data, int index) {
        Node<T> newNode = new Node<>(data);

        if (index < 0 || index > size || data == null) {
            return false;
        }

        try {
            if (index == 0) {
                return prepend(data);

            } else if (index == size) {
                return append(data);

            } else {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }

            size++;
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public Node<T> get(int index) {
        if (index < 0 || index >= size || head == null) {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public boolean removeFirst() {
        if (head == null) {
            return false;
        }

        try {
            if (head == tail) {
                head = tail = null;
                size = 0;
                return true;
            }

            tail.next = head = head.next;
            size--;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size || head == null) {
            return false;
        }

        try {
            if (index == 0) {
                return removeFirst();

            } else if (index == size - 1) {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                tail = temp;
                tail.next = head;

            } else {
                Node<T> temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            size--;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean removeEquals(T data) {
        if (data == null || head == null) {
            return false;
        }

        boolean isRemoved = false;

        try {
            while (head.data != null && head.data.equals(data)) {

                this.removeFirst();
                isRemoved = true;
            }

            Node temp = head;

            while (temp.next != head) {

                if (temp.next.data.equals(data)) {

                    if (temp.next == tail) {
                        tail = temp;
                        tail.next = head;
                        isRemoved = true;
                        size--;
                        break;
                    }

                    temp.next = temp.next.next;
                    isRemoved = true;
                    size--;
                }

                temp = temp.next;
            }

            return isRemoved;
        } catch (Exception e) {
            return false;
        }
    }
}