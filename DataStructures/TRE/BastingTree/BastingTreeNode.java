package BastingTree;

public class BastingTreeNode {
    private Comparable data;
    private BastingTreeNode left;
    private boolean isTrueLeft;
    private BastingTreeNode right;
    private boolean isTrueRight;

    public BastingTreeNode(Comparable data) {
        this.data = data;
        left = null;
        right = null;
        isTrueLeft = false;
        isTrueRight = false;
    }

    public BastingTreeNode(Comparable data, BastingTreeNode left, BastingTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
        isTrueLeft = false;
        isTrueRight = false;
    }

    public BastingTreeNode(Comparable data, BastingTreeNode left, boolean isTrueLeft, BastingTreeNode right,
            boolean isTrueRight) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.isTrueLeft = isTrueLeft;
        this.isTrueRight = isTrueRight;
    }

    public Comparable getData() {
        return data;
    }

    public void setData(Comparable data) {
        this.data = data;
    }

    public BastingTreeNode getLeft() {
        return left;
    }

    public void setLeft(BastingTreeNode left) {
        this.left = left;
    }

    public BastingTreeNode getRight() {
        return right;
    }

    public void setRight(BastingTreeNode right) {
        this.right = right;
    }

    public boolean isTrueLeft() {
        return isTrueLeft;
    }

    public void setTrueLeft(boolean isTrueLeft) {
        this.isTrueLeft = isTrueLeft;
    }

    public boolean isTrueRight() {
        return isTrueRight;
    }

    public void setTrueRight(boolean isTrueRight) {
        this.isTrueRight = isTrueRight;
    }

}
