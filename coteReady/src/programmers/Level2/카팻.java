package programmers.Level2;

public class 카팻 {

	public static void main(String[] args) {

		int brown = 24;
		int yellow = 24;

		int[] answer = new int[2];

		int sum = brown + yellow;
		
		//yellow가 가운데 위치하려면 가로, 세로로 둘다 3이상 (가로 >= 세로)
		
		//약수구하기
		for(int i=3; i<sum; i++) {
			int j = sum/i;
			if(sum % i ==0 && j >= 3) {
				int v = Math.max(i, j);
				int h = Math.min(i, j);				
				int c = (v-2) * (h-2);
				
				//yellow 갯수 체크
				if(c == yellow) {
					answer[0] = v;
					answer[1] = h;
					break;
				}
			
			}
			
		}
		System.out.println(answer[0] + "," + answer[1]);
//		return answer;
		
	}

}
