package 벡준.단계별.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 덩치 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		// 몸무게-키
		int[][] whArr = new int[n][2];

		for (int i = 0; i < n; i++) {
			String[] sArr = br.readLine().split(" ");

			whArr[i][0] = Integer.parseInt(sArr[0]);
			whArr[i][1] = Integer.parseInt(sArr[1]);

		}

		for (int i = 0; i < n; i++) {
			int rank = 1;

			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				if (whArr[i][0] < whArr[j][0] && whArr[i][1] < whArr[j][1]) {
					rank++;
				}
			}
			System.out.print(rank+" ");
		}
	}
}
