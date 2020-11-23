package quiz;

import java.util.Arrays;

public class B13_count_random_fruit {
	public static void main(String[] args) {

		// 1. ũ�� 100�� �迭�� ���� ���� ���ڿ��� �����غ��ÿ�.
		// ���� �ϴ� ���� : apple, banana, orange, peach, kiwi

		// 2. �� ������ ��� �����ߴ��� ��� ����ϰ� ����غ��ÿ�.

		// �ؼ�
		int size = 7;
		int fruit_kind;
		String[] fruitBox = new String[size];
		String[] fruitNames = { "apple", "banana", "orange", "peach", "kiwi" };
		fruit_kind = fruitNames.length;
		
		for (int i = 0; i < size; i++) {
			fruitBox[i] = fruitNames[(int) (Math.random() * 5)];
		}
		System.out.println(Arrays.toString(fruitBox));

		// fruit box �迭�� ����Ǿ� �� ������ ��� �����ߴ��� ��� �������.
		
		int[] count = new int[5];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < fruit_kind; j++) {
				if (fruitBox[i] == fruitNames[j]) { 
					// fruitNames[j].equals(fruitBox[i]);
					count[j]++;
					break;
				}
			}
		}
		// ���谡 ���� �� count�� ����ؾ� �Ѵ�.
		for (int i = 0; i < count.length; i++) {
			System.out.printf("%s : %dȸ \n", fruitNames[i], count[i]);
		}

		// # enum�� ����
		int apple = 0;
		int banana = 1;
		int orange = 2;
		
		System.out.println("������ ��ȣ : "+orange);
		System.out.println("������ Ƚ�� : "+count[orange]);
		System.out.println("������ �̸� : "+fruitNames[orange]);
		
		
		
		// ������� �������ֽ� ��
//		String[] fruit = new String[100];
//		String[] abo = { "apple", "banana", "orange", "peach", "kiwi" };
//		int[] count1 = new int[5];
//
//		for (int i = 0; i < 100; i++) {
//			int rannum = (int) (Math.random() * 5);
//			fruit[i] = abo[rannum];
//			count1[rannum]++;
//		}
//		System.out.println(Arrays.toString(fruit));
//		System.out.println("");
//		for (int i = 0; i < 5; i++) {
//			if (count1[i] > 0) {
//				System.out.printf("%s : %d���Դϴ�.\n", abo[i], count1[i]);
//			}
//		}

//		String[] fruit = new String[100];
//		String[] abo = { "apple", "banana", "orange", "peach", "kiwi" };
//		int[] count = new int[5];
//
//		for (int i = 0; i < 100; i++) {
//			fruit[i] = abo[(int) (Math.random() * 5)];
//			for (int j = 0; j < abo.length; j++) {
//				String str = abo[j];
//				if (str == fruit[i])
//					count[j] ++;
//			}
//		}
//		System.out.println(Arrays.toString(fruit));
//		System.out.println("");
//		for (int i = 0; i < 5; i++) {
//			if (count[i] > 0) {
//				System.out.printf("%s : %d���Դϴ�.\n", abo[i], count[i]);
//			}
//		}
	}
}
