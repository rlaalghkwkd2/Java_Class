package quiz;

public class B11_whileQuiz {
	public static void main(String[] args) {
		// while문을 이용하여

		// 1. 1부터 100까지의 3의 배수의 총합을 구해보세요.

		int num = 1, sum = 0;
		while (num < 101) {
			if (num % 3 == 0) {
				sum += num;
			}
			num++;
		}
		System.out.println("1번 : " + sum);
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		
		// 2. 200부터 1까지 출력해보세요.
		System.out.println("2번");
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
		
		// 3. 1부터 200까지의 숫자 중
				// 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합을 구해보세요.
		int num3 = 1, sum3 = 0;
		while (num3 < 201) {
			if (num3 % 2 != 0 && num3 % 3 != 0) {
				sum3 += num3;
			}
			num3++;
		}
		System.out.println("3번 : " + sum3);

	}
}
