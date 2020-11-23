package quiz;

import java.util.Arrays;

public class B14_Array2Quiz {
	public static void main(String[] args) {
		int[][] numArr = { { 10, 10, 10, 10 }, { 90, 50, 30, 70 }, { 800, 500 }, { 300, 300, 300 }

		};

		// 1. numArr�� ����2480�� ���(�Ҽ��� ��°�ڸ�)190.76�� ���ؼ� ����غ��ÿ�.

		int sum = 0;

		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				sum += numArr[i][j];
			}
		}
		System.out.println("numArr �� �� : " + sum);
		System.out.printf("numArr ��� �� : %.2f\n", sum / 13.0);

		System.out.println();

		// 2. numArr�� �� ���� �հ� ���� ���� ��� ���ؼ� ����غ��ÿ�.
		// 0���� �� : 10 + 10 + 10 + 10
		// 0���� �� : 10 + 90 + 800 + 300

		// �ؼ�
		int[] rowSum = new int[numArr.length];
		int[] colSum = new int[4];

		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				rowSum[i] += numArr[i][j];
				colSum[j] += numArr[i][j];
			}
		}
		
		
		
		
		
		
		System.out.println(Arrays.toString(rowSum));
		System.out.println(Arrays.toString(colSum));
		
		
		
		
		

		// ��

		for (int i = 0; i < numArr.length; i++) {
			int wsum = 0;
			int[] num = numArr[i];
			for (int j = 0; j < num.length; j++) {
				wsum += num[j];
			}

			System.out.println("���� �� : " + wsum);
		}

		System.out.println();

		// ��

		for (int i = 0; i < numArr.length; i++) {
			int hsum = 0;

			for (int j = 0; j < numArr.length; j++) {

				if (numArr[i].length != 4) {
					if (numArr[j].length <= numArr[i].length)
						continue;
					hsum += numArr[j][i];

				} else {
					hsum += numArr[j][i];
				}
			}
			System.out.println("���� �� : " + hsum);
		}
	}
}
