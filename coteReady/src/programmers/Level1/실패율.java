package programmers.Level1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 실패율 {

	public static void main(String[] args) {
		
//		int N = 5;
		int N = 4;
//		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] stages = {4,4,4,4,4};
		
		
        Double nCnt;
        Double sCnt;
        //스테이지번호 : 실패율
        HashMap<Integer, Double> hm = new HashMap<>();
        
        for(int i=0; i<N; i++){
            nCnt = 0.0;
            sCnt = 0.0;
            for(int j=0; j<stages.length; j++){
                if(stages[j] == i+1){
                    nCnt++;
                }
                if(stages[j] >= i+1){
                    sCnt++;
                }
            }
            hm.put(i+1, (nCnt ==0) ? 0 : nCnt/sCnt );
        // System.out.println(nCnt +"," +sCnt);
        }
        
        //HashMap value값 기준 정렬
        //Map -> List 변환
        List<Map.Entry<Integer, Double>> entryList = new LinkedList<Map.Entry<Integer,Double>>(hm.entrySet());
        
        //내림차순
        entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        //오름차순
//        entryList.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        int[] answer = new int[entryList.size()];
        
        for(int i=0; i<entryList.size(); i++) {
        	//key값 뽑기
        	answer[i] = entryList.get(i).getKey();
        }
//        return answer;
	}

}
