package programmers.Level2;

import java.util.Arrays;

public class 최고의집합 {

	public static void main(String[] args) {

		int n = 4;
		int s = 15;
		int[] answer;

		if (n > s) {
			/*
			 * 시간초과 걸림 
			 * answer = new int[1]; answer[0] = -1;
			 */
			
			//수정
			return new int[] { -1 };
		}

		int a = s / n;
		int b = s % n;

		answer = new int[n];
		Arrays.fill(answer, a);

		for (int i = 0; i < b; i++) {
			answer[i] += 1;
		}
		
		Arrays.sort(answer);

		return answer;
	}

}
