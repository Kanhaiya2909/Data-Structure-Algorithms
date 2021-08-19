package _03Stack;

import java.util.Stack;

public class _05NextGreaterElement {
	public static void nextGeatestNumber(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i =0; i< arr.length; i++) {
			if (stack.isEmpty()) {
				stack.push(arr[i]);
			}else {
			while (stack.peek() < arr[i] && !stack.isEmpty()) {
				System.out.println("next greatest element of "+ stack.peek()+ " is "+ arr[i]);
				stack.pop();
			  	}
			stack.push(arr[i]);
			
			
			}
			
		}
		while ( !stack.isEmpty()) {
			System.out.println("next greatest element of "+ stack.peek()+ " is "+ null);
			stack.pop();
	}
	}
	public static void main(String[] args) {
		
		int arr[] = {7,4,6,0,8,9};
		nextGeatestNumber(arr);
	}

}
