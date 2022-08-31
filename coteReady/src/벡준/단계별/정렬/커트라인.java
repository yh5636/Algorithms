package 벡준.단계별.정렬;

import java.util.*;
import java.io.*;

public class 커트라인 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sArr = br.readLine().split(" ");
        String[] scoreArr = br.readLine().split(" ");

        int n = Integer.parseInt(sArr[0]);
        int k = Integer.parseInt(sArr[1]);
        
        int[] score = new int[n];
        br.close();
        score[0] = Integer.parseInt(scoreArr[0]);
        for(int i=1; i<n; i++){
            score[i] = Integer.parseInt(scoreArr[i]);
            
        }
        Arrays.sort(score);
        
        System.out.println(score[n-k]);
        
        HashMap<Integer, Boolean> usedMap = new HashMap<>();  //여벌 빌린 사람
        
		
	}
}