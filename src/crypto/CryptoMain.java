package crypto;

import java.util.Scanner;

public class CryptoMain {
	public static void main(String[] args) {
		 // ����ڰ� �޼����� Ű���� �����ϰ� ���ϴ� ��ȣ �˰�������
		 // ��ȣȭ / ��ȣȭ �۾��� �� �� �ִ� ���α׷��� ��������.
	
	String user_input = "Caesar";
	int user_input_key = 8;
	// ���
	Cipher cipher = null;
	
	if (user_input.equals("Caesar")) {
		cipher = new CaesarCipher(user_input_key);
	}
	else if (user_input.equals("Transposition")) {
		cipher = new TranspositionCipher(user_input_key);
	}
	String result = cipher.encryption("ABCDEFG ABCDEFG");
	System.out.println(result);
	}
	
	
//	public static void main(String[] args) {
//
//		// ����ڰ� �޼����� Ű���� �����ϰ� ���ϴ� ��ȣ �˰�������
//		// ��ȣȭ / ��ȣȭ �۾��� �� �� �ִ� ���α׷��� ��������.
//		Scanner int_sc = new Scanner(System.in);
//		Scanner str_sc = new Scanner(System.in);
//		String msg = null;
//		int key = 0;
//		full: while (true) {
//
//
//			switch (menu()) {
//			case 1:
//				System.out.println("# 1. �޼����� Ű�� �Է� #");
//				System.out.println("------------------------");
//				System.out.print("�޼��� >> ");
//				msg = str_sc.nextLine();
//				System.out.print("Key >> ");
//				key = int_sc.nextInt();
//				System.out.println();
//				System.out.println("�Է� �� : \"" + msg + "\"");
//				System.out.println("key �� : " + key);
//				System.out.println();
//				System.out.println();
//				break;
//			case 2:
//				if (key == 0 || msg == null) {
//					System.out.println("�޼����� Ű���� �Է� ���� �ʾҽ��ϴ�.\n���α׷��� �����մϴ�..");
//					break full;
//				}
//				System.out.println("# 2. ��ȣ ���� #");
//				System.out.println("------------------------");
//				System.out.println("(1) Caesar ��ȣȭ");
//				System.out.println("(2) Caesar ��ȣȭ");
//				System.out.println("(3) Transposition ��ȣȭ");
//				System.out.println("(4) Transposition ��ȣȭ");
//				System.out.print(">> ");
//				int choice = int_sc.nextInt();
//				System.out.println("���� �� ...");
//				System.out.println();
//				cipher(choice, msg, key);
//				System.out.println();
//				System.out.println();
//			}
//		}
//	}
//
//	
//public static int menu() {
//	Scanner int_sc = new Scanner(System.in);
//	System.out.println("------------------------");
//	System.out.println("@@ ��� �޼��� ���α׷� @@");
//	System.out.println("------------------------");
//	System.out.println("1. �޼����� Ű �Է�");
//	System.out.println("2. ��ȣ ����");
//	System.out.println("------------------------");
//	System.out.print("�޴� �Է� >>");
//	int menu = int_sc.nextInt();
//	System.out.println();
//	System.out.println();
//	return menu;
//}
//	
//	
//	public static void cipher(int choice, String msg, int key) {
//		System.out.println("========================");
//		System.out.println("�� : " + msg);
//		if (choice == 1) {
//			CaesarCipher cae1 = new CaesarCipher(key);
//			String sien_result = cae1.encryption(msg);
//			System.out.println("��ȣȭ : " + sien_result);
//		} else if (choice == 2) {
//			CaesarCipher cae2 = new CaesarCipher(key);
//			String side_result = cae2.decryption(msg);
//			System.out.println("��ȣȭ : " + side_result);
//		} else if (choice == 3) {
//			String cae3 = new TranspositionCipher(key).encryption(msg);
//			System.out.println("��ȣȭ : " + cae3);
//		} else if (choice == 4) {
//			String cae4 = new TranspositionCipher(key).decryption(msg);
//			System.out.println("��ȣȭ : " + cae4);
//			
//		}
//		System.out.println("key �� : " + key);
//		System.out.println("========================");
//	}
}
