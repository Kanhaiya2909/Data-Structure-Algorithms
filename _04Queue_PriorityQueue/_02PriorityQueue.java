package _04Queue_PriorityQueue;
import java.util.*;

public class _02PriorityQueue {
	
		public static void main(String args[]){
			PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
			pQueue.add(10);
			pQueue.add(20);
			pQueue.add(15);
			System.out.println(pQueue.peek());
			System.out.println(pQueue.poll());
			System.out.println(pQueue.peek());
			System.out.println(pQueue.poll());
			System.out.println(pQueue.peek());
		
	}

}
