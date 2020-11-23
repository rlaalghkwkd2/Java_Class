package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {

	public static void main(String[] args) {

		// # 31������ �����ÿ�
		// 1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����Ѵ�. (1,2,3)

		// 2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�.

		// 3. �������� 31�� �θ��� ��� Ȥ�� ��ǻ�Ͱ� �й��Ѵ�.

		// ���� �� :

		// ��ǻ�� > 2
		// ���� ���� : 2
		// ��� > 3
		// ���� ���� : 5
		// ...
		// ��ǻ�� > 3
		// ���� ���� : 31 �̻�
		// ��ǻ���� �й� �Դϴ�.

		// �ؼ�
		Scanner user = new Scanner(System.in);
		Random ran = new Random();

		int game_num = 0;

		boolean computer_turn = ran.nextBoolean();

		System.out.printf("<%s>�� �����Դϴ�.\n", computer_turn ? "��ǻ��" : "���");

		while (true) {
// �Է� �κ�
			
			int num;
			if (computer_turn) {
				
				//��ǻ�Ͱ� game_num�� �� ��
				// 2, 6, 10, 14, 18, 22, 26, 30�� ����� ������ �̱�
				if(game_num % 4 == 0) {
					num = 2;
				}
				else if(game_num%4==3) {
					num = 3;
				}
				else if(game_num%4==1) {
					num = 1;
				}
				else
					num = ran.nextInt(3)+1;
				
//				num = ran.nextInt(3) + 1;
				System.out.println("��ǻ�� : " + num);
			} 
			else {
				System.out.print("����� : ");
				num = user.nextInt();
				if (num > 3 || num < 1) {
					System.out.println("1~3�� �Է� �ؾ� �մϴ�.");
					continue;
				}
			}
// ó�� �κ�
			
			game_num += num;
// ��� �κ�
			if (game_num >= 31) {
				System.out.println("\t  ���� ��Ȳ : " + game_num);
				break;
			}
			System.out.println("\t  ���� ��Ȳ : " + game_num);
			computer_turn = !computer_turn;
		}
		System.out.printf("<%s>�� �¸�!\n", computer_turn ? "�����" : "��ǻ��");

		
		
		
		
		
		
		
		
		
		
		
//
//		int games = 31;
//		Scanner sc = new Scanner(System.in);
//		Random ran = new Random();
//		int i = 0;
//		if (i == 0)
//			System.out.println("==== ���� ���� ====");
//		int result = 0;
//		int start = ran.nextInt(2);
//// ��ǻ�� ����
//		if (start == 0) {
//			System.out.println("<< ��ǻ�� ���� >>");
//			int com = (int) (Math.random() * 3 + 1);
//			result += com;
//			System.out.println("��ǻ�� : " + com);
//			System.out.println();
//			System.out.println("** ���� ���� : " + result + " **");
//			System.out.println();
//		}
//
//		while (true) {
//// ����� ����
//			System.out.println("<< ����� ���� >>");
//			System.out.print("����� : ");
//			int user = sc.nextInt();
//			if (user > 0 && user < 4) {
//				result += user;
//				if (result >= 31) {
//					System.out.println("�й�.. ����� ��!");
//					break;
//				}
//				System.out.println("** ���� ���� : " + result + " **");
//				System.out.println();
//			}
//
//// ����� ���� ���� ��
//			else {
//				System.out.println("'1', '2', '3' ���ڸ� �Է� �ϼ���.");
//				System.out.println();
//				continue;
//			}
//			if (result >= 31) {
//				System.out.println("�й�.. ��ǻ�� ��!");
//				break;
//			}
//// ��ǻ�� ����
//			System.out.println("<< ��ǻ�� ���� >>");
//			int com = (int) (Math.random() * 3 + 1);
//			result += com;
//			System.out.println("��ǻ�� : " + com);
//			if (result >= 31) {
//				System.out.println("�й�.. ����� ��!");
//				break;
//			}
//			System.out.println("** ���� ���� : " + result + " **");
//			System.out.println();
//		}
	}
}