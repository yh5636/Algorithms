package programmers.Level1;

public class 이상한문자만들기 {

	public static void main(String[] args) {

		String s = "try  hello  world";

//		String answer = "";
		String[] str = s.split("");
		int idx = 0;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(" ")) {
				sb.append(" ");
				idx = 0;
			} else if (idx % 2 == 0) {
				sb.append(str[i].toUpperCase());
				idx++;
			} else {
				sb.append(str[i].toLowerCase());
				idx++;
			}
		}

		System.out.println(sb.toString());
//	        answer = sb.toString();
//	        return answer;
	}

}
