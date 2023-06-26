package GeneralTree;

import java.util.ArrayList;
import java.util.Arrays;

public class Tree {
    public GenTreeNode root;

    public Tree() {
        root = null;
    }

    public Tree(int data) {
        this.root = new GenTreeNode(data, null);
    }

    public boolean add(int data, int parentData) {
        if (parentData == -1) {
            this.root = new GenTreeNode(data, new ArrayList<GenTreeNode>(Arrays.asList(root)));
            return true;
        }

        if (root == null) {
            root = new GenTreeNode(data);
            return true;
        }

        GenTreeNode parent = find(parentData);
        if (parent == null) {
            return false;
        } else {
            if (parent.children == null) {
                parent.children = new ArrayList<GenTreeNode>();
            }
            parent.children.add(new GenTreeNode(data));
            return true;
        }
    }

    public GenTreeNode find(int data) {
        if (root == null) {
            return null;
        } else {
            return doFind(root, data);
        }
    }

    private GenTreeNode doFind(GenTreeNode current, int data) {
        if (current == null) {
            return null;
        } else {
            if (current.data == data) {
                return current;
            } else {
                if (current.children == null) {
                    return null;
                } else {
                    for (GenTreeNode child : current.children) {
                        GenTreeNode found = doFind(child, data);
                        if (found != null) {
                            return found;
                        }
                    }
                    return null;
                }
            }
        }
    }

    public BinTree changeBinTree() {
        BinTree ab = new BinTree();
        if (this.root == null)
            return ab;

        ab.root = new BinTreeNode(this.root.data);
        this.root.changeGentoBin(ab.root);

        return ab;

    }

}
