package _02LinkedList._1SinglyLinkedList;


public class _02InsertionDeletionSearch {
private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public int length() {
		ListNode current = head;
		int count =0;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	public void insertFirst(int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
	}
	public void insertLast(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	public void atPosition(int data, int position) {
		ListNode newNode = new ListNode(data);
		if (position == 1) {
			newNode.next = head;
			head = newNode;
		}else {
			ListNode previous = head;
			int count = 1;
			while (count < position -1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = newNode;
			newNode.next = current;
		}
	}
	public ListNode deleteFirst() {
		if (head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	public ListNode deleteLast() {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	public void deleteAtPosition(int position) {
		if (position == 1) {
			head = head.next;
		}else {
			ListNode previous = head;
			int count = 1;
			while (count < position-1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
		}
	}
	public boolean search(int searchKey) {
		if (head == null) {
			return false;
		}
		ListNode current = head;
		while (current != null) {
			if (current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		_02InsertionDeletionSearch sll = new _02InsertionDeletionSearch();
		sll.insertFirst(78);
		sll.insertFirst(8);
		sll.insertFirst(98);
		
		sll.insertLast(97);
		sll.insertLast(56);
		
		sll.atPosition(20, 2);
		
		sll.display();
		
		sll.deleteFirst();
		sll.display();
		
		sll.deleteLast();
		sll.display();
		
		sll.deleteAtPosition(1);
		sll.display();


		if (sll.search(97)){
            System.out.println("search key founded");

        }else {
            System.out.println("search key not founded");
        }
		
		
		System.out.println("Length is : "+sll.length());
		
		
		
	}

}
