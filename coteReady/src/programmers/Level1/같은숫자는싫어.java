package programmers.Level1;

import java.util.ArrayList;
import java.util.Stack;

public class 같은숫자는싫어 {

	public static void main(String[] args) {

//		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] arr = { 4, 4, 4, 3, 3 };

		ArrayList<Integer> iArr = new ArrayList<>();

		iArr.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != arr[i]) {
				iArr.add(arr[i]);
			}
		}

		int[] answer = new int[iArr.size()];
		for (int i = 0; i < iArr.size(); i++) {
			answer[i] = iArr.get(i);
		}

		System.out.println(answer);
//	        return answer;

	}

}
