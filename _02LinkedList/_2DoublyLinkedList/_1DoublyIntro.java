package _02LinkedList._2DoublyLinkedList;

import java.util.NoSuchElementException;

public class _1DoublyIntro {

	private ListNode head;
	private ListNode tail;
	private int length;
	
	private static class ListNode{
		private ListNode next;
		private ListNode previous;
		private int data;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public _1DoublyIntro() {
		head = null;
		tail = null;
		length = 0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if (isEmpty()) {
			tail = newNode;
		}else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (isEmpty()) {
			head = newNode;
		}else {
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail = newNode;
		length++;
	}
	public void printForward() {
		if (head == null) {
			return;
		}
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data+ " --> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public void printBackward() {
		if (head == null) {
			return;
		}
		ListNode temp = tail;
		while (temp != null) {
			System.out.print(temp.data+ " --> ");
			temp = temp.previous;
		}
		System.out.print("null");
		System.out.println();
	}
	public ListNode deleteFirst() {
		  if(isEmpty()) {
	            throw new NoSuchElementException();
	        }
	        ListNode temp = head;
	        if(head == tail) {
	            tail = null;
	        } else {
	            head.next.previous = null;
	        }
	        head = head.next;
	        temp.next = null;
	        length--;
	        return temp;
		
	}
	public ListNode deleteLast() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

	public static void main(String[] args) {
		_1DoublyIntro dll = new _1DoublyIntro();

		
		dll.insertFirst(67);
		dll.insertFirst(78);
		dll.insertFirst(40);
		dll.insertFirst(72);
		
		dll.insertLast(509);
		dll.insertLast(659);
		dll.insertLast(379);
		dll.insertLast(950);
		
		dll.printForward();
		dll.printBackward();
		
		dll.deleteFirst();
		
		dll.printForward();
		dll.printBackward();
		
		dll.deleteLast();
		
		dll.printForward();
		dll.printBackward();
	}
}
