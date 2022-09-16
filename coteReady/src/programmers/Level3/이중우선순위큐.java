package programmers.Level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 이중우선순위큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
//		String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		
		int [] answer = {0,0};
		
		//오름차순
		PriorityQueue<Integer> pqSort = new PriorityQueue<>();
		//내림차순
		PriorityQueue<Integer> pqSortReverse = new PriorityQueue<>(Collections.reverseOrder());
		String[] sArr = new String[2];
		
		for(int i=0; i<operations.length; i++) {
			sArr = operations[i].split(" ");
			if(sArr[0].equals("I")) {
				pqSort.add(Integer.parseInt(sArr[1]));
				pqSortReverse.add(Integer.parseInt(sArr[1]));
			}else if(sArr[0].equals("D") && (pqSort.size()>0)) {
				//최솟값
				if(sArr[1].equals("-1")) {
					int min = pqSort.poll();
					pqSortReverse.remove(min);
				}else {
				//최댓값
					int max = pqSortReverse.poll();
					pqSort.remove(max);
				}
			}
		}
		if(!pqSort.isEmpty()) {
			answer[0] = pqSortReverse.poll();
			answer[1] = pqSort.poll();
		}
		System.out.println(answer);
	}

}
