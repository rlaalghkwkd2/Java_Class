package quiz;

import java.util.Scanner;

public class B09_strupcase {
	public static void main(String[] args) {
		// �Է¹��� ���ڿ��� ��� ���ĺ��� �빮�ڷ� ����� ������
		
		StringBuilder strb = new StringBuilder();
		
		System.out.print("���ڿ� �Է� : ");
		String str = new Scanner(System.in).nextLine();
		for (int i = 0,len=str.length(); i < len; i++) {
			char ch = str.charAt(i);
			if (ch>='a'&&ch<='z') {
				ch -=32;     //Math.abc('A'-'a');
			}
			strb.append(ch);
		}
		System.out.println(strb);
		
		
		
		
		
		
		
		
//		System.out.print("���ڿ� �Է� : ");
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












		// abc�ѱ�123ABC
		//		System.out.printf("\n�Է� ���� ���ڿ� : %s,\n��� ���ڿ� : %s", str);

		//		System.out.println("abc�ѱ�123".toUpperCase());
		//		System.out.println("ABC�ѱ�123".toLowerCase());

	}
}
