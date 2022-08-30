package programmers.Level2;

public class N개의최소공배수 {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 8, 14 };
		int answer = arr[0];

		// 최대공배수 = 두수의 곱 /최대공약수
		for (int i = 1; i < arr.length; i++) {
			int gcd = gcd(answer, arr[i]);
			answer = (answer * arr[i]) / gcd;
		}
		System.out.println(answer);
//	        return answer;
	}

	static int gcd(int a, int b) {
		int x = Math.max(a, b);
		int y = Math.min(a, b);

		while (x % y != 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		return y;
	}

}
