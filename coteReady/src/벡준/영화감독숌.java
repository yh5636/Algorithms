package 벡준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영화감독숌 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        
        int num = 666;
        int cnt = 1;
        
        while(cnt != i){
            num++;
            if(String.valueOf(num).contains("666")){
               cnt++;
            }
        }
        System.out.println(num);
	}
	
}
