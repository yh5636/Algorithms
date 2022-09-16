package programmers.Level1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순배치 {

	public static void main(String[] args) {
		
		long n = 118372;
//        long answer = 0;
        String s = Long.toString(n);
        String[] sArr = s.split("");
        
        Arrays.sort(sArr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<sArr.length; i++) {
        	sb.append(sArr[i]);
        }
        
        System.out.println(Long.parseLong(sb.toString()));
        
//        return answer;
	}

}
