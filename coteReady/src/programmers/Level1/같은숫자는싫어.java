package programmers.Level1;

import java.util.Stack;

public class 같은숫자는싫어 {

	public static void main(String[] args) {

//		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] arr = {4, 4, 4, 3, 3};
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<arr.length;i++) {
			if(st.isEmpty()) {
				st.push(arr[i]);
			}else if(st.peek()!=arr[i]) {
				st.push(arr[i]);
			};
		}
		
		for(int i=0; i<st.size(); i++) {
			
		}
		
		
		System.out.println(st);
		
	}

}
