package programmers.Level3;

import java.util.Collections;
import java.util.PriorityQueue;

public class 야근지수 {

	public static void main(String[] args) {
//		int n = 4;
//		int n = 1;
		int n = 3;
//		int[] works = {4, 3, 3};
//		int[] works = {2,1,2};		
		int[] works = {1,1};		
		
		long answer = 0;
		//우선순위 큐 내림차순정렬
		PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i : works) {
			pq.add(i);
		}
		
		for(int i=0; i<n; i++) {
			int max = pq.poll();
			if(max == 0) break;	// 제일 큰 값이 0이면 나머지는 다 0이기 때문
			pq.offer(max-1);	// 1 작업 빼기
		}
		
		while(!pq.isEmpty()) {
			answer += Math.pow(pq.poll(), 2);
		}
		System.out.println(answer);
//		return answer;
	}

}

	