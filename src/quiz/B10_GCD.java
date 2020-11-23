package quiz;

import java.nio.CharBuffer;
import java.util.Scanner;

public class B10_GCD {
	public static void main(String[] args) {
		// �� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����.
		// �� �ִ����� : �μ����� ����� �� ���� ū �����

		// ��Ŭ���� ȣ����
		/*
		 * 1. ������ �� �ڿ��� a, b�� �־����� ��, �� �� ū ���� a��� ����
		 * 
		 * 2. a�� b�� ���� �������� n�̶�� �ϸ� (a%b=n) 
		 *    n�� 0�϶�, b�� �ִ� �����(GCD)�Դϴ�.
		 * 
		 * 3. ���� n�� 0�� �ƴ϶��, a�� b���� �ٽ� �ְ� 
		 *    b�� n�� ���� �� �� �ٽ� 2. �� ������ �ݺ�
		 *    
		 *    int a,b;
		 *    
		 *    a�� ū��
		 *    
		 *    n=a%b
		 *    if (n==0) 
		 *    gcd=b;
		 *    
		 *    esle 
		 *    a=b
		 *    b=n
		 *    
		 *    n=a%b �ݺ�
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
		System.out.println("�ִ� ������� " + a);

//		
//		// �ؼ�		
//		// ���� ���� ��� ����
//
//		System.out.print("ù��° ���� �Է� : ");
//		int user = new Scanner(System.in).nextInt();
//		System.out.print("�ι�° ���� �Է� : ");
//		int user2 = new Scanner(System.in).nextInt();
//
//		StringBuilder user_gcd = new StringBuilder();
//		StringBuilder user2_gcd = new StringBuilder();
//		int num1 = user;
//		int num2 = user2;
//		// num1�� �� ũ�� ���� �ٲ۴�.
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
//		System.out.printf("'%d'�� '%d'�� �ִ������� '%d'�Դϴ�.\n",num1,num2,gcd);
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
