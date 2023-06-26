package LCD;

public class DoubleCircleList {
    public Node head;
    public int size;

    public DoubleCircleList() {
        head = null;
        head.prev = null;
        size = 0;
    }

    public boolean prepend(Object data) {
        try {
            if (head == null) {
                head = new Node(data);
                head.next = head.prev = head;

            } else {
                head.next.prev = head.prev.next = head = head.prev = new Node(data, head, head.prev);
            }

            size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean append(Object data) {
        try {
            if (head == null) {
                head = new Node(data, head, head);

            } else {
                head.prev = head.prev.next = new Node(data, head, head.prev);
            }

            size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean add(Object data) {
        Node newNode = new Node(data);

        try {
            if (head == null) {
                newNode.next = head = head.prev = newNode;
                newNode.prev = head.prev;

            } else {
                head.prev = head.prev = head.prev.next = newNode;
                head.prev.next = head;
            }

            size++;
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean add(Object data, int index) {

        if (index < 0 || index > size || data == null) {
            return false;
        }

        try {
            if (index == 0) {
                return prepend(data);

            } else if (index == size) {
                return append(data);

            } else {

                Node temp;

                if (index > size / 2) {
                    temp = head.prev;
                    for (int i = size - 1; i > index; i--) {
                        temp = temp.prev;
                    }

                } else {
                    temp = head;
                    for (int i = 0; i < index; i++) {
                        temp = temp.next;
                    }
                }

                temp.prev.prev.next = temp.prev = new Node(data, temp, temp.prev);

            }

            size++;
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean removeFirst() {
        if (head == null) {
            return false;
        }

        try {
            if (head == head.prev) {
                head = head.prev = null;
                size = 0;
                return true;
            }

            head.next.prev = head.prev;
            head.prev.next = head = head.next;
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
                head.prev = head.prev.prev;
                head.prev.next = head;

            } else {

                Node temp;
                if (index > size / 2) {
                    temp = head.prev;
                    for (int i = size - 1; i > index; i--) {
                        temp = temp.prev;
                    }

                } else {
                    temp = head;
                    for (int i = 0; i < index; i++) {
                        temp = temp.next;
                    }
                }

                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }

            size--;
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean remove(Object data) {
        if (data == null || head == null) {
            return false;
        }

        boolean isRemoved = false;

        try {
            while (head.data != null && head.data.equals(data)) {

                this.removeFirst();
                isRemoved = true;
            }

            if (head == null) {
                return isRemoved;
            }

            Node temp = head;

            while (temp.next != head) {

                if (temp.next.data.equals(data)) {

                    if (temp.next == head.prev) {
                        head.prev = head.prev = head.prev.prev;
                        head.prev.next = head;
                        isRemoved = true;
                        size--;
                        break;
                    }

                    temp.next = temp.next.next;
                    temp.next.prev = temp;
                    size--;
                    isRemoved = true;

                }

                temp = temp.next;
            }

            return isRemoved;

        } catch (Exception e) {
            return false;
        }
    }

    public Node get(int index) {
        if (index < 0 || index >= size || head == null) {
            return null;
        }

        Node temp;

        if (index > size / 2) {
            temp = head.prev;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }

        } else {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }

        return temp;
    }

}
