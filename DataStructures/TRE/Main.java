import BastingTree.BastingTree;
import BinTree.BinTree;
import BinTree.TreeNode;
import GeneralTree.Tree;
import LekBinTree.LexBinTree;

public class Main {
    public static void main(String[] args) {
        BinTree<Integer> tree = new BinTree<Integer>();

        tree.root = new TreeNode<Integer>(5, null, null);
        tree.root.right = new TreeNode<Integer>(7, new TreeNode<Integer>(6, null, null),
                new TreeNode<Integer>(8, null, null));

        LexBinTree tree2 = new LexBinTree();
        tree2.insertR(5);
        tree2.insertR(3);
        tree2.insertR(8);
        tree2.insertR(6);
        tree2.insertR(9);
        tree2.insertR(10);

        // tree2.print();

        BastingTree bastingTree = new BastingTree();
        bastingTree.insert(5);
        bastingTree.insert(3);
        bastingTree.insert(8);
        bastingTree.insert(6);
        bastingTree.insert(9);

        bastingTree.print();

    }
}
