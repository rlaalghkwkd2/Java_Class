package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {
	public static void main(String[] args) {
		// �Է¹��� ���ڿ��� ���ڸ�! ���ԵǾ� ������ ����� 1�� ����
		// �ٸ� ���ڰ� ���ԵǾ� �ִٸ� 0�� �����Ͽ� ���

		// �� ��, ���ڿ��� ������� ���� ����� 2
		
		// �ؼ�
		System.out.print("���ڿ� �Է� >");
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

		//  �� ��
			System.out.print("���ڿ� �Է� >");
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
			System.out.println("��� : " + numer);
			 
		}


		//		System.out.print("���ڿ� �Է� >");
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


