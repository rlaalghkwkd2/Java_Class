package quiz;

public class B13_count_letter {
	public static void main(String[] args) {

		// ����ڷκ��� ������ �ϳ� �Է¹ް�Ҵ� ġ��
		// �ش� ���忡 � ���ĺ��� ��� �����ߴ��� ��� ����غ��ÿ�.
		// ��ҹ��� ���� X

		// �ؼ�

		int[] count = new int[26];

		String msg = "The Quick Brown Fox Jumps Over a Lazy Dog";
		msg = msg.toLowerCase(); // �빮�ڷ� : Upper �ҹ��ڷ� : Lower
		for (int i = 0; i < msg.length(); i++) {

			char ch = msg.charAt(i);

			if (ch >= 'a' && ch <= 'z')
				count[ch - 'a'] += 1;
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) { // ������ �ֵ鸸
				System.out.printf("%c�� ������ Ƚ���� %d���Դϴ�.\n", 
						i + 'a', count[i]);
			}
		}

		
//			'a' - 'a' -> 0 -> count[0] += 1
//			'b' - 'a' -> 1 -> count[1] += 1
//			'c' - 'a' -> 2 -> count[2] += 1
//			
//			switch (ch) {
//			case 'a' :
//				count[0] += 1;
//				break;

//		String user = "Hello, world131253";
//		char[] ch = user.toCharArray();
//
//		int[] count = new int[65536];
//
//		for (int i = 0; i < ch.length; i++) {
//			for (int j = 0; j < ch.length; j++) {
//				
//				if (ch[i] >= 'A' && ch[i] <= 'Z'
//						|| ch[i] >= 'a' && ch[i] <= 'z') {
//					if (ch[i] == ch[j]) {
//						count[i]++;
//					}
//				} else if (ch[i] == ch[j]) {
//					count[i]++;
//				}
//			}
//			System.out.printf("%c : %d��\n", (char) (ch[i]), count[i]);
//		}

//	String user = "Helloworld";
//	char[] ch = user.toCharArray();
//	int[] count = new int[26];
//
//	for(
//	int i = 0;i<ch.length;i++)
//	{
//		for (int j = 0; j < ch.length; j++) {
//			if (ch[j] >= 'A' && ch[j] <= 'Z')
//				ch[j] += 32;
//
//		}
//		System.out.printf("%c\n", (ch[i]));
//	}

	}
}
