package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {
	// ������ �Է� ������ �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����.

	// 90�� �̻�	: A���
	// 80�� �̻�	: B���
	// 70�� �̻�	: C���
	// 60�� �̻�	: D���
	// �� ��   	: F���

	// �� ������ 0������ 100������

	public static void main(String[] args) {

		//		�ؼ�
		System.out.print("���� �Է�(0-100) :");
		int score = new Scanner(System.in).nextInt();
		char grade = 0;

		if (score>100 || score<0) {
			System.out.println("�߸� �Է� �߽��ϴ�.");
			grade = 'F';
			return; //main()
		}
		if (score>=90)
			grade = 'A';
		else if (score>=80)
			grade = 'B';
		else if (score>=70)
			grade = 'C';
		else if (score>=60)
			grade = 'D';


		System.out.printf("����� ���� : %d\n���",grade);
		System.out.println("���α׷� ����");

	}
}



// 			�� ��		
//			System.out.print("���� �Է�(0-100) :");
//			int score = new Scanner(System.in).nextInt();
//			if (score>100 || score<0) {
//				System.out.println("�߸� �Է� �߽��ϴ�.");
////				return; //main()�� ������.
//				System.exit(0);} // ���α׷��� �����Ѵ�.
//			else if (score>=90)
//				System.out.println("A���");
//			else if (score>=80)
//				System.out.println("B���");
//			else if (score>=70)
//				System.out.println("C���");
//			else if (score>=60)
//				System.out.println("D���");
//			else
//				System.out.println("F���");




