package quiz;

import java.util.Scanner;

public class B09_strupcase {
	public static void main(String[] args) {
		// 입력받은 문자열의 모든 알파벳을 대문자로 만들어 보세요
		
		StringBuilder strb = new StringBuilder();
		
		System.out.print("문자열 입력 : ");
		String str = new Scanner(System.in).nextLine();
		for (int i = 0,len=str.length(); i < len; i++) {
			char ch = str.charAt(i);
			if (ch>='a'&&ch<='z') {
				ch -=32;     //Math.abc('A'-'a');
			}
			strb.append(ch);
		}
		System.out.println(strb);
		
		
		
		
		
		
		
		
//		System.out.print("문자열 입력 : ");
//		String str = new Scanner(System.in).next();
//		int strlen = str.length();
//
//		for (int i = 0; i < strlen; i++) {
//			char ch = str.charAt(i);
//			if (ch >= 'a' && ch <= 'z') {
//				ch = (char)(ch-32);
//			}
//			System.out.print(ch);
//		}












		// abc한글123ABC
		//		System.out.printf("\n입력 받은 문자열 : %s,\n결과 문자열 : %s", str);

		//		System.out.println("abc한글123".toUpperCase());
		//		System.out.println("ABC한글123".toLowerCase());

	}
}
