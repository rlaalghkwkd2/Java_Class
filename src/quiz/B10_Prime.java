package quiz;

import java.util.Scanner;

public class B10_Prime {
	public static void main(String[] args) {
		// 사용자로부터 숫자를 입력받으면
		// 1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보시오.
		// ※ 소수 : 약수가 1과 자기 자신밖에 없는 숫자

		System.out.print("정수 입력 : ");
		int num = new Scanner(System.in).nextInt();
		// i : 소수인지 테스트 해볼 숫자
		for (int i = 2; i <= num; i++) {
			int count = 0;
			// j : i의 약수인지 테스트 해볼 숫자
			for (int j = 1; j <= i; j++) { 
		// for (int j = 2; j < i; j++)
		// for (int j = 2; j < (int)(Math.sqrt(i)); j++)
				if(i % j == 0)
					count++;
			}
			if(count==2)
				// if(count==0)
				System.out.println(i);
		}
	}
}
