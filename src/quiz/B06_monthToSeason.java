package quiz;

import java.util.Scanner;

public class B06_monthToSeason {
/*
 * switch-case���� �̿�
 * ����ڷκ��� ���� �Է� �޾� �ش��ϴ� ������ ���.
 */
	public static void main(String[] args) {
		
		System.out.print("�� �Է� : ");
		int month = new Scanner(System.in).nextInt();
		switch (month) {
		case 3 :case 4 :case 5 :
			System.out.printf("%d���� ��",month);
			break;
		case 6 :case 7 :case 8 :
			System.out.printf("%d���� ����",month);
			break;
		case 9 :case 10 :case 11 :
			System.out.printf("%d���� ����",month);
			break;
		case 12 :case 1 :case 2 :
			System.out.printf("%d���� �ܿ�",month);
			break;
		default:
			System.out.println("�ش��ϴ� ���� �����ϴ�.");
			break;
		}
		
	}
	
	
	
}
