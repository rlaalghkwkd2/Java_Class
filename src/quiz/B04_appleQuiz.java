package quiz;

import java.util.Scanner;

public class B04_appleQuiz {
	

		// 사과를 10개씩 담을 수 있는 바구니가 있을 때
		// 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한 
		// 바구니의 개수를 출력.
		// 10의 배수, 0 , 음수, 양수, 잘못된 값
	public static void main(String[] args) {
		// 변수 앞에 final : 수정이 불가능한 변수가 된다.

		
//		해설
		final double BASKET_SIZE = 10;
		Scanner scn = new Scanner(System.in);
		System.out.print("사과 >");
		int appleCount = scn.nextInt();
		
		if (appleCount<0)
			System.out.println("0이상의 숫자를 입력해야 합니다.");
		else {
			int needBasket = (int)Math.ceil(appleCount / BASKET_SIZE);
			System.out.printf("필요한 바구니는 %d개 입니다.\n",needBasket);
		}
		System.out.println("프로그램을 종료합니다.");
			
//		내 답
//		System.out.print("사과 : ");
//		Scanner scn = new Scanner(System.in);
//		int apple = scn.nextInt();
//		int sapple = apple/10+1;
//		if (apple<=0){
//			System.out.println("사과바구니가 필요없습니다.");}
//		else if (apple%10==0) {
//			System.out.printf("사과바구니 %d개\n",sapple-1);}
//		else if (sapple >= 1) {
//			System.out.printf("사과바구니 %d개\n",sapple);}
//		else {
//			System.out.println("잘못 입력 하셨습니다.");
//		}


	}
}
