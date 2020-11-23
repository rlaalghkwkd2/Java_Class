package crypto;

import java.util.Scanner;

public class CryptoMain {
	public static void main(String[] args) {
		 // 사용자가 메세지와 키값을 설정하고 원하는 암호 알고리즘으로
		 // 암호화 / 복호화 작업을 할 수 있는 프로그램을 만들어보세요.
	
	String user_input = "Caesar";
	int user_input_key = 8;
	// 상속
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
//		// 사용자가 메세지와 키값을 설정하고 원하는 암호 알고리즘으로
//		// 암호화 / 복호화 작업을 할 수 있는 프로그램을 만들어보세요.
//		Scanner int_sc = new Scanner(System.in);
//		Scanner str_sc = new Scanner(System.in);
//		String msg = null;
//		int key = 0;
//		full: while (true) {
//
//
//			switch (menu()) {
//			case 1:
//				System.out.println("# 1. 메세지와 키값 입력 #");
//				System.out.println("------------------------");
//				System.out.print("메세지 >> ");
//				msg = str_sc.nextLine();
//				System.out.print("Key >> ");
//				key = int_sc.nextInt();
//				System.out.println();
//				System.out.println("입력 값 : \"" + msg + "\"");
//				System.out.println("key 값 : " + key);
//				System.out.println();
//				System.out.println();
//				break;
//			case 2:
//				if (key == 0 || msg == null) {
//					System.out.println("메세지와 키값이 입력 되지 않았습니다.\n프로그램을 종료합니다..");
//					break full;
//				}
//				System.out.println("# 2. 암호 선택 #");
//				System.out.println("------------------------");
//				System.out.println("(1) Caesar 암호화");
//				System.out.println("(2) Caesar 복호화");
//				System.out.println("(3) Transposition 암호화");
//				System.out.println("(4) Transposition 복호화");
//				System.out.print(">> ");
//				int choice = int_sc.nextInt();
//				System.out.println("적용 중 ...");
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
//	System.out.println("@@ 비밀 메세지 프로그램 @@");
//	System.out.println("------------------------");
//	System.out.println("1. 메세지와 키 입력");
//	System.out.println("2. 암호 선택");
//	System.out.println("------------------------");
//	System.out.print("메뉴 입력 >>");
//	int menu = int_sc.nextInt();
//	System.out.println();
//	System.out.println();
//	return menu;
//}
//	
//	
//	public static void cipher(int choice, String msg, int key) {
//		System.out.println("========================");
//		System.out.println("평문 : " + msg);
//		if (choice == 1) {
//			CaesarCipher cae1 = new CaesarCipher(key);
//			String sien_result = cae1.encryption(msg);
//			System.out.println("암호화 : " + sien_result);
//		} else if (choice == 2) {
//			CaesarCipher cae2 = new CaesarCipher(key);
//			String side_result = cae2.decryption(msg);
//			System.out.println("복호화 : " + side_result);
//		} else if (choice == 3) {
//			String cae3 = new TranspositionCipher(key).encryption(msg);
//			System.out.println("암호화 : " + cae3);
//		} else if (choice == 4) {
//			String cae4 = new TranspositionCipher(key).decryption(msg);
//			System.out.println("복호화 : " + cae4);
//			
//		}
//		System.out.println("key 값 : " + key);
//		System.out.println("========================");
//	}
}
