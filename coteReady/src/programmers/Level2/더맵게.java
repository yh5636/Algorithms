package programmers.Level2;

import java.util.PriorityQueue;

public class 더맵게 {

	public static void main(String[] args) {
		int[] scoville = {88,33,1, 9, 10, 12};
		int K = 7;
		 int answer = 0;
	        
	        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
	        
	        for(int i : scoville){
	            priorityQueueLowest.add(i);
	        }
	        
	        while(priorityQueueLowest.peek()<=K){
	        	
	        	//더이상 K 이상으로 만들 수 없을 때
	            if(priorityQueueLowest.size() ==1){
	            	System.out.println("-1");
//	                return -1;
	            }
	            int a = priorityQueueLowest.remove();
	            int b = priorityQueueLowest.remove();
	            
	            int rst = a + (b*2);
	            priorityQueueLowest.add(rst);
	            answer++;
	        }
	            
	        System.out.println(answer);
//	        return answer;

	}

}
