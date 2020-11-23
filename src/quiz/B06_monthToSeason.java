package quiz;

import java.util.Scanner;

public class B06_monthToSeason {
/*
 * switch-case문을 이용
 * 사용자로부터 달을 입력 받아 해당하는 계절을 출력.
 */
	public static void main(String[] args) {
		
		System.out.print("月 입력 : ");
		int month = new Scanner(System.in).nextInt();
		switch (month) {
		case 3 :case 4 :case 5 :
			System.out.printf("%d월은 봄",month);
			break;
		case 6 :case 7 :case 8 :
			System.out.printf("%d월은 여름",month);
			break;
		case 9 :case 10 :case 11 :
			System.out.printf("%d월은 가을",month);
			break;
		case 12 :case 1 :case 2 :
			System.out.printf("%d월은 겨울",month);
			break;
		default:
			System.out.println("해당하는 달이 없습니다.");
			break;
		}
		
	}
	
	
	
}
