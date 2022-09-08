package programmers.Level2;

public class 다음큰숫자_2 {

	public static void main(String[] args) {
		// Integer.toBinaryString(n) - n을 2진수 변환;
		// Integer.bitCount() - 입력된 정수를 2진수로 변환한 뒤, 2진수에 포함된 1을 카운팅 해주는 메소드

//		int n = 15; // 23
		int n = 78; // 83
		
		
		int answer = 0;
		int cnt1 = Integer.bitCount(n);
		int cnt2;

		for (int i = n + 1; i < 1000000; i++) {
			cnt2 = Integer.bitCount(i);
			if (cnt1 == cnt2) {
				answer = i;
				break;
			}
		}
//	        return answer;
		System.out.println(answer);
	}

}
