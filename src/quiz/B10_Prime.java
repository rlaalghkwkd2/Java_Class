package quiz;

import java.util.Scanner;

public class B10_Prime {
	public static void main(String[] args) {
		// ����ڷκ��� ���ڸ� �Է¹�����
		// 1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ��ÿ�.
		// �� �Ҽ� : ����� 1�� �ڱ� �ڽŹۿ� ���� ����

		System.out.print("���� �Է� : ");
		int num = new Scanner(System.in).nextInt();
		// i : �Ҽ����� �׽�Ʈ �غ� ����
		for (int i = 2; i <= num; i++) {
			int count = 0;
			// j : i�� ������� �׽�Ʈ �غ� ����
			for (int j = 1; j <= i; j++) { 
		// for (int j = 2; j < i; j++)
		// for (int j = 2; j < (int)(Math.sqrt(i)); j++)
				if(i % j == 0)
					count++;
			}
			if(count==2)
				// if(count==0)
				System.out.println(i);
		}
	}
}
