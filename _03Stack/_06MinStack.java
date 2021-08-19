package _03Stack;

import java.util.Stack;

public class _06MinStack {

  private Stack<Integer> st = new Stack<>();
  private Stack<Integer> minSt = new Stack<>();


  public void push(int data) {

     int min = data;

     if(!minSt.isEmpty() && min > minSt.peek()) {
         min = minSt.peek();
     }
     
     st.push(data);
     minSt.push(min);
  }

  public void pop() {

     st.pop();
     minSt.pop();
  }

  public int top() {
    return st.peek();
  }

  public int getMin() {
     return minSt.peek();
  }


  public static void main(String[] args) {

	  _06MinStack minElem = new _06MinStack();

      minElem.push(4);
      minElem.push(5);
      minElem.push(8);
      minElem.push(1);

//      minElem.pop();

      System.out.println(" Minimum Element from Stack " + minElem.getMin());
  }
}
