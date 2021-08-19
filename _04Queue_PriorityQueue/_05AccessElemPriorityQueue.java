package _04Queue_PriorityQueue;
import java.util.*;

public class _05AccessElemPriorityQueue {
		public static void main(String[] args){
			PriorityQueue<String> pq = new PriorityQueue<>();
			pq.add("Java");
			pq.add("is");
			pq.add("Language");
			System.out.println("PriorityQueue: " + pq);
			String element = pq.peek();
			System.out.println("Accessed Element: " + element);
		}
	}

