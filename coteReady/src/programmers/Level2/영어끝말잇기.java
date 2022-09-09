package programmers.Level2;

import java.util.HashSet;

public class 영어끝말잇기 {

	public static void main(String[] args) {

		int n = 3;
		String[] words = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
//		String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
//		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};

		int[] answer = new int[2];
		HashSet<String> hs = new HashSet<>();
		hs.add(words[0]);
		int i;

		for (i = 1; i < words.length; i++) {
			if (words[i].length() == 1)
				break;
			if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0))
				break;
			if (hs.contains(words[i]))
				break;
			hs.add(words[i]);
		}

		answer[0] = ((i + 1) % n == 0) ? n : (i + 1) % n;
		answer[1] = (int) Math.ceil((double) (i + 1) / n);
		if (i == words.length) {
			answer[0] = 0;
			answer[1] = 0;
		}
		System.out.println(answer[0] + "," + answer[1]);
//		return answer;
	}
}
