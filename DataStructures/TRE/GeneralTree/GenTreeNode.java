package GeneralTree;

import java.util.List;

public class GenTreeNode {
    public int data;
    public List<GenTreeNode> children;

    public GenTreeNode(int data) {
        this.data = data;
        children = null;
    }

    public GenTreeNode(int data, List<GenTreeNode> children) {
        this.data = data;
        this.children = children;
    }

    public int getData() {
        return data;
    }

    public List<GenTreeNode> getChildren() {
        return children;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setChildren(List<GenTreeNode> children) {
        this.children = children;
    }

    public void changeGentoBin(BinTreeNode ab) {
        if (this.children == null)
            return;

        if (this.children.size() == 1) {
            ab.left = new BinTreeNode(this.children.get(0).data);
            this.children.get(0).changeGentoBin(ab.left);
        } else if (this.children.size() == 2) {
            ab.left = new BinTreeNode(this.children.get(0).data);
            ab.right = new BinTreeNode(this.children.get(1).data);
            this.children.get(0).changeGentoBin(ab.left);
            this.children.get(1).changeGentoBin(ab.right);
        } else {
            ab.left = new BinTreeNode(this.children.get(0).data);
            ab.right = new BinTreeNode(this.children.get(1).data);
            this.children.get(0).changeGentoBin(ab.left);
            this.children.get(1).changeGentoBin(ab.right);
            for (int i = 2; i < this.children.size(); i++) {
                ab.right.insert(this.children.get(i).data);
                this.children.get(i).changeGentoBin(ab.right);
            }
        }
    }

}
