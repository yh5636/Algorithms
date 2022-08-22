package programmers.Level1;

import java.util.Arrays;

public class K번째수 {

	public static void main(String[] args) {
		
//		int[] answer = {};
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];
		
		for(int x=0; x<commands.length; x++){
            int[] comArray = new int[3];
            comArray = commands[x];
            
            int i= comArray[0];
            int j= comArray[1];
            int k = comArray[2];
            
            System.out.println(i+":"+j+":"+k);
            
            //array i~j 바르기
            int[] spltArray = new int[j-i+1];
            for(int z=0; z<spltArray.length; z++){
                spltArray[z] = array[z+i-1];
                // System.out.println(z+ ":" +spltArray[z]);  
            }
            Arrays.sort(spltArray);
            answer[x] = spltArray[k-1];
             System.out.println(answer[x]);  
        }
//		return answer;
	}

}
