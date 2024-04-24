package Pertemuan_9_BST;

public class MainBST {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(12);
        bst.add(8);
        bst.add(19);
        bst.add(10);
        bst.add(20);
        bst.add(15);
        bst.add(6);
        bst.preorder(bst.root);
        System.out.println();
        bst.delete(8);
        bst.preorder(bst.root);
        System.out.println();
        bst.delete(15);
        bst.preorder(bst.root);
        System.out.println();
        System.out.println(bst.findSmallestValue(bst.root));
        System.out.println(bst.findBiggestValue(bst.root));
    }
}
