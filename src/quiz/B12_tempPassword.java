package quiz;

import java.util.Random;

public class B12_tempPassword {
	public static void main(String[] args) {

		// ���� 4�ڸ��� �ӽ� ��й�ȣ ���ڿ��� �����ϴ� ���α׷��� ��������.
		// ��й�ȣ�� �����ϴ� ���� - ���ĺ� �빮��, ����
		// ������ �빮�ڰų� ����(0~9).
		// ������ 4��

		// �ؼ�1 ���ڿ����� �ƹ��ų�, �ƽ�Ű�ڵ� ������� 
		Random ran = new Random();

		StringBuilder temp_password = new StringBuilder();
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

		for (int i = 0; i < 4; i++) {
			char ch = charset.charAt(ran.nextInt(charset.length()));
			temp_password.append(ch);
		}
		System.out.println(temp_password);
		
		// �ؼ�2

		StringBuilder temp_password2 = new StringBuilder();
		Random ran2 = new Random();

		for (int i = 0; i < 4; i++) {
			char ch2;
			
			int category = ran2.nextInt(3); // ī�װ��� ����, ����, Ư���� ��,
			
			// true�� �� ��� �߰�, �ƴϸ� ���� �߰�
			if(ran2.nextBoolean()) {
				ch2 = (char)(ran2.nextInt(26)+'A');
			}
			else {
				ch2 = (char)(ran2.nextInt(10)+'0');
			}
			
			temp_password2.append(ch2);
		}
		System.out.println(temp_password2);

		
		
		

		// �ʼ��� �ƴ� �� �� ��
//		int i = 0;
//		int count = 0, count2 = 0;
//		System.out.println("��й�ȣ 4�ڸ�");
//		while (i < 4) {
//			Random ran = new Random();
//			int rand = ran.nextInt(36) + 48;
//
//			if (rand >= '0' && rand <= '9' || rand >= 'A' & rand <= 'Z') {
//				System.out.print((char) rand);
//				i++;
//			}
//		}

		// ��й�ȣ�� �����ϴ� ���� - ���ĺ� �빮��, ���� �ʼ��� ��
//		int i = 0;
//		int count = 0, count2 = 0;
//		System.out.println("��й�ȣ 4�ڸ�");
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
