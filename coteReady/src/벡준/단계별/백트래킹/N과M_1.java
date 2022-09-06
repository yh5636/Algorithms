package 벡준.단계별.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N과M_1 {

	// 조건에 부합하는 수열담을 배열
	public static int[] iArr;
	// 해당 숫자 방문여부
	public static boolean[] visit;
	// 결과값 출력
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sArr = br.readLine().split(" ");
		int n = Integer.parseInt(sArr[0]);
		int m = Integer.parseInt(sArr[1]);

		iArr = new int[m];
		visit = new boolean[n];
		dfs(n, m, 0);

	}

	// 숫자갯수(n), 고를 숫자(m), 자리수(depth)
	public static void dfs(int n, int m, int depth) {
		if (depth == m) {
			for (int val : iArr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 0; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				iArr[depth] = i + 1;
				dfs(n, m, depth + 1);
				visit[i] = false;
			}
		}
	}

}
