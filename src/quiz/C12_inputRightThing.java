package quiz;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class C12_inputRightThing {
	
	public static int input(String str) {
		
		
		while (true) {
			System.out.println(str);
			try {
				System.out.print("���� �Է� : ");
				return new Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.err.println("����");
			}
		}
	}
	public static void main(String[] args) {
		// ����ڷ� ���� intŸ���� �����͸� �Է¹ް� ����� ���ÿ�.
		// �߸��� Ÿ���� �����Ͱ� �������� ���α׷��� ������� �ʾƾ� �մϴ�.
		// (�ùٸ��� int�� �Էµ� ��� ���α׷��� ����ȴ�.)

		// -----------
		// abc\n
		// -----------

		int value = input("�ݵ�� ���ڸ� �Է����ּ��� > ");
		System.out.println("�Է� ���� ���� : "+value);

	}
}
