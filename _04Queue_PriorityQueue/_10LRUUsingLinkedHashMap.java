package _04Queue_PriorityQueue;

import java.util.*;
public class _10LRUUsingLinkedHashMap {

		Set<Integer> cache;
		int capacity;

		public _10LRUUsingLinkedHashMap(int capacity){
			this.cache = new LinkedHashSet<Integer>(capacity);
			this.capacity = capacity;
		}
		public boolean get(int key){
			if (!cache.contains(key))
				return false;
			cache.remove(key);
			cache.add(key);
			return true;
		}
		public void refer(int key){	
			if (get(key) == false)
			put(key);
		}
		public void display(){
		LinkedList<Integer> list = new LinkedList<>(cache);
		Iterator<Integer> itr = list.descendingIterator();
		
		while (itr.hasNext())
				System.out.print(itr.next() + " ");
		}
		
		public void put(int key)
		{
			
		if (cache.size() == capacity) {
				int firstKey = cache.iterator().next();
				cache.remove(firstKey);
			}

			cache.add(key);
		}
		
		public static void main(String[] args)
		{
			_10LRUUsingLinkedHashMap ca = new _10LRUUsingLinkedHashMap(4);
			ca.refer(1);
			ca.refer(2);
			ca.refer(3);
			ca.refer(1);
			ca.refer(4);
			ca.refer(5);
			ca.display();
		}
	}

