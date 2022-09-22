package com.bridgelabz;

public class StacksAndQueues<T> {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node front = null;
        static Node rear = null;

        public static boolean isEmpty() {
            return front == null && rear == null;
        }

        public void queue(int data) {
            Node newNode = new Node(data);
            if (front == null) {                 //empty queue
                rear = front = newNode;         // front and rear are at same point at the same node
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        public int dequeue(int data) {
            Node newNode = new Node(data);
            if (front == null) {
                System.out.println("Queue is empty ");

            }
            int result = front.data;
            front = front.next;
            return result;
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
            System.out.print("Queue values before Dequeue operation : ");
            q.disp();
            System.out.println();
            q.dequeue(56);
            q.dequeue(30);
            System.out.print("Queue values After Implementing dequeue Operation is : ");
            q.disp();

        }
    }
}
