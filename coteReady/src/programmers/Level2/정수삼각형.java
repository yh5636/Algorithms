package programmers.Level2;

public class 정수삼각형 {

	public static void main(String[] args) {
		
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		
        int dp[][] = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];
        
        for(int i=1; i<triangle.length; i++){
            dp[i][0] = triangle[i][0] + dp[i-1][0];
            //1층 1개, 2층 2개, 3층 3개, 시작점은 (0,0)
            for(int j=1; j<i+1; j++){
                dp[i][j] = triangle[i][j] + Math.max(dp[i-1][j-1], dp[i-1][j]);
            }            
        }
        
        int max = 0;
        
        for(int i=0; i<dp[dp.length-1].length; i++){
            max = Math.max(dp[dp.length-1][i], max);
        }
        
        System.out.println(max);
//        return max;
	}

}
