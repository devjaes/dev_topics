package GeneralTree;

public class BinTreeNode {
    BinTreeNode left;
    BinTreeNode right;
    int data;
    BinTreeNode parent;

    public BinTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public BinTreeNode(int data, BinTreeNode left, BinTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BinTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinTreeNode left) {
        this.left = left;
    }

    public BinTreeNode getRight() {
        return right;
    }

    public void setRight(BinTreeNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinTreeNode getParent() {
        return parent;
    }

    public void setParent(BinTreeNode parent) {
        this.parent = parent;
    }

    public boolean insert(int data) {
        if (data < this.data) {
            if (left == null) {
                left = new BinTreeNode(data);
                return true;
            } else {
                return left.insert(data);
            }
        } else if (data > this.data) {
            if (right == null) {
                right = new BinTreeNode(data);
                return true;
            } else {
                return right.insert(data);
            }
        } else {
            return false;
        }
    }

    public void printSimetric() {
        if (left != null)
            left.printSimetric();
        System.out.print(data + " ");
        if (right != null)
            right.printSimetric();
    }

    public void printPreOrder() {
        System.out.print(data + " ");
        if (left != null)
            left.printPreOrder();
        if (right != null)
            right.printPreOrder();
    }

    public void printPostOrder() {
        if (left != null)
            left.printPostOrder();
        if (right != null)
            right.printPostOrder();
        System.out.print(data + " ");
    }
}
