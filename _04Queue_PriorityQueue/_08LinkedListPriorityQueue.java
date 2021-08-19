package _04Queue_PriorityQueue;

public class _08LinkedListPriorityQueue {
	static class ListNode {
		int data;
		int priority;
		ListNode next;
	}

	static ListNode ListNode = new ListNode();
	static ListNode newListNode(int d, int p){
		ListNode temp = new ListNode();
		temp.data = d;
		temp.priority = p;
		temp.next = null;
		
		return temp;
	}
	static int peek(ListNode head){
		return (head).data;
	}
	static ListNode pop(ListNode head){
		ListNode temp = head;
		(head) = (head).next;
		return head;
	}
	static ListNode push(ListNode head, int d, int p){
		ListNode start = (head);
		ListNode temp = newListNode(d, p);
		if ((head).priority > p) {
			temp.next = head;
			(head) = temp;
		}
		else {
			while (start.next != null &&
				start.next.priority < p) {
				start = start.next;
			}
			temp.next = start.next;
			start.next = temp;
		}
		return head;
	}
	static int isEmpty(ListNode head){
		return ((head) == null)?1:0;
	}
	public static void main(String args[]){
		ListNode pq = newListNode(4, 1);
		pq =push(pq, 5, 2);
		pq =push(pq, 6, 3);
		pq =push(pq, 7, 0);
		
		while (isEmpty(pq)==0) {
			System.out.printf("%d ", peek(pq));
			pq=pop(pq);
		}
		
	}
	}

