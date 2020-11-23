package quiz;

import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

public class B11_count_369_clap {
	public static void main(String[] args) {

		// 사용자로부터 정수 하나를 입력받고
		// 해당 숫자까지 369게임이 진행된다면 박수를
		// 총 몇번 쳐야 하는지 세어보시오

		// # 프로그램 실행시간 측정
		long start_time = System.currentTimeMillis();
		
		// [해설] # 숫자를 사용하는 방법
		System.out.println("=== 3.6.9 게임 ===");
		System.out.println("마지막 숫자 입력 >>> ");
		int user = new Scanner(System.in).nextInt();
		int clap = 0;

		boolean debugMode = true;

		for (int i = 1; i <= user; i++) {
			int check = i;

			if (debugMode) {
				System.out.printf("%d : ", i);
			}
			while (check != 0) {
				int digit = check % 10;

				if (digit % 3 == 0 && digit != 0) {
					++clap;
					if (debugMode) {
						System.out.print("짝");
					}
				}
				check /= 10;
			}
			if (debugMode) {
				System.out.println();
			}
		}
		System.out.println(clap + "회");
		
		// # 프로그램 실행시간 측정
		long end_time = System.currentTimeMillis();
				
		System.out.println("걸린 시간 : "+(end_time-start_time));
		
//		99999
//		150000회
//		걸린 시간 : 3003

// # [해설] 문자열을 사용하는 방법
//		int user = 333;
//		int clap = 0;
//
//		for (int i = 1; i <= user; i++) {
//			String check = "" + i;
//			int len = check.length();
//
//			for (int j = 0; j < len; j++) {
//				if (check.charAt(j) == '3' || check.charAt(j) == '6' || check.charAt(j) == '9') {
//					clap++;
//				}
//			}
//		}System.out.println(clap);

//		System.out.println("=== 3.6.9 게임 ===");
//		System.out.println("마지막 숫자 입력 >>> ");
//		int user = new Scanner(System.in).nextInt();
//
//		int count = 0;
//		int i = 1;
//		int it = 0, temp = 0;
//
//		while (i <= user) {
//			it = i;
//			while (true) { 
//				temp = it % 10;
//				if (temp == 3 || temp == 6 || temp == 9) 
//					count++;
//				it/=10;
//				if (it == 0)
//					break;
//			}
//				i++;
//			}System.out.printf("총 %d번 박수!", count);
	}

}
