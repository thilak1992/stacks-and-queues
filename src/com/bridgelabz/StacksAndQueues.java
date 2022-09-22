package com.bridgelabz;

public class StacksAndQueues<T> {
    static class Node<T> {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue<T> {
        static Node front = null;
        static Node rear = null;

        public static boolean isEmpty() {
            return front == null && rear == null;
        }

        public void queue(T data) {
            Node<T> newNode = new <T>Node(data);
            if (front == null) {                 //empty queue
                rear = front = newNode;         // front and rear are at same point at the same node
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        public void disp() {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.queue(56);
            q.queue(30);
            q.queue(70);
            q.disp();

        }
    }
}
