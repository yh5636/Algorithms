package exercises;

// StrSymmetryPoint
// 정확성 - 87% / 효율성 - 50%
// --> "abba", "abc" 의 경우 -1이 나와야 함.
public class AlgorithmicSkills_2 {

	public static void main(String[] args) {

		String S = "abc";
		char[] sArray = S.toCharArray();
		int checkLength = 0;
		if (sArray.length == 1) {
			checkLength = sArray.length;
		} else {
			checkLength = sArray.length / 2;
		}
		int idx = -1;

		if (sArray.length == 1) {
			idx = 0;
		} else {

			for (int i = 0; i < checkLength; i++) {

				System.out.println("sArray[" + i + "] : " + sArray[i]);
				System.out.println(sArray[sArray.length - 1 - i]);

				if (sArray[i] != sArray[sArray.length - 1 - i]) {
					if (i == 0) {
						break;
					} else {
						idx = i;
					}
				}else {
					if(sArray.length % 2 > 0) {
						idx = i + 1;
					}else if(sArray.length % 2 == 0) {
						break;
					}
				}
			}
		}
		System.out.println("idx : " + idx);
		// return idx;
	}

}
