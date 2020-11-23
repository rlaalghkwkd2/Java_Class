package quiz;

import java.util.Arrays;

public class B14_Array2Quiz {
	public static void main(String[] args) {
		int[][] numArr = { { 10, 10, 10, 10 }, { 90, 50, 30, 70 }, { 800, 500 }, { 300, 300, 300 }

		};

		// 1. numArr의 총합2480과 평균(소수점 둘째자리)190.76을 구해서 출력해보시오.

		int sum = 0;

		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				sum += numArr[i][j];
			}
		}
		System.out.println("numArr 총 합 : " + sum);
		System.out.printf("numArr 평균 값 : %.2f\n", sum / 13.0);

		System.out.println();

		// 2. numArr의 각 행의 합과 열의 합을 모두 구해서 출력해보시오.
		// 0행의 합 : 10 + 10 + 10 + 10
		// 0열의 합 : 10 + 90 + 800 + 300

		// 해설
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
		
		
		
		
		

		// 행

		for (int i = 0; i < numArr.length; i++) {
			int wsum = 0;
			int[] num = numArr[i];
			for (int j = 0; j < num.length; j++) {
				wsum += num[j];
			}

			System.out.println("열의 합 : " + wsum);
		}

		System.out.println();

		// 열

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
			System.out.println("열의 합 : " + hsum);
		}
	}
}
