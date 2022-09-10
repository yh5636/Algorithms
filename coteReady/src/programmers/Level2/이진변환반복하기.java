package programmers.Level2;

public class 이진변환반복하기 {

	public static void main(String[] args) {

		String s = "110010101001";
//		String s = "01110";
		
		int[] answer = {0,0};
		
		while (!s.equals("1")) {
			int cntOne = 0;
			
			for (int i = 0; i < s.length(); i++) {
				
				if(s.charAt(i) == '0') {
					answer[1]++;
				}
				else {
					cntOne++;
				}
			}
			s = Integer.toBinaryString(cntOne);
			answer[0]++;
		}
	}
}
