package Pertemuan_8_BinaryTree;

class NodeQueue {
    NodeBT data;
    NodeQueue next;

    public NodeQueue(NodeBT data) {
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

    public void enqueue(NodeBT data) {
        NodeQueue input = new NodeQueue(data);
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            tail.next = input;
            tail = input;
        }
        size++;
    }

    public NodeBT dequeue() {
        if (!isEmpty()) {
            NodeBT temp = head.data;
            head = head.next;
            size--;
            return temp;
        }
        return null;
    }
}
