package quiz;

import java.util.Scanner;

public class B01_GuessAge {
	// ����ڷ� ���� ������ �⵵�� ���̸� �Է¹�����
	// �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �⵵�� �¾ �⵵�� �Է� �ϼ��� > ");
		int year1 = sc.nextInt(), year2 = sc.nextInt();
		int age = year1 - year2 ;
		System.out.println("�� "+age+"�� �Դϴ�.");
		System.out.printf("�ѱ� ���� �� %d�� �Դϴ�.", age);
	}
	
	
	
}
