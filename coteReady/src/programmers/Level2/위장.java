package programmers.Level2;

import java.util.HashMap;

public class 위장 {

	public static void main(String[] args) {
		int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();

        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};	//return 5
        
        for(int i=0; i<clothes.length; i++){
            // System.out.println(clothes[i][1]);
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0)+1);
        }
         
        for(String key : hm.keySet()){
            answer *= (hm.get(key)+1);
        }
        
//        return answer-1;
        System.out.println(answer);
	}

}
