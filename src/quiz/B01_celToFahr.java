package quiz;

import java.util.Scanner;

public class B01_celToFahr {
	// ����ڷκ��� ���� �µ��� �Է¹�����
	// ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������.
	// (��ȯ ������ �˾Ƽ� �˻�, ����� �Ҽ� ù° �ڸ�����)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ɸ� �Է� > ");
		int cel = sc.nextInt();
		double fahr = (cel*1.8)+32;
		
		System.out.printf("ȭ�� �µ� : %.1f��\n",fahr);	
		
	}
}
