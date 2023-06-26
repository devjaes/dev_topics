package GeneralTree;

public class Test {
    public static void main(String[] args) {
        Tree tree3 = new Tree();
        tree3.add(5, -1);
        tree3.add(3, 5);
        tree3.add(8, 5);
        tree3.add(6, 3);
        tree3.add(9, 3);
        tree3.add(10, 8);

        BinTree binTree = tree3.changeBinTree();
        binTree.root.printSimetric();
    }
}
