package programmers.Level1;

public class 비밀지도 {

	public static void main(String[] args) {
		
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 1};
		int[] arr2 = {30, 1, 21, 17, 28};
		
        String[] answer = new String[n];
        String a;
        String b;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
            a= String.format("%"+n+"s", Integer.toBinaryString(arr1[i]));
            b= String.format("%"+n+"s", Integer.toBinaryString(arr2[i]));
            
            for(int j=0; j<n; j++) {
            	if(a.charAt(j) == '1'|| b.charAt(j) == '1'){
            		sb.append("#");
            	}else {
            		sb.append(" ");
            	}
            }
            answer[i] = sb.toString();
            sb.setLength(0);
        }
        
//        return answer;

	}

}
