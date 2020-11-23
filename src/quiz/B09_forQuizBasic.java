package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {
	/*
	 * 사용자가 숫자를 입력했을 때
	 * 1. 10부터 입력한 숫자까지의 총 합을 구하기
	 * 2. 1부터 입력한 숫자 사이의 3의 배수만 모두 출력
	 * 	  총 몇 개 인지도 출력
	 * 3. 
	 */
	public static void main(String[] args) {
		
		// 해설
		//1.  
		System.out.println(" 입력 : ");
		int user = new Scanner(System.in).nextInt();
		
		int start =10;
		int end = user;
		
		if(start > end) {   	// 값 바꾸기
			int temp = start;
			start = end;
			end = temp;
		}
		
		int sum =0;
		for (int i = start ; i <= end; i++) {
			System.out.println(i);
			sum +=i;
		}
		System.out.println("총 합" + sum);
		System.out.println("--------------");
		
		//2. 
		int start2 = 1;
		int end2 = user;
		
		if (start2>end2) {
			int temp = start2;
			start2 = end2;
			end2 = temp;
		}
		int count = 0;
		for (int i = start2; i < end2; i++) {
			if(i%3==0) {
			System.out.println(i + " ");
			count ++;
			}
		}
		System.out.println(count+"개");
		
		
		
//		내 답
//		//1. 
//		int num, sum=0; 
//		System.out.println("1번 입력 : ");
//		num = new Scanner(System.in).nextInt();
//
//		if(num>=10) {
//			for (int i = 10; i <= num ; i++) 
//				sum+=i;
//		}
//		else{
//			for (int i = 10; i >= num ; i--) 
//				sum+=i;
//		}
//		System.out.println("총합" + sum);
//
//		//2.
//		System.out.println("2번 입력 : ");
//		int count=0;
//
//		if(num>=1) {
//			for (int i = 1; i <= num ; i++) {
//				if (i%3!=0)
//					continue;
//				System.out.println(i);
//				count++;
//			}
//		}
//
//		else{
//			for (int i = 1; i >= num ; i--) {
//				if (i%3!=0)
//					continue;
//				System.out.println(i);
//				count++;
//			}
//		}
//		System.out.println("총"+count+"개");
//			





	}
}
