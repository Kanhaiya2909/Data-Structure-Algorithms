package _04Queue_PriorityQueue;

import java.util.*;

public class _04RemoveElemPriorityQueue {

		public static void main(String args[]){
			PriorityQueue<String> pq = new PriorityQueue<>();

			pq.add("Java");
			pq.add("is");
			pq.add("Language");

			System.out.println("Initial PriorityQueue " + pq);

			// using the method
			pq.remove("Java");

			System.out.println("After Remove - " + pq);

			System.out.println("Poll Method - " + pq.poll());

			System.out.println("Final PriorityQueue - " + pq);
		}
	}

