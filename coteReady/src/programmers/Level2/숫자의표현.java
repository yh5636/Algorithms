package programmers.Level2;

public class 숫자의표현 {

	public static void main(String[] args) {
		int n = 15;

		int answer = 0;

		if (n == 1)
			System.out.println(1);

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = i; j <= n; j++) {
				sum += j;
				if (sum == n) {
					answer++;
					break;
				} else if (sum > n) {
					break;
				}
			}
		}
//	        return answer;
		System.out.println(answer);

	}

}
