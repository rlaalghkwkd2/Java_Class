
public class B14_Array2 {
	public static void main(String[] args) {
		// �迭 �ȿ��� �迭�� ���� �� �ִ�.

		// ������ ���� ���� �ּҰ��� �����ϴ� ����
		// int�� �ʱⰪ�� 0���� ����, ������ ���� Ÿ���� null

		// ������ ���� Ÿ�Կ��� null�� �� �� �ִ�.
		// �迭 ������ ���� �����ϴ� ���� �ƴ϶� �迭�� ���� �ּҸ� �����Ѵ�.
		// �� �迭�� ������ ���� Ÿ���̴�.

		String str = null;
		int[] scores = null;

		int[][] arr2 = { // int[0][3] : ���� ������
				new int[5], // ����ִ� 5�� ¥�� int[] �迭
				null, // ���� �迭�� ����
				{ 1, 2, 3, 4, 5, 6, 7 }, new int[] { 1, 2, 3 }, scores };
		// i[]�迭�ȿ� i[][]�迭�� ���ִ°� �ƴ϶� ���� �ּҰ� �� �ִ�.

		System.out.println("arr2�� ����� �迭�� ��ΰ���? " + arr2.length);
		System.out.println("arr2�� ����� �迭 �� 0��° �迭�� ���� : " + arr2[0].length);
		// System.out.println(arr2[1].length);
		System.out.println("arr2�� ����� �迭 �� 2��° �迭�� ���� : " + arr2[2].length);
		System.out.println("arr2�� ����� �迭 �� 3��° �迭�� ���� : " + arr2[3].length);

		// ���̸� Ȱ���Ͽ� n���� �迭�� n�� �ݺ������� ��� Ž���� �� �ִ�.
		for (int i = 0; i < arr2.length; i++) {
			int[] arr = arr2[i];

			if (arr != null) {
				for (int j = 0; j < arr.length; j++) 
					System.out.print(arr2[i][j]);
//					System.out.print(arr[j]);
				}
				System.out.print("null");
			}
			System.out.println();
		}

//		// Ȱ�� ��
//		int[][] scores2 = { { 80, 90, 100 }, { 50, 60, 70 }, { 90, 90, 90 }, { 70, 70, 70 } };
//
//		// 1 : ���׶��
//		// 2 : �׸�
//		// 3 : x
//		int[][] map = { 
//				{ 3, 3, 3, 3, 1, 3, 1, 3, 2, 3, 1, 1, 1, 3, 1 },
//				{ 3, 3, 3, 1, 3, 3, 1, 3, 2, 3, 1, 3, 1, 3, 1 },
//				{ 3, 3, 1, 3, 1, 1, 1, 3, 2, 3, 1, 1, 1, 3, 1 },
//				{ 3, 1, 3, 1, 3, 3, 1, 3, 2, 3, 3, 3, 3, 1, 3 },
//				{ 1, 3, 3, 3, 1, 3, 1, 3, 2, 3, 3, 3, 3, 1, 3 },
//				{ 3, 3, 3, 3, 3, 3, 1, 3, 2, 3, 3, 3, 3, 1, 1, 1 }
//				};
//		
//		for (int i = 0; i < map.length; i++) {
//			for (int j = 0; j < map[i].length; j++) {
//				switch (map[i][j]) {
//				case 1:
//					System.out.print("o ");
//					break;
//				case 2:
//					System.out.print("n ");
//					break;
//				case 3:
//					System.out.print("  ");
//					break;
//				default:
//					System.out.print("  ");
//					break;
//				}
//
//			}
//			System.out.println();
//		}
//
//	}
}
