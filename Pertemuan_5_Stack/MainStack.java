/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_5_Stack;

/**
 *
 * @author ACER
 */
class MainStack {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.print();
        System.out.println(s.top());
        System.out.println(s.popInt());
        s.print();
        s.pop();
        s.print();
    }
}

class NodeStack {

    int data;
    NodeStack next;

    public NodeStack(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {

    NodeStack head, tail;
    int size = 0;

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void push(int data) {
        NodeStack input = new NodeStack(data);
        if (isEmpty()) {
            head = tail = input;
        } else {
            tail.next = input;
            tail = input;
        }
        size++;
    }

    void pop() {
        if (!isEmpty()) {
            if (size == 1) {
                head = tail = null;
            } else {
                NodeStack pointer = head;
                while (pointer.next != tail) {
                    pointer = pointer.next;
                }
                pointer.next = null;
                tail = pointer;
            }
            size--;
        }
    }
    
    int popInt() {
        int dataKeluar = -1;
        if (!isEmpty()) {
            if (size == 1) {
                dataKeluar = head.data;
                head = tail = null;
                size--;
                return dataKeluar;
            } else {
                NodeStack pointer = head;
                while (pointer.next != tail) {
                    pointer = pointer.next;
                }
                dataKeluar = pointer.next.data;
                pointer.next = null;
                tail = pointer;
                size--;
                return dataKeluar;
            }
        }
        return dataKeluar;
    }

    int top() {
        return tail.data;
    }

    boolean isExists(int data) {
        NodeStack pointer = head;
        while (pointer != null) {
            if (pointer.data == data) {
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }

    void print() {
        NodeStack pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }
}
