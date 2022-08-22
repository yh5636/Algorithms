package programmers.Level2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] numbers = { 6, 10, 2 };
		int[] numbers = {3, 30, 34, 5, 9};

		String answer = "";

		String[] rst = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			rst[i] = Integer.toString(numbers[i]);
		}

		// Comparator 활용 문자 비교
		Arrays.sort(rst, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}
		});

		for (String arr : rst) {
			answer += arr;
		}

		if (rst[0].equals("0")) {
			answer = "0";
		}

		System.out.println(answer);
//		return answer;
	}

}
