package quiz;

import java.util.Scanner;

public class B10_NextPrime {
	public static void main(String[] args) {

		// ����ڷκ��� ���ڸ� ������
		// �Է� ���� ������ �� ũ�ų� ���� ���� �Ҽ��� ã�Ƽ� ���

		System.out.print("���� �Է� : ");
		int user = new Scanner(System.in).nextInt();
		for (int i = user; true; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 0) {
				System.out.printf("'%d'�� ���� �Ҽ��� '%d'�Դϴ�.",user,i);
				break;
			}
		}

	}

}
