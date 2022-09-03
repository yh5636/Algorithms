package 벡준.단계별.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class 최대공약수와최소공배수 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sArr = br.readLine().split(" ");
        int a = Integer.parseInt(sArr[0]);
        int b = Integer.parseInt(sArr[1]);
        int gcd = gcd(Math.max(a,b), Math.min(a,b));
        System.out.println(gcd);
        int lcm = lcm(Math.max(a,b), Math.min(a,b), gcd);
        System.out.println(lcm);
    }
    
    //최대공약수 - 재귀
    static int gcd(int a, int b){
        if(b==0) return a;
         return gcd(b, a%b);
    }
    //최소공배수 - 두수의 곱 / 최대공약수
    static int lcm(int a, int b, int gcd){
        return a*b / gcd;
    }
}