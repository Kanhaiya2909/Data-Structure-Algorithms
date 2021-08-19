package _04Queue_PriorityQueue;

import java.util.*;

public class _06IteratingElemPriorityQueue {
		public static void main(String args[]){
			PriorityQueue<String> pq = new PriorityQueue<>();

			pq.add("Java");
			pq.add("is");
			pq.add("Language");

			Iterator<String> iterator = pq.iterator();

			while (iterator.hasNext()) {
				System.out.print(iterator.next() + "-");
			}
		}
	}

