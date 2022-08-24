package programmers.Level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {

	public static void main(String[] args) {
//		int[] progresses = {93, 30, 55};
		int[] progresses = { 95, 90, 99, 99, 80, 70 };
//		int[] speeds = {1, 30, 5};
		int[] speeds = { 1, 1, 1, 1, 1, 1 };

		ArrayList<Integer> arrList = new ArrayList<>();
		Queue<Integer> rst = new LinkedList<>();
		int cnt = 1; // 배포갯수
		double day;
		
		// 소요일수 계산하면서 cnt
		for (int i = 0; i < progresses.length; i++) {
			day = Math.ceil((100 - (double) progresses[i]) / (double) speeds[i]);

			if (rst.isEmpty()) {
				rst.add((int) day);
			} else {
				if (rst.peek() >= day) {
					cnt++;
				} else {
					arrList.add(cnt);
					rst.add((int) day);
					rst.remove();
					cnt = 1;
				}
			}
		}
		
		//마지막 요소 처리
		if (cnt > 1) {
			arrList.add(cnt);
		} else {
			arrList.add(1);
		}

		int[] answer = new int[arrList.size()];
		for (int i = 0; i < arrList.size(); i++) {
			answer[i] = arrList.get(i);
		}
		System.out.println(answer);
//        return answer;
	}
}
