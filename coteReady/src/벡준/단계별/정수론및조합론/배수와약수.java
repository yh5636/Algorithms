package 벡준.단계별.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 배수와약수 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sArr;
        String str;
        while((str = br.readLine()) != null)
        {
            sArr = str.split(" ");
            int a = Integer.parseInt(sArr[0]);
            int b = Integer.parseInt(sArr[1]);
//            if(a==0) break;
            if(b%a == 0){
                System.out.println("factor");
            }else if(a%b == 0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }
    
    }

}
