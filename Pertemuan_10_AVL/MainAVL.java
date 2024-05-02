package Pertemuan_10_AVL;

public class MainAVL {
    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.add(70);
        tree.add(50);
        tree.add(60);

        tree.preorder(tree.root);
    }
}
