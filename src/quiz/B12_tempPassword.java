package quiz;

import java.util.Random;

public class B12_tempPassword {
	public static void main(String[] args) {

		// 랜덤 4자리의 임시 비밀번호 문자열을 생성하는 프로그램을 만들어보세요.
		// 비밀번호를 구성하는 문자 - 알파벳 대문자, 숫자
		// 랜덤이 대문자거나 숫자(0~9).
		// 갯수는 4개

		// 해설1 문자열에서 아무거나, 아스키코드 사용으로 
		Random ran = new Random();

		StringBuilder temp_password = new StringBuilder();
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

		for (int i = 0; i < 4; i++) {
			char ch = charset.charAt(ran.nextInt(charset.length()));
			temp_password.append(ch);
		}
		System.out.println(temp_password);
		
		// 해설2

		StringBuilder temp_password2 = new StringBuilder();
		Random ran2 = new Random();

		for (int i = 0; i < 4; i++) {
			char ch2;
			
			int category = ran2.nextInt(3); // 카테고리가 영어, 숫자, 특수일 때,
			
			// true일 때 영어를 추가, 아니면 숫자 추가
			if(ran2.nextBoolean()) {
				ch2 = (char)(ran2.nextInt(26)+'A');
			}
			else {
				ch2 = (char)(ran2.nextInt(10)+'0');
			}
			
			temp_password2.append(ch2);
		}
		System.out.println(temp_password2);

		
		
		

		// 필수가 아닐 때 내 답
//		int i = 0;
//		int count = 0, count2 = 0;
//		System.out.println("비밀번호 4자리");
//		while (i < 4) {
//			Random ran = new Random();
//			int rand = ran.nextInt(36) + 48;
//
//			if (rand >= '0' && rand <= '9' || rand >= 'A' & rand <= 'Z') {
//				System.out.print((char) rand);
//				i++;
//			}
//		}

		// 비밀번호를 구성하는 문자 - 알파벳 대문자, 숫자 필수일 때
//		int i = 0;
//		int count = 0, count2 = 0;
//		System.out.println("비밀번호 4자리");
//		while (i < 4) {
//
//			Random ran = new Random();
//			int rand = ran.nextInt(36) + 48;
//
//			if (rand >= '0' && rand <= '9' || rand >= 'A' & rand <= 'Z') {
//				if (rand >= '0' && rand <= '9')
//					count++;
//				else if (rand >= 'A' & rand <= 'Z')
//					count2++;
//				if (count == 3 && count2 == 3)
//					break;
//				System.out.print((char) rand);
//				i++;
//			}
//		}

//		for (int i = 0; i < 2; i++) {
//			Random ran = new Random();
//		
//			int rand = ran.nextInt(10)+48;
//			System.out.println((char)rand);
//			
//			int rand2 = ran.nextInt(26)+65;
//			System.out.println((char)rand2);
//
//		}

//		for (int i = 0; i < 100; i++) {
//			Random ran = new Random();
//			int rand = ran.nextInt(9999);
//			if (rand >= 'A' && rand <= 'Z')
//				System.out.println((char) rand);
//			else
//				System.out.println(rand);
//		}

	}
}
