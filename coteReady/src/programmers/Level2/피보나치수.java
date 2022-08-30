package programmers.Level2;

public class 피보나치수 {
	public static void main(String[] args) {

//		int n = 3;

		int answer = 0;

		int a = 0;
		int b = 1;

		if (n == 1 || n == 0) {
//            return 1;
			System.out.println(1);
		}

		for (int i = 2; i <= n; i++) {
			answer = (a + b) % 1234567;
			a = b;
			b = answer;
		}
		System.out.println(answer);
//        return answer;
	}

}
