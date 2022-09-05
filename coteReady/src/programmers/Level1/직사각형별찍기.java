package programmers.Level1;

import java.util.*;

/*
 * 
	입력
	
	5 3
	출력
	
	*****
	*****
	*****
**/


public class 직사각형별찍기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // 가로
		int b = sc.nextInt(); // 세로
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				sb.append("*");
			}
			sb = sb.append("\n");
		}

		System.out.println(sb);

	}
}
