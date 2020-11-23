import java.util.Random;

public class B12_random {
	public static void main(String[] args) {
// # JAVA���� ������ ���� �����ϱ�
		// 1. Math.random()
		// - doubleŸ���� 0 <= x < 1.0�� ���� �Ҽ��� �����Ѵ�.
		// - �� �Ҽ��� �̿��Ͽ� ���ϴ� ���ڸ� ���� ����� �� �ֵ�.

// # ���ϴ� ���ڸ� ����� ���� (ex : 80 ~ 100 = 21)
		// (1) ���ϴ� ������ ������ ���Ѵ�. (ex : *21)
		// 		0 <= x < 1.0 * 21
		// (2) ���ϴ� ���� �� ���� ���� ���ڸ� ���Ѵ�. (ex : +80 )
		// 		0 + 80 <= x < 21 + 80
		// (3) �Ҽ��� �Ʒ��� �����Ѵ�. (ex : (int)ȭ �ع�����.)
		// 		(int)(80 <= x < 100.0)

// 2. Random Ŭ������ �̿�
		// - ������ �� ���ϴ� �õ��ȣ�� ������ �� �ִ�.
		// - ���� �õ� ��ȣ�� �����ϸ� ���� ���� ���´�.
		// - �õ� ��ȣ�� �������� ������ �������� �õ尡 ���õȴ�.

// # ���ο� ���� �õ� ����
		Random ran = new Random(10);
		Random ran2 = new Random(10);

// # Random.nextInt(bound) : ���ϴ� ������ ������ ��ȯ�Ѵ�.
		// - 0 ~ bound�̸��� ������ ��ȯ�Ѵ�.
		// - bound�� �������� ������ int���� ��ü���� ���� ������ ���õȴ�.

		System.out.println(ran.nextInt(30)); // 0 ~ 29
		System.out.println(ran2.nextInt()); // int ��ü ����
		System.out.println(ran2.nextInt(21) + 80);// 80 ~ 100 �� ����

		// ���� ���� : 3000�̻� 5000������ ���� ������ 100�� �̰�
		// �� ���� ���Դ� ���� ū���� ���� ���� ���� ��� �غ���.

// �ؼ�
		int max1 = 0, min1 = 0;

		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 2001 + 3000);

			// ó������ �񱳴���� �����Ƿ� �׳� ����
			if (i == 0) {
				max1 = num;
				min1 = num;
			} else {
				// ���� ����� ������ �� ũ�� max���� ����
				// max = max < num ? num : max;
				max1 = Math.max(max1, num);
				// if(num>max1)
				//	max1 = num;

				// ���� ����� ������ �� ������ min���� ����
				// min1 = min1 > num ? num : min1;
				min1 = Math.min(min1, num);
				// else if(num>min1)
				//	min1 = num;
			}
		}
		System.out.printf("�ִ� : %d, �ּҰ� : %d\n", max1, min1);

// �� ��
		int min = 5001, max = 0;
		for (int i = 0; i < 10; i++) {
			int rand = (int) (Math.random() * 2001 + 3000);
			System.out.println((i + "�� " + rand));
			if (rand > max)
				max = rand;
			else if (rand < min)
				min = rand;
		}
		System.out.println("�ִ� :" + max);
		System.out.println("�ּҰ� :" + min);
	}
}
