package quiz;

public class B11_whileQuiz {
	public static void main(String[] args) {
		// while���� �̿��Ͽ�

		// 1. 1���� 100������ 3�� ����� ������ ���غ�����.

		int num = 1, sum = 0;
		while (num < 101) {
			if (num % 3 == 0) {
				sum += num;
			}
			num++;
		}
		System.out.println("1�� : " + sum);
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		
		// 2. 200���� 1���� ����غ�����.
		System.out.println("2��");
		int num2 = 200;
		while (num2 > 0) {
			System.out.printf("%3d ", num2);
			if (num2 % 10 == 1)
				System.out.println();
			num2--;
		}

		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		
		// 3. 1���� 200������ ���� ��
				// 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ������ ���غ�����.
		int num3 = 1, sum3 = 0;
		while (num3 < 201) {
			if (num3 % 2 != 0 && num3 % 3 != 0) {
				sum3 += num3;
			}
			num3++;
		}
		System.out.println("3�� : " + sum3);

	}
}
