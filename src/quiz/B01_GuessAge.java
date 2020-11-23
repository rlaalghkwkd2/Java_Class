package quiz;

import java.util.Scanner;

public class B01_GuessAge {
	// 사용자로 부터 올해의 년도와 나이를 입력받으면
	// 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어보세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("올해의 년도와 태어난 년도를 입력 하세요 > ");
		int year1 = sc.nextInt(), year2 = sc.nextInt();
		int age = year1 - year2 ;
		System.out.println("만 "+age+"세 입니다.");
		System.out.printf("한국 나이 만 %d세 입니다.", age);
	}
	
	
	
}
