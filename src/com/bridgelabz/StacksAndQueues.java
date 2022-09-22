package com.bridgelabz;

public class StacksAndQueues {
    static com.bridgelabz.StacksAndQueues.Node head;

    static class Node {
        int data;
        com.bridgelabz.StacksAndQueues.Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static boolean isEmpty() {

            return head == null;
        }

        public static void push(int data) {
            com.bridgelabz.StacksAndQueues.Node newNode = new com.bridgelabz.StacksAndQueues.Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static void display() {
            com.bridgelabz.StacksAndQueues.Node current = head;
            if (head == null) {
                System.out.println("List is empty");
            }
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        com.bridgelabz.StacksAndQueues.Stack s = new com.bridgelabz.StacksAndQueues.Stack();
        s.push(70);
        s.push(30);
        s.push(56);
        s.display();
    }
}
