package 벡준.단계별.문자열;

import java.util.*;
import java.io.*;

public class 그룹단어체커_1316 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int cnt = a;
       
        //나왔던 문자
        HashMap<String, String> hm = new HashMap<>();
        for(int i=0; i<a; i++){
            String s = br.readLine();
            String[] sArr = new String[s.length()];
            sArr = s.split("");

            hm.clear();
            hm.put(sArr[0], "T");
            for(int j=1; j<sArr.length; j++){
                if(!(sArr[j-1]).equals(sArr[j])){
                    if(hm.get(sArr[j]) != null){
                    	cnt--;
                    	hm.clear();
                        break;
                    }else {
                    	hm.put(sArr[j], "T");
                    }
                }
            }
        }
        System.out.print(cnt);
	}

}
