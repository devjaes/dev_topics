package BinTree;

public class TreeNode<t> {
    public t data;
    public TreeNode<t> left;
    public TreeNode<t> right;

    public TreeNode(t data) {
        this.data = data;
        left = null;
        right = null;
    }

    public TreeNode(t data, TreeNode<t> left, TreeNode<t> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public t getData() {
        return data;
    }

    public void setData(t data) {
        this.data = data;
    }

    public TreeNode<t> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<t> left) {
        this.left = left;
    }

    public TreeNode<t> getRight() {
        return right;
    }

    public void setRight(TreeNode<t> right) {
        this.right = right;
    }

    public void printSimetric() {
        if (this.getLeft() != null) {
            this.getLeft().printSimetric();
        }

        System.out.print(this.getData() + " ");

        if (this.getRight() != null) {
            this.getRight().printSimetric();
        }
    }

    public void printPostorden() {
        if (this.getLeft() != null) {
            this.getLeft().printPostorden();
        }

        System.out.println(this.getData());

    }

    public void printPreorden() {
        System.out.println(this.getData());

        if (this.getLeft() != null) {
            this.getLeft().printPreorden();
        }

        if (this.getRight() != null) {
            this.getRight().printPreorden();
        }
    }

    public boolean insert(t data) {
        if (this.getData() == null) {
            this.setData(data);
            return true;
        } else {
            if (this.getData().hashCode() > data.hashCode()) {
                if (this.getLeft() == null) {
                    this.setLeft(new TreeNode<t>(data));
                    return true;
                } else {
                    this.getLeft().insert(data);
                }
            } else {
                if (this.getRight() == null) {
                    this.setRight(new TreeNode<t>(data));
                    return true;
                } else {
                    this.getRight().insert(data);
                }
            }
        }
        return false;
    }

}