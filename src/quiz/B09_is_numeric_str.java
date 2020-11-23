package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {
	public static void main(String[] args) {
		// 입력받은 문자열이 숫자만! 포함되어 있으면 결과에 1을 저장
		// 다른 문자가 포함되어 있다면 0을 저장하여 출력

		// ※ 단, 문자열이 비어있을 때는 결과가 2
		
		// 해설
		System.out.print("문자열 입력 >");
		String str = new Scanner(System.in).nextLine();
		int len = str.length();
		int numer = 1;

		if (str==null||str.equals("")||len == 0) {
			numer = 2;
		}
		for (int i = 0;i<len;++i) {
			char ch = str.charAt(i);

			if (!(ch>= '0' && ch <= '9'))
				numer =  0;
			break;
		}

		//  내 답
			System.out.print("문자열 입력 >");
			String str2 = new Scanner(System.in).nextLine();
			int numer2 = 2;

			for (int i2 = 0, len2 = str2.length();i2<len2;++i2) {
				char ch2 = str2.charAt(i2);

				if (ch2>= '0' && ch2 <= '9'){
					numer2 =  1;
				}
				else {
					numer2 = 0;
					break;
				}
			}
			System.out.println("출력 : " + numer);
			 
		}


		//		System.out.print("문자열 입력 >");
		//		String str = new Scanner(System.in).nextLine();
		//		String intStr = str.replaceAll("[^0-9]", "");
		//
		//		int number = 0;
		//
		//		if(str == ""||str ==null||str.length()==0){
		//			number = 2;
		//		}
		//		else if(str == intStr) {
		//			number = 1;
		//		}
		//		else{
		//			number = 0;
		//		}
		//		System.out.println(number);


	}


