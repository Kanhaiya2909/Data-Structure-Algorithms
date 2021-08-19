package _03Stack;
import java.util.Stack;


public class _08ReverseStackRecursion {
		static Stack<Integer> st = new Stack<>();
		public static void insert_at_bottom(int x){
			if(st.isEmpty())
				st.push(x);
			else{
				Integer a = st.peek();
				st.pop();
				insert_at_bottom(x);
				st.push(a);
			}
		}
		static void reverse(){
			if(st.size() > 0){
				int x = st.peek();
				st.pop();
				reverse();
				insert_at_bottom(x);
			}
		}
		public static void main(String[] args){
			st.push(9);
			st.push(7);
			st.push(6);
			st.push(5);
			System.out.println("Original Stack");
			
			System.out.println(st);
			reverse();
			
			System.out.println("Reversed Stack");
			
			System.out.println(st);
		}
	

}
