package _02LinkedList._1SinglyLinkedList;

public class _04LoopDectect_Remove_FindStartingPoint {

	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void print() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
	public boolean containLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr= fastPtr.next.next;
			
		if (slowPtr == fastPtr) {
			return true;
		}
		}
		return false;
	}
	public ListNode findStartingPointLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr= fastPtr.next.next;
			
		if (slowPtr == fastPtr) {
			return getStartPoint(slowPtr);
		}
		}
		return null;
	}
	public ListNode getStartPoint(ListNode slowPtr) {
		ListNode temp = head;
		while (temp != slowPtr) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		return temp;
	}
	
	public void removeLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr= fastPtr.next.next;
			
		if (slowPtr == fastPtr) {
			remove(slowPtr);
			return;
		}
		}
	}
	public void remove(ListNode slowPtr) {
		ListNode temp = head;
		while (temp.next != slowPtr.next) {
			slowPtr = slowPtr.next;
			temp = temp.next;
		}
		slowPtr.next = null;
	}
	public void createLoop() {
		ListNode first = new ListNode(12);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(78);
		ListNode fourth = new ListNode(82);
		ListNode fifth = new ListNode(38);
		ListNode sixth = new ListNode(54);
		ListNode seventh = new ListNode(90);
		ListNode eigth = new ListNode(40);
		ListNode ninth = new ListNode(56);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eigth;
		eigth.next = ninth;
		ninth.next = fifth;
	}
	public static void main(String[] args) {
		_04LoopDectect_Remove_FindStartingPoint loop = new _04LoopDectect_Remove_FindStartingPoint();
		loop.createLoop();
		System.out.println(loop.containLoop());
		
		System.out.println(loop.findStartingPointLoop().data);
		loop.removeLoop();
		loop.print();
		System.out.println();
		System.out.println(loop.containLoop());
	}
}
