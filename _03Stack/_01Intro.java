package _03Stack;

public class _01Intro {

	private ListNode top;
	private int length;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public _01Intro() {
		top = null;
		length = 0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;
	}
	public int pop() {
		if (isEmpty()) {
			throw new IllegalArgumentException("stack is empty");
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}
		
	public int peek() {
		if (isEmpty()) {
			throw new IllegalArgumentException("Stack is empty");
		}
		return top.data;
	}
	
	public static void main(String[] args) {
		_01Intro stack = new _01Intro();
		stack.push(34);
		stack.push(94);
		stack.push(89);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}
	
}
