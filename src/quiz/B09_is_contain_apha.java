package quiz;

import java.util.Scanner;

public class B09_is_contain_apha {
	public static void main(String[] args) {
		// ����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ� ������ true�� ���
		// ������ false�� ���
		// �ϳ���!

		// �ؼ�
		System.out.print("���ڿ� �Է� >");
		String str2 = new Scanner(System.in).nextLine();
		boolean result = false;
		// str.length()�� �ѹ��� ȣ���ϴ� ���
		for (int i = 0, len = str2.length();i<len;++i) {
			char ch = str2.charAt(i);

			if ((ch>= 'A' && ch <= 'Z')
				|| (ch >= 'a' && ch <= 'z')){
				result = true;
				break;  // ������ �ݺ��� ������.
			}
			}

















			//		�� �� 2
			//		System.out.print("���ڿ� �Է� >");
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


			//		�� ��
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
