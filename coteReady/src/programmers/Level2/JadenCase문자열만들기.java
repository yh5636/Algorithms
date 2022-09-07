package programmers.Level2;

public class JadenCase문자열만들기 {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		
		String[] sArr = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        
        for(String str : sArr){
            sb.append(isFirst ? str.toUpperCase() : str);
            isFirst = str.equals(" ") ? true : false;
            System.out.println(sb.toString());
        }
    
//    return sb.toString();
        System.out.println(sb.toString());

	}

}
