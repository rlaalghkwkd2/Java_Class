package quiz;

import java.util.Scanner;

public class B01_wonToDollar {
	// 한국 돈을 입력하면
	// 달러 구매시 얼마를 받게 되는지 계산해주는 프로그램을 만들어 보세요.
	// (환율은 검색, 소수 둘째 자리까지 출력, 환전 수수료 1.75%)
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
		System.out.print("한국 돈 입력 : ");
		
		int won = sc.nextInt();
		// 환전 수수료
		double ex_fee_rate = 0.0175;
		// 수수료 적용 전
		double dollar = won/1139.10;
		double ex_fee = dollar * ex_fee_rate;
		// 수수료 적용 후
		dollar = dollar - ex_fee;
		System.out.printf("%d원으로 %.2f달러를 구매했습니다.\n",won,dollar);
		System.out.printf("(수수료 : %.2f 달러)\n", ex_fee);
	
	
}



}
