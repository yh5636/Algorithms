package programmers.Level1;

/*
입출력 예
nums	result
[1,2,3,4]	1
[1,2,7,6,4]	4
*/
public class 소수만들기 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };

		int answer = 0;
		boolean check = false;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int num = nums[i] + nums[j] + nums[k];
					if (num >= 2) {
						// 소수찾기 함수 호출 불러서 소수가 맞으면 카운트
						check = sosuF(num);
						if (check == true) {
							answer++;
						}
					}
				}
			}
		}
		System.out.println(answer);
//		        return answer;
	}

	static boolean sosuF(int num) {
		boolean rst = true;

		if (num == 2) {
			return rst;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					rst = false;
					break;
				}
			}
		}
		return rst;
	}
}
