package programmers.Level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 괄호회전하기 {

	public static void main(String[] args) {

		String s = "[](){}";
//		String s = "}]()[{";
		
		int cnt = 0;

		if (s.length() % 2 == 1) {
			System.out.println(0);
		}

		// 왼쪽으로 회전용
		Queue<Character> sq = new LinkedList<>();
		// 괄호 비교용
		Stack<Character> st = new Stack<>();
		char[] cArr = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			sq.add(s.charAt(i));
		}

		for (int i = 0; i < sq.size(); i++) {
			int j = 0;
			for (j = 0; j < cArr.length; j++) {
				if (cArr[j] == '[' || cArr[j] == '{' || cArr[j] == '(') {
					st.add(cArr[j]);
				} else {
					if (cArr[j] == ']') {
						if (st.isEmpty() || st.pop() != '[') {
							break;
						}
					} else if (cArr[j] == '}') {
						if (st.isEmpty() || st.pop() != '{') {
							break;
						}
					} else if (cArr[j] == ')') {
						if (st.isEmpty() || st.pop() != '(') {
							break;
						}
					}
				}
			}
			if (st.isEmpty() && j == cArr.length) {
//				if (cArr[j] != ']' || cArr[j] != '}' || cArr[j] != ')') {
					cnt++;
//				}
			}

			StringBuilder sb = new StringBuilder();
			for (int k = 1; k < cArr.length; k++) {
				sb.append(cArr[k]);
			}
			cArr = sb.append(cArr[0]).toString().toCharArray();
			sb.setLength(0);
		}
		System.out.println(cnt);
	}

}
