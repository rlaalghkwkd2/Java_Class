package quiz;

import java.util.Scanner;

public class B10_NextPrime {
	public static void main(String[] args) {

		// 사용자로부터 숫자를 받으면
		// 입력 받은 수보다 더 크거나 같은 다음 소수를 찾아서 출력

		System.out.print("정수 입력 : ");
		int user = new Scanner(System.in).nextInt();
		for (int i = user; true; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 0) {
				System.out.printf("'%d'의 다음 소수는 '%d'입니다.",user,i);
				break;
			}
		}

	}

}
