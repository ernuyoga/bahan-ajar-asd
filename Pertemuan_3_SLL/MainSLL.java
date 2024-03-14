/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3_SLL;

/**
 *
 * @author ACER
 */
class MainSLL {

    public static void main(String[] args) {
        SLL ll = new SLL();
        ll.addFirst(0);
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        
        boolean ada = ll.isExists(5);
        if(ada) {
            System.out.println("angka ditemukan");
        } else {
            System.out.println("angka tidak ditemukan");
        }
        System.out.println(ada);
    }
}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SLL {

    Node head;
    Node tail;
    int size = 0;

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void addFirst(int data) {
        Node input = new Node(data);
        if (isEmpty()) {
            head = tail = input;
        } else {
            input.next = head;
            head = input;
        }
        size++;
    }

    void addLast(int data) {
        Node input = new Node(data);
        if (isEmpty()) {
            head = tail = input;
        } else {
            tail.next = input;
            tail = input;
        }
        size++;
    }

    void removeFirst() {
        head = head.next;
        size--;
    }

    void removeLast() {
        Node pointer = head;
        while (pointer.next != tail) {
            pointer = pointer.next;
        }
        pointer.next = null;
        tail = pointer;
        size--;
    }

    boolean isExists(int data) {
        Node pointer = head;
        while (pointer != null) {
            if (pointer.data == data) {
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }

    void print() {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }
}
