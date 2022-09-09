package programmers.Level2;

public class 멀리뛰기 {

	public static void main(String[] args) {
		int n = 3;
		long answer = 0;

		long a = 1;
		long b = 2;

		if (n < 3)
			return n;
		for (int i = 3; i <= n; i++) {
			answer = (a + b) % 1234567;
			a = b;
			b = answer;
		}

		return answer;

	}
}
