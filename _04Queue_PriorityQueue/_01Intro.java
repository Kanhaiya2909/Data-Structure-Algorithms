package _04Queue_PriorityQueue;

import java.util.NoSuchElementException;

public class _01Intro {

	private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode {
        private int data; // Can be a generic type
        private ListNode next; // Reference to next ListNode in list

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public _01Intro() {
        front = null;
        rear = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if(isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public int dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is already empty");
        }
        int result = front.data;
        front = front.next;
        if(front == null) {
            rear = null;
        }
        length--;
        return result;
    }

    public void print() {
        if(isEmpty()) {
            return;
        }

        ListNode current = front;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        _01Intro queue = new _01Intro();
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);

        queue.print();

        queue.dequeue();
        queue.dequeue();

        queue.print();
    }
}
