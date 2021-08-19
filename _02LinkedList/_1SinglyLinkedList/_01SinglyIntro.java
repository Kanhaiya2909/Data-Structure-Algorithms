package _02LinkedList._1SinglyLinkedList;

public class _01SinglyIntro {

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
	public static void main(String[] args) {
		_01SinglyIntro sll = new _01SinglyIntro();
		sll.head = new ListNode(78);
		ListNode second = new ListNode(45);
		ListNode third = new ListNode(89);
		ListNode fourth = new ListNode(5);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display();
		System.out.println("Length is : "+sll.length());
	}
	
}
