package quiz;

import java.util.Scanner;

public class B04_appleQuiz {
	

		// ����� 10���� ���� �� �ִ� �ٱ��ϰ� ���� ��
		// ����� ������ �Է��ϸ� ����� ��� ��� ���� �ʿ��� 
		// �ٱ����� ������ ���.
		// 10�� ���, 0 , ����, ���, �߸��� ��
	public static void main(String[] args) {
		// ���� �տ� final : ������ �Ұ����� ������ �ȴ�.

		
//		�ؼ�
		final double BASKET_SIZE = 10;
		Scanner scn = new Scanner(System.in);
		System.out.print("��� >");
		int appleCount = scn.nextInt();
		
		if (appleCount<0)
			System.out.println("0�̻��� ���ڸ� �Է��ؾ� �մϴ�.");
		else {
			int needBasket = (int)Math.ceil(appleCount / BASKET_SIZE);
			System.out.printf("�ʿ��� �ٱ��ϴ� %d�� �Դϴ�.\n",needBasket);
		}
		System.out.println("���α׷��� �����մϴ�.");
			
//		�� ��
//		System.out.print("��� : ");
//		Scanner scn = new Scanner(System.in);
//		int apple = scn.nextInt();
//		int sapple = apple/10+1;
//		if (apple<=0){
//			System.out.println("����ٱ��ϰ� �ʿ�����ϴ�.");}
//		else if (apple%10==0) {
//			System.out.printf("����ٱ��� %d��\n",sapple-1);}
//		else if (sapple >= 1) {
//			System.out.printf("����ٱ��� %d��\n",sapple);}
//		else {
//			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
//		}


	}
}
