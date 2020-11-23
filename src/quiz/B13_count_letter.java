package quiz;

public class B13_count_letter {
	public static void main(String[] args) {

		// 사용자로부터 문장을 하나 입력받고았다 치고
		// 해당 문장에 어떤 알파벳이 몇번 등장했는지 세어서 출력해보시오.
		// 대소문자 구분 X

		// 해설

		int[] count = new int[26];

		String msg = "The Quick Brown Fox Jumps Over a Lazy Dog";
		msg = msg.toLowerCase(); // 대문자로 : Upper 소문자로 : Lower
		for (int i = 0; i < msg.length(); i++) {

			char ch = msg.charAt(i);

			if (ch >= 'a' && ch <= 'z')
				count[ch - 'a'] += 1;
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) { // 등장한 애들만
				System.out.printf("%c가 등장한 횟수는 %d번입니다.\n", 
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
//			System.out.printf("%c : %d번\n", (char) (ch[i]), count[i]);
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
