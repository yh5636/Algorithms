package 벡준.단계별.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 소트인사이드 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        String [] sArr = num.split("");
        Arrays.sort(sArr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<sArr.length; i++) {
        	sb.append(sArr[i]);
        }
        System.out.println(sb.toString());

	}
}
