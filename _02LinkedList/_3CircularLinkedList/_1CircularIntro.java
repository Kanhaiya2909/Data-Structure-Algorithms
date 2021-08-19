package _02LinkedList._3CircularLinkedList;

import java.util.NoSuchElementException;

public class _1CircularIntro {
	private ListNode last;
	private int length;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	public _1CircularIntro() {
		last = null;
		length =0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void createLinkedList() {
		ListNode first = new ListNode(23);
		ListNode second = new ListNode(67);
		ListNode third = new ListNode(94);
		ListNode fourth = new ListNode(34);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		last = fourth;
	}
	public void display() {
		if (last == null) {
			return;
		}
		ListNode current = last.next;
		while (current != last) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println(current.data);
	}
	public void insertFirst(int data) {
		ListNode newNode = new ListNode(data);
		if (last == null) {
			last = newNode;
		}else {
			newNode.next = last.next;
		}
		last.next = newNode;
		length++;
	}
	 public void insertLast(int data) {
	        ListNode temp = new ListNode(data);
	        if(last == null) {
	            last = temp;
	            last.next = last;
	        } else {
	            temp.next = last.next;
	            last.next = temp;
	            last = temp;
	        }
	        length++;
	    }
	 public ListNode removeFirst() {
	        if(isEmpty()) {
	            throw new NoSuchElementException("Circular Singly Linked List is already empty");
	        }

	        ListNode temp = last.next;
	        if(last.next == last) {
	            last = null;
	        } else {
	            last.next = temp.next;
	        }
	        temp.next = null;
	        length--;
	        return temp;
	    }
	public static void main(String[] args) {
		_1CircularIntro cll = new _1CircularIntro();
		cll.createLinkedList();
		
		cll.insertFirst(788);
		cll.insertFirst(890);
		cll.insertFirst(493);
		cll.insertFirst(231);
		
		cll.insertLast(1);
		cll.insertLast(0);
		cll.insertLast(7);
		cll.insertLast(3);
		
		cll.display();
	}

	
}
