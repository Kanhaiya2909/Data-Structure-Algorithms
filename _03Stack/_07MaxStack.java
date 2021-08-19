package _03Stack;

import java.util.Stack;

public class _07MaxStack {


	  private Stack<Integer> st = new Stack<>();
	  private Stack<Integer> maxSt = new Stack<>();


	  public void push(int data) {

	     int max = data;

	     if(!maxSt.isEmpty() && max < maxSt.peek()) {
	    	 max = maxSt.peek();
	     }
	     
	     st.push(data);
	     maxSt.push(max);
	  }

	  public void pop() {

	     st.pop();
	     maxSt.pop();
	  }

	  public int top() {
	    return st.peek();
	  }

	  public int getMax() {
	     return maxSt.peek();
	  }


	  public static void main(String[] args) {

		  _07MaxStack maxElem = new _07MaxStack();

	      maxElem.push(4);
	      maxElem.push(5);
	      maxElem.push(8);
	      maxElem.push(1);

//	      maxElem.pop();

	      System.out.println(" Maximum Element from Stack " + maxElem.getMax());
	  }
}
