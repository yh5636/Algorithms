package programmers.Level2;

public class 행렬의곱셈 {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
		int[][] arr2 = { { 3, 3 }, { 3, 3 } };

		int[][] answer = new int[arr1.length][arr2[0].length];
		int a = 1;
		int b = 1;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				for (int k = 0; k < arr1[0].length; k++) {
					answer[i][j] += arr1[i][k] * arr2[k][j];

					 System.out.println(arr1[i][k] + "," + arr2[k][j]);
				}
			}
		}

//		        return answer;
		System.out.println(answer);
	}

}
