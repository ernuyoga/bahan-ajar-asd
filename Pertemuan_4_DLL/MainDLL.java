/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_4_DLL;

/**
 *
 * @author ACER
 */
class MainDLL {

    public static void main(String[] args) {
        DLL ll = new DLL();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.printToLast();
        ll.printToFirst();
        
        ll.addLast(3);
        ll.removeFirst();
        ll.printToLast();
        System.out.println(ll.isExist(0));
        System.out.println(ll.isExist(3));
    }
}

class NodeDLL {

    int data;
    NodeDLL next;
    NodeDLL prev;

    NodeDLL(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DLL {

    NodeDLL head;
    NodeDLL tail;
    int size = 0;

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void addFirst(int data) {
        NodeDLL input = new NodeDLL(data);
        if (isEmpty()) {
            head = tail = input;
        } else {
            input.next = head;
            head.prev = input;
            head = input;
        }
        size++;
    }

    void addLast(int data) {
        NodeDLL input = new NodeDLL(data);
        if (isEmpty()) {
            head = tail = input;
        } else {
            input.prev = tail;
            tail.next = input;
            tail = input;
        }
        size++;
    }

    void removeFirst() {
        if (!isEmpty()) {
            if (size == 1) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
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
                tail.next = null;
            }
            size--;
        }
    }

    boolean isExist(int data) {
        NodeDLL pointer = head;
        while (pointer != null) {
            if (pointer.data == data) {
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }

    void printToLast() {
        NodeDLL pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }

    void printToFirst() {
        NodeDLL pointer = tail;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.prev;
        }
        System.out.println();
    }
}
