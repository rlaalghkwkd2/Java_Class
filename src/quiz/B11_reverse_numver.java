package quiz;

import java.util.Scanner;

public class B11_reverse_numver {
	public static void main(String[] args) {

		// 사용자로부터 정수를 하나 입력받아
		// 그 정수를 일의 자리부터 순서대로 출력 해보세요.
		
		// 해설 하나씩 출력 
		int user2 = 1234567;
		while (true) {
			System.out.print(user2 % 10);
			user2 /= 10;
			if (user2 <= 0)
				break;
		}
		System.out.println();

		// 해설 숫자로 출력
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
		
		
		
		// 내 답
		System.out.println();
		System.out.print(" 정 수 > ");
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
