package quiz;

import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

public class B11_count_369_clap {
	public static void main(String[] args) {

		// ����ڷκ��� ���� �ϳ��� �Է¹ް�
		// �ش� ���ڱ��� 369������ ����ȴٸ� �ڼ���
		// �� ��� �ľ� �ϴ��� ����ÿ�

		// # ���α׷� ����ð� ����
		long start_time = System.currentTimeMillis();
		
		// [�ؼ�] # ���ڸ� ����ϴ� ���
		System.out.println("=== 3.6.9 ���� ===");
		System.out.println("������ ���� �Է� >>> ");
		int user = new Scanner(System.in).nextInt();
		int clap = 0;

		boolean debugMode = true;

		for (int i = 1; i <= user; i++) {
			int check = i;

			if (debugMode) {
				System.out.printf("%d : ", i);
			}
			while (check != 0) {
				int digit = check % 10;

				if (digit % 3 == 0 && digit != 0) {
					++clap;
					if (debugMode) {
						System.out.print("¦");
					}
				}
				check /= 10;
			}
			if (debugMode) {
				System.out.println();
			}
		}
		System.out.println(clap + "ȸ");
		
		// # ���α׷� ����ð� ����
		long end_time = System.currentTimeMillis();
				
		System.out.println("�ɸ� �ð� : "+(end_time-start_time));
		
//		99999
//		150000ȸ
//		�ɸ� �ð� : 3003

// # [�ؼ�] ���ڿ��� ����ϴ� ���
//		int user = 333;
//		int clap = 0;
//
//		for (int i = 1; i <= user; i++) {
//			String check = "" + i;
//			int len = check.length();
//
//			for (int j = 0; j < len; j++) {
//				if (check.charAt(j) == '3' || check.charAt(j) == '6' || check.charAt(j) == '9') {
//					clap++;
//				}
//			}
//		}System.out.println(clap);

//		System.out.println("=== 3.6.9 ���� ===");
//		System.out.println("������ ���� �Է� >>> ");
//		int user = new Scanner(System.in).nextInt();
//
//		int count = 0;
//		int i = 1;
//		int it = 0, temp = 0;
//
//		while (i <= user) {
//			it = i;
//			while (true) { 
//				temp = it % 10;
//				if (temp == 3 || temp == 6 || temp == 9) 
//					count++;
//				it/=10;
//				if (it == 0)
//					break;
//			}
//				i++;
//			}System.out.printf("�� %d�� �ڼ�!", count);
	}

}
