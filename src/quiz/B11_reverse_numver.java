package quiz;

import java.util.Scanner;

public class B11_reverse_numver {
	public static void main(String[] args) {

		// ����ڷκ��� ������ �ϳ� �Է¹޾�
		// �� ������ ���� �ڸ����� ������� ��� �غ�����.
		
		// �ؼ� �ϳ��� ��� 
		int user2 = 1234567;
		while (true) {
			System.out.print(user2 % 10);
			user2 /= 10;
			if (user2 <= 0)
				break;
		}
		System.out.println();

		// �ؼ� ���ڷ� ���
		int user3 = 123456789;
		int reversed = 0;
		while (true) {
			reversed += user3 % 10;
			user3 /= 10;
			if (user3 <= 0)
				break;
			reversed *= 10;
		}
		System.out.println(reversed);
		
		
		
		// �� ��
		System.out.println();
		System.out.print(" �� �� > ");
		int user = new Scanner(System.in).nextInt();
		int x = 10, result = 0;
		while (true) {
			System.out.print(user % 10);
			user /= 10;
			if (user == 0)
				break;
		}

		System.out.println();
	}
}
