package Pertemuan_9_BST;

class NodeBST {
    int data;
    NodeBST left, right;

    public NodeBST(int data) {
        this.data = data;
        left = right = null;
    }
}

class BST {
    NodeBST root;

    public void add(int data) {
        root = add(root, data);
    }

    public NodeBST add(NodeBST current, int data) {
        NodeBST temp = current;
        if (temp == null) {
            temp = new NodeBST(data);
        }
        else if (data < current.data) {
            temp.left = add(current.left, data);
        }
        else if (data > current.data) {
            temp.right = add(current.right, data);
        }
        return temp;
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    public NodeBST delete(NodeBST current, int data) {
        if (current == null) {
            return null;
        }
        if (data < current.data) {
            current.left = delete(current.left, data);
            return current;
        }
        else if (data > current.data) {
            current.right = delete(current.right, data);
            return current;
        }
        else {
            // jika data yang akan dihapus merupakan leaf node
            if (current.left == null && current.right == null) {
                return null;
            }
            // jika data yang dihapus memiliki 1 child node
            if (current.right == null) {
                return current.left; // punya child kiri
            }
            if (current.left == null) {
                return current.right; // punya child kanan
            }
            // jika data yang dihapus memiliki 2 child node
            int smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = delete(current.right, smallestValue);
            return current;
        }
    }

    public int findSmallestValue(NodeBST root) {
        if (root.left == null) {
            return root.data;
        }
        else {
            return findSmallestValue(root.left);
        }
    }

    public int findBiggestValue(NodeBST root) {
        if (root.right == null) {
            return root.data;
        }
        else {
            return findBiggestValue(root.right);
        }
    }

    public void preorder(NodeBST current) {
        System.out.print(current.data + " ");
        if (current.left != null) {
            preorder(current.left);
        }
        if (current.right != null) {
            preorder(current.right);
        }
    }

    public void inorder(NodeBST current) {
        if (current.left != null) {
            inorder(current.left);
        }
        System.out.print(current.data + " ");
        if (current.right != null) {
            inorder(current.right);
        }
    }

    public void postorder(NodeBST current) {
        if (current.left != null) {
            postorder(current.left);
        }
        if (current.right != null) {
            postorder(current.right);
        }
        System.out.print(current.data + " ");
    }
}
