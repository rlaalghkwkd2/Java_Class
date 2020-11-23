package quiz;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class C12_inputRightThing {
	
	public static int input(String str) {
		
		
		while (true) {
			System.out.println(str);
			try {
				System.out.print("정수 입력 : ");
				return new Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.err.println("숫자");
			}
		}
	}
	public static void main(String[] args) {
		// 사용자로 부터 int타입의 데이터를 입력받고 출력해 보시오.
		// 잘못된 타입의 데이터가 들어오더라도 프로그램이 종료되지 않아야 합니다.
		// (올바르게 int가 입력된 경우 프로그램을 종료된다.)

		// -----------
		// abc\n
		// -----------

		int value = input("반드시 숫자만 입력해주세요 > ");
		System.out.println("입력 받은 숫자 : "+value);

	}
}
