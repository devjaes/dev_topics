package GeneralTree;

public class LexBinTree extends BinTree {
    public LexBinTree() {
        super();
    }

    public boolean insert(int number) {
        BinTreeNode newBinTreeNode = new BinTreeNode(number);

        if (getRoot() == null) {
            setRoot(newBinTreeNode);
            getRoot().setParent(null);
            return true;
        } else {
            BinTreeNode current = getRoot();

            while (true) {
                if (number < current.getData()) {
                    if (current.getLeft() == null) {
                        current.setLeft(newBinTreeNode);
                        current.getLeft().setParent(current);
                        return true;
                    } else {
                        current = current.getLeft();
                    }
                } else if (number > current.getData()) {
                    if (current.getRight() == null) {
                        current.setRight(newBinTreeNode);
                        current.getRight().setParent(current);
                        return true;
                    } else {
                        current = current.getRight();
                    }
                } else {
                    return false;
                }
            }
        }
    }

    public boolean insertR(int number) {
        setRoot(insertRecursive(getRoot(), number));
        return true;
    }

    private BinTreeNode insertRecursive(BinTreeNode root, int number) {
        if (root == null) {
            return new BinTreeNode(number);
        }

        if (number < root.getData()) {
            root.setLeft(insertRecursive(root.getLeft(), number));
        } else if (number > root.getData()) {
            root.setRight(insertRecursive(root.getRight(), number));
        } else {
            return root;
        }

        return root;
    }

    @Override
    public String toString() {
        String LexTree = String.valueOf(getRoot()) + "\n";

        return LexTree;
    }

    public String chidsToString(BinTreeNode root) {

        return (root.getLeft().equals(null) ? "null"
                : String.valueOf(root.getData()))
                + (root.getRight().equals(null) ? "null"
                        : String.valueOf(root.getData()));

    }

    public void print() {
        if (getRoot().equals(null)) {
            System.out.println("");
        } else {
            getRoot().printSimetric();
        }

    }

    // 3,5,6,8,9,10--S
    // 3,6,10,9,8,5--POS
}
