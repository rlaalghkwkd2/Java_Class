
public class B09_for {
	public static void main(String[] args) {
		/*
		 * # �ݺ��� 
		 *  - for, while, do-while(x), for each
		 *  - �Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ����Ѵ�.
		 *  
		 *  # for (�ʱⰪ; ����; ������){
		 *	- ��� ������ true�� ���� �ݺ��� ��ɾ���� ���� ��
		 *
		 * 
		 * 
		 *  }
		 */

		// 1. ���� �⺻���� ����
		//  - �ʱⰪ�� 0�� �ְ�, ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ���´�.
		//    ������ 1�� �Ѵ�.
		for (int i = 0; i < 5000; i++) {
			System.out.println("Hello,world! "+i);
		}

		// 2. �ʱⰪ�� ������, ���� ��ġ�� ������� ������ �� �ִ�.
		for (int i = 10; i < 33; i+=2) {
			System.out.println("Hello,world! "+i);
		}
		for (int i = 9000; i > 0; i-=100) {
			System.out.println("Minus "+i);
		}

		// 3. �ʱⰪ�� �������� ��ġ�� ������� ������ �� �ִ�.
		int num = 0;
		for (; num < 100;) {
			System.out.println("�������"+num);
			++num;
		}

		// 4. ���ο� �ٸ� ������ �����Ӱ� ����� �� �ִ�.
		for (int month = 1; month <= 12; ++month) {
			switch (month) {

			case 12 :case 1 :case 2 :
				System.out.printf("%d���� �ܿ�\n",month);
				break;
			default:
				System.out.printf("%d�� ���� �������� �ʾҽ��ϴ�.\n",month);
				break;
			}

		}

		// 5. ������ ��������� ���� �ݺ��Ѵ�.
		//  - ���ǿ� true�� �־ ���ѹݺ��Ѵ�.
		//  �� break�� �̿��� �ݺ����� Ż���� �� �ִ�.

		num = 0;
		for (;;) {
			System.out.println(num++);

			if(num>2)
				break;
		}

		// 6. continue�� �̿��ϸ� �ݺ����� ��ŵ�� �� �ִ�.
		for (int i = 0; i < 10; i++) {
			if(i%2==0)
				continue;
			System.out.print(i+" ");
		}

		/*for (int i = 0; i < 100; i++) {
			System.out.printf("%-3d",i);
			if (i%10!=9)
				continue;
			System.out.println();
		}*/

		// 7. �ݺ������� ���� ���ϱ�
		//  (1) ������ ������ ������ �����ϰ� 0���� �ʱ�ȭ �Ѵ�.
		//  (2) �ݺ����� ���� �ش� ������ ���� ������Ų��.
		int sum = 0;
		for (int i = 80; i <=333 ; i++) {
			if(i%3==0)
				sum += i;
		}
		System.out.println(sum);

	}
}
