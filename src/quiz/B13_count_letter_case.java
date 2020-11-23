package quiz;

public class B13_count_letter_case {
	public static void main(String[] args) {
		// ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
		// �ش� ���忡 � ���ڰ� �� �� �����ߴ��� ��� ����غ��ÿ�.
		// (�빮��, �ҹ���, ���ڸ� ����˴ϴ�.)
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

				System.out.printf("%c�� ������ Ƚ���� %d���Դϴ�.\n", 
						i + 'A', count_u[i]);
			}
		}

		for (int i = 0; i < count_l.length; i++) {
			if (count_l[i] > 0) {
				System.out.printf("%c�� ������ Ƚ���� %d���Դϴ�.\n", 
						i + 'a', count_l[i]);
			}
		}

		for (int i = 0; i < count_n.length; i++) {
			if (count_n[i] > 0) {
				System.out.printf("%c�� ������ Ƚ���� %d���Դϴ�.\n", 
						i + '0', count_n[i]);
			}
		}

	}

}
