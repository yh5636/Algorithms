package programmers.Level1;

/*
입출력 예
numbers				target	return
[1, 1, 1, 1, 1]		  3		  5
[4, 1, 2, 1]		  4		  2
*/
public class 타겟넘버_dfs {

	static int answer = 0;

	public static void main(String[] args) {

		int[] numbers = { 4, 1, 2, 1 };
		int target = 4;

		dfs(numbers, 0, target, 0);

		System.out.println(answer);

	}

	static void dfs(int[] numbers, int depth, int target, int sum) {
		// numbers : 대상 배열
		// depth : 노드 깊이
		// target : 대상 배열 값으로 더하거나 빼서 만들어야 할 수(타켓넘버)
		// sum : 이전 노드 까지의 결과 값
		if (depth == numbers.length) { // 마지막 노드까지 탐색한 경우
			if (target == sum)
				answer++;
		} else { // 탐색할 노드가 남아있는 경우
			dfs(numbers, depth + 1, target, sum + numbers[depth]);
			dfs(numbers, depth + 1, target, sum - numbers[depth]);
		}
	}

}
