package quiz;

import java.util.Scanner;

public class B09_is_contain_apha {
	public static void main(String[] args) {
		// 사용자가 입력한 문자열에 알파벳이 포함되어 있으면 true를 출력
		// 없으면 false를 출력
		// 하나라도!

		// 해설
		System.out.print("문자열 입력 >");
		String str2 = new Scanner(System.in).nextLine();
		boolean result = false;
		// str.length()를 한번만 호출하는 방식
		for (int i = 0, len = str2.length();i<len;++i) {
			char ch = str2.charAt(i);

			if ((ch>= 'A' && ch <= 'Z')
				|| (ch >= 'a' && ch <= 'z')){
				result = true;
				break;  // 만나면 반복문 끝낸다.
			}
			}

















			//		내 답 2
			//		System.out.print("문자열 입력 >");
			//		String str = new Scanner(System.in).next();
			//		int strlen = str.length();
			//		boolean result = false;
			//		
			//		for (int i = 0; i <strlen; i++){
			//			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			//			|| (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')){
			//				result = true;
			//			}
			//		}
			//		System.out.println(result);


			//		내 답
			//		for (int i = 0; i <strlen; i++){
			//			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			//			|| (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')){
			//				contain ++;
			//			}
			//		}
			//		System.out.println((contain > 0)? "true" : "false");
			//		
		}
	}
