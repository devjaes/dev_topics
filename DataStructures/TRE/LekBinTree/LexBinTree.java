package LekBinTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import BinTree.BinTree;
import BinTree.TreeNode;

public class LexBinTree extends BinTree<Integer> {
    public LexBinTree() {
        super();
    }

    public boolean insert(int number) {
        TreeNode<Integer> newTreeNode = new TreeNode<>(number);

        if (getRoot() == null) {
            setRoot(newTreeNode);
            return true;
        } else {
            TreeNode<Integer> current = getRoot();

            while (true) {
                if (number < current.getData()) {
                    if (current.getLeft() == null) {
                        current.setLeft(newTreeNode);
                        return true;
                    } else {
                        current = current.getLeft();
                    }
                } else if (number > current.getData()) {
                    if (current.getRight() == null) {
                        current.setRight(newTreeNode);
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

    public boolean insert(List<Integer> values) {
        values = new ArrayList<>(new HashSet<>(values));

        try {
            for (Integer value : values) {
                insert(value);
            }
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean insertR(int number) {
        setRoot(insertRecursive(getRoot(), number));
        return true;
    }

    private TreeNode<Integer> insertRecursive(TreeNode<Integer> root, int number) {
        if (root == null) {
            return new TreeNode<Integer>(number);
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

    public String chidsToString(TreeNode<Integer> root) {

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
