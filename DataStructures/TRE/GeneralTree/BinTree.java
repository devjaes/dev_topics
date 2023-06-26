package GeneralTree;

public class BinTree {
    public BinTreeNode root;

    public BinTree() {
        root = null;
    }

    public BinTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinTreeNode root) {
        this.root = root;
    }

    public boolean insert(int data) {
        if (root == null) {
            root = new BinTreeNode(data);
            return true;
        } else {
            return root.insert(data);
        }
    }
}
