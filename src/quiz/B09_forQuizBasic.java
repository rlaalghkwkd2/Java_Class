package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {
	/*
	 * ����ڰ� ���ڸ� �Է����� ��
	 * 1. 10���� �Է��� ���ڱ����� �� ���� ���ϱ�
	 * 2. 1���� �Է��� ���� ������ 3�� ����� ��� ���
	 * 	  �� �� �� ������ ���
	 * 3. 
	 */
	public static void main(String[] args) {
		
		// �ؼ�
		//1.  
		System.out.println(" �Է� : ");
		int user = new Scanner(System.in).nextInt();
		
		int start =10;
		int end = user;
		
		if(start > end) {   	// �� �ٲٱ�
			int temp = start;
			start = end;
			end = temp;
		}
		
		int sum =0;
		for (int i = start ; i <= end; i++) {
			System.out.println(i);
			sum +=i;
		}
		System.out.println("�� ��" + sum);
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
		System.out.println(count+"��");
		
		
		
//		�� ��
//		//1. 
//		int num, sum=0; 
//		System.out.println("1�� �Է� : ");
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
//		System.out.println("����" + sum);
//
//		//2.
//		System.out.println("2�� �Է� : ");
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
//		System.out.println("��"+count+"��");
//			





	}
}
