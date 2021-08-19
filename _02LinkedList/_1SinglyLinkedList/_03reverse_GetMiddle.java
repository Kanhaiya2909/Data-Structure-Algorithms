package _02LinkedList._1SinglyLinkedList;


public class _03reverse_GetMiddle {

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
	public ListNode reverse() {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
		return head;
	}
	public ListNode getMiddleNode() {
		if (head == null) {
			return null;
		}
			ListNode slowPtr = head;
			ListNode fastPtr = head;
			while (fastPtr != null && fastPtr.next != null) {
				slowPtr = slowPtr.next;
				fastPtr = fastPtr.next.next;
			}
			return slowPtr;
	
	}
	public ListNode getNthNodeFromEnd(int n){
		if (head == null) {
			return null;
		}
		if (n <=0) {
			throw new IllegalArgumentException("Invalid value of n : "+ n);
		}
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		while(count < n){
			if(refPtr == null) {
				throw new IllegalArgumentException(n+ " given number of n is greater then length");
			}
			refPtr = refPtr.next;
			count++;
		}
		while (refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}
	public static void main(String[] args) {
		_03reverse_GetMiddle sll = new _03reverse_GetMiddle();
		sll.head = new ListNode(78);
		ListNode second = new ListNode(45);
		ListNode third = new ListNode(89);
		ListNode fourth = new ListNode(5);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display();
		System.out.println("Length is : "+sll.length());
		
		sll.reverse();
		sll.display();
		
		System.out.println("Middle node is : "+sll.getMiddleNode().data);
		
		System.out.println("n node from end..."+sll.getNthNodeFromEnd(3).data);
	}
	
}

