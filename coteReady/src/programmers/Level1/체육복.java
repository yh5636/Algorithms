package programmers.Level1;

import java.util.HashMap;

public class 체육복 {

	public static void main(String[] args) {

		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {3};
		
		int answer = 0;
        answer = n - lost.length - reserve.length; //여벌이 없는 학생수
        HashMap<Integer, Boolean> hm = new HashMap<>(); //체육복 있는 번호
        
        for(int i=0; i<reserve.length; i++){
            hm.put(reserve[i], true);
            int a = 0; int b = 0;
            if(i==0) {
            	a = reserve[i] +1;
            }else if(i==reserve.length-1) {
            	b = reserve[i] -1;
            }else {
            	a = reserve[i] +1;
            	b = reserve[i] -1;
            }

            for(int j=0; j<lost.length; j++){
                if(a ==0 || hm.getOrDefault(a, false)){
                    if(b == 0 || hm.getOrDefault(b, false)){
                        continue;
                    }else{
                      hm.put(b, true);
                    }
                }else{
                    hm.put(a, true);
                }
            }
        }
        
        
        
//        return answer;

	}

}
