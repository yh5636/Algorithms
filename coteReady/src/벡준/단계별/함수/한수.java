package 벡준.단계별.함수;

import java.io.*;
import java.util.*;

public class 한수 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = br.read();
		br.close();

		int rst = 0;

		// 1~99까지는 무조건 등차수열(두개의 수만 주어지니까)
		// 100이상의 수부터는 한자리씩 비교
		if (n < 100) {
			System.out.print(n);
		} else {
			int n1 = n / 100; // 첫번째 자리
			int n2 = (n % 100) / 10; // 두번째 자리
			int n3 = (n % 100) % 10; // 세번째 자리

			if (n1 - n2 == n2 - n3) {
				rst++;
			}
		}

		System.out.print(rst);
	}
}