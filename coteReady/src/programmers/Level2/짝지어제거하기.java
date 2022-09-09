package programmers.Level2;

import java.util.Stack;

public class 짝지어제거하기 {

	public static void main(String[] args) {

//		String s = "baabaa";
		String s = "cdcd";
		Stack<String> st = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			if(st.isEmpty()) {
				st.add(s.substring(i, i+1));
			}else {
				if(st.peek().equals(s.substring(i,i+1))) {
					st.pop();
				}else {
					st.add(s.substring(i, i+1));
				}
			}
		}
		if(st.isEmpty()) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
}
