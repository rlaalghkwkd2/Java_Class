package quiz;

import java.nio.CharBuffer;
import java.util.Scanner;

public class B10_GCD {
	public static void main(String[] args) {
		// 두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요.
		// ※ 최대공약수 : 두숫자의 공약수 중 가장 큰 공약수

		// 유클리드 호제법
		/*
		 * 1. 임의의 두 자연수 a, b가 주어졌을 때, 둘 중 큰 값이 a라고 가정
		 * 
		 * 2. a를 b로 나눈 나머지를 n이라고 하면 (a%b=n) 
		 *    n이 0일때, b가 최대 공약수(GCD)입니다.
		 * 
		 * 3. 만약 n이 0이 아니라면, a에 b값을 다시 넣고 
		 *    b에 n을 대입 한 후 다시 2. 의 과정을 반복
		 *    
		 *    int a,b;
		 *    
		 *    a가 큰값
		 *    
		 *    n=a%b
		 *    if (n==0) 
		 *    gcd=b;
		 *    
		 *    esle 
		 *    a=b
		 *    b=n
		 *    
		 *    n=a%b 반복
		 *    
		 */

		int a = 100;
		int b = 50;

		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}

		int n = -1;
		for (; n != 0;) {
			n = a % b;
			a = b;
			b = n;
		}
		System.out.println("최대 공약수는 " + a);

//		
//		// 해설		
//		// 작은 수의 약수 먼저
//
//		System.out.print("첫번째 정수 입력 : ");
//		int user = new Scanner(System.in).nextInt();
//		System.out.print("두번째 정수 입력 : ");
//		int user2 = new Scanner(System.in).nextInt();
//
//		StringBuilder user_gcd = new StringBuilder();
//		StringBuilder user2_gcd = new StringBuilder();
//		int num1 = user;
//		int num2 = user2;
//		// num1이 더 크면 값을 바꾼다.
//		if (num1 > num2) {
//			int tmp = num1;
//			num1 = num2;
//			num2 = tmp;
//		}
//
//		int gcd = 1;
//		for (int i = num1; i > 0; i--) {
//			if (num1 % i == 0 && num2 % i == 0) {
//				gcd = i;
//				break;
//			}
//		}
//		System.out.printf("'%d'과 '%d'의 최대공약수는 '%d'입니다.\n",num1,num2,gcd);
//
//		
//		
//		for (int i = 1; i<= (int)(Math.min(user, user2)); i++) {
//			for (int j = 1; j <= (int)(Math.min(user, user2)); j++) {
//				if(i * j == user) {
//					System.out.println(i);
//				}
//			}
//		}

//		for (int i = 1; true; i++) {
//			int j,k;
//			for (j = 1; j <= user; j++) {
//				if (j * i == user) {
//					System.out.println(j);
//					user_gcd.append(j + ",");
//				}
//			}
//			for (k = 1; k <= user2; k++) {
//				if (k * i == user2) {
//					System.out.println(k);
//					user2_gcd.append(k + ",");
//				}
//			}
//
//		}

	}
}
