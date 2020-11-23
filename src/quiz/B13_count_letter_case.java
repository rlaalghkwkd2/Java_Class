package quiz;

public class B13_count_letter_case {
	public static void main(String[] args) {
		// 사용자로부터 문장을 하나 입력받았다 치고
		// 해당 문장에 어떤 문자가 몇 번 등장했는지 세어서 출력해보시오.
		// (대문자, 소문자, 숫자만 집계됩니다.)
		String user = "ABCabc132";
		int[] count_u = new int[26];
		int[] count_l = new int[26];
		int[] count_n = new int[10];

		for (int i = 0; i < user.length(); i++) {

			char ch = user.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				count_u[ch - 'A'] += 1;
			}

			else if (ch >= 'a' && ch <= 'z') {
				count_l[ch - 'a'] += 1;
			}

			else if (ch >= '0' && ch <= '9') {
				count_n[ch - '0'] += 1;
			}
		}

		for (int i = 0; i < count_u.length; i++) {
			if (count_u[i] > 0) {

				System.out.printf("%c가 등장한 횟수는 %d번입니다.\n", 
						i + 'A', count_u[i]);
			}
		}

		for (int i = 0; i < count_l.length; i++) {
			if (count_l[i] > 0) {
				System.out.printf("%c가 등장한 횟수는 %d번입니다.\n", 
						i + 'a', count_l[i]);
			}
		}

		for (int i = 0; i < count_n.length; i++) {
			if (count_n[i] > 0) {
				System.out.printf("%c가 등장한 횟수는 %d번입니다.\n", 
						i + '0', count_n[i]);
			}
		}

	}

}
