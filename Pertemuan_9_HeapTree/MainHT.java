/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_9_HeapTree;

/**
 *
 * @author ACER
 */
public class MainHT {
    public static void main(String[] args) {
        HT ht = new HT();
        ht.add(12);
        ht.add(10);
        ht.add(15);
        ht.add(20);
        ht.add(8);
        ht.add(6);
        ht.add(18);
        ht.add(5);
        ht.add(17);
        ht.add(16);
        
        ht.preorder(ht.root);
        ht.max();
        System.out.println();
        ht.preorder(ht.root);
        ht.max();
        System.out.println();
        ht.preorder(ht.root);
        
        System.out.println();
        ht.inorder(ht.root);
        System.out.println();
        ht.postorder(ht.root);
    }
}

class NodeHT {
    int data;
    NodeHT left, right, parent;

    public NodeHT(int data) {
        this.data = data;
        left = right = null;
    }

    public NodeHT(int data, NodeHT parent) {
        this.data = data;
        this.parent = parent;
        left = right = null;
    }
}

class HT {
    NodeHT root, last;

    public void add(int data) {
        if (root == null) {
            root = last = new NodeHT(data);
            return;
        }
        Queue queue = new Queue();
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            NodeHT node = queue.dequeue();
            if (node.left == null) {
                node.left = new NodeHT(data, node);
                last = node.left;
                heapifyUp(node.left);
                return;
            } else {
                queue.enqueue(node.left);
            }
            if (node.right == null) {
                node.right = new NodeHT(data, node);
                last = node.right;
                heapifyUp(node.right);
                return;
            } else {
                queue.enqueue(node.right);
            }
        }
    }

    public void heapifyUp(NodeHT node) {
        if (node.parent == null) {
            return;
        }
        int parentData = node.parent.data;
        if (node.data > parentData) {
            node.parent.data = node.data;
            node.data = parentData;
            heapifyUp(node.parent);
        }
    }

    public int max() { //jika tree kosong
        if (root == null)
            return -1;
        int max = root.data;
        if (root == last) { //jika node hanya 1
            root = last = null;
        } else {
            if (last.parent != null) { //nilai node terakhir jadi root
                root.data = last.data;
                if (last == last.parent.right) {
                    last.parent.right = null;
                    last = last.parent.left;
                } else { //mencari node terakhir jika last ada di sebelah kiri
                    last.parent.left = null;
                    Queue queue = new Queue();
                    queue.enqueue(root);
                    last = root;
                    while (!queue.isEmpty()) {
                        NodeHT node = queue.dequeue();
                        if (node.left == null) {
                            break;
                        } else {
                            queue.enqueue(node.left);
                            last = node.left;
                        }
                        if (node.right == null) {
                            break;
                        } else {
                            queue.enqueue(node.right);
                            last = node.right;
                        }
                    }
                }
            } else {
                root = last;
            }
            heapifyDown(root);
        }
        return max;
    }

    public void heapifyDown(NodeHT node) {
        int parentData = node.data;
        int leftData = 0, rightData = 0;
        if (node.left != null) {
            leftData = node.left.data;
        }
        if (node.right != null) {
            rightData = node.right.data;
        }

        if (leftData > parentData || rightData > parentData) { //membandingkan parent dengan anak"nya
            if (leftData > rightData) {
                node.data = leftData;
                node.left.data = parentData;
                heapifyDown(node.left);
            } else {
                node.data = rightData;
                node.right.data = parentData;
                heapifyDown(node.right);
            }
            if (node.data != 0) {
                heapifyDown(node);
            }
        }

    }

    public void preorder(NodeHT current) {
        if (root == null)
            return;
        System.out.print(current.data + " ");
        if (current.left != null) {
            preorder(current.left);
        }
        if (current.right != null) {
            preorder(current.right);
        }
    }

    public void inorder(NodeHT current) {
        if (current.left != null) {
            inorder(current.left);
        }
        System.out.print(current.data + " ");
        if (current.right != null) {
            inorder(current.right);
        }
    }

    public void postorder(NodeHT current) {
        if (current.left != null) {
            postorder(current.left);
        }
        if (current.right != null) {
            postorder(current.right);
        }
        System.out.print(current.data + " ");
    }
}

class NodeQueue {
    NodeHT data;
    NodeQueue next;

    public NodeQueue(NodeHT data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    NodeQueue head, tail;
    int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(NodeHT data) {
        NodeQueue input = new NodeQueue(data);
        if (isEmpty()) {
            head = tail = input;
        } else {
            tail.next = input;
            tail = input;
        }
        size++;
    }

    public NodeHT dequeue() {
        if (!isEmpty()) {
            NodeHT temp = head.data;
            head = head.next;
            size--;
            return temp;
        }
        return null;
    }
}
