package BinTree;

public class BinTree<t> {
    public TreeNode<t> root;

    public BinTree() {
        root = null;
    }

    public TreeNode<t> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<t> root) {
        this.root = root;
    }

    public boolean insert(t data) {
        if (root == null) {
            root = new TreeNode<t>(data);
            return true;
        } else {
            return root.insert(data);
        }
    }

}
