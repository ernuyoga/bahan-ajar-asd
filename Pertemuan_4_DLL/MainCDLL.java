package Pertemuan_4_DLL;

class MainCDLL {
    public static void main(String[] args) {
        CDLL cdll = new CDLL();
        cdll.addFirst(10);
        cdll.addFirst(11);
        cdll.addFirst(5);
        cdll.addFirst(7);
        cdll.printToLast();
        System.out.println(cdll.head.prev.data);

        cdll.removeLast();
        cdll.printToLast();
        cdll.printToFirst();
    }
}

class NodeCDLL {

    int data;
    NodeCDLL next;
    NodeCDLL prev;

    NodeCDLL(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class CDLL {

    NodeCDLL head;
    NodeCDLL tail;
    int size = 0;

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void addFirst(int data) {
        NodeCDLL input = new NodeCDLL(data);
        if (isEmpty()) {
            head = tail = input;
        } else {
            input.next = head;
            head.prev = input;
            head = input;
        }
        head.prev = tail;
        tail.next = head;
        size++;
    }

    void addLast(int data) {
        NodeCDLL input = new NodeCDLL(data);
        if (isEmpty()) {
            head = tail = input;
        } else {
            input.prev = tail;
            tail.next = input;
            tail = input;
        }
        head.prev = tail;
        tail.next = head;
        size++;
    }

    void removeFirst() {
        if (!isEmpty()) {
            if (size == 1) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            size--;

        }
    }

    void removeLast() {
        if (!isEmpty()) {
            if (size == 1) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            }
            size--;
        }
    }

    boolean isExist(int data) {
        NodeCDLL pointer = head;
        while (pointer != null) {
            if (pointer.data == data) {
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }

    void printToLast() {
        NodeCDLL pointer = head;
        do {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        } while (pointer != head);
        System.out.println();
    }

    void printToFirst() {
        NodeCDLL pointer = tail;
        do {
            System.out.print(pointer.data + " ");
            pointer = pointer.prev;
        } while (pointer != tail);
        System.out.println();
    }
}
