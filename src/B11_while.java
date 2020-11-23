import java.util.Scanner;

public class B11_while {
	public static void main(String[] args) {
		/*
		 * # while - for���� ������ �ణ �ٸ� �ݺ��� - �ʱⰪ�� ���Ⱚ�� ��ġ�� ������ ���� �ʴ�. - �������� ��ġ�� ���� �ݺ���
		 * ����� �޶��� �� �ִ�. - ()���� ������ ���� ���� {}���� ������ �ݺ��Ѵ�.
		 */
		// # while���� ���� �⺻���� ����

		int i = 0;
		while (i++ < 10) {
			System.out.println("hello,world" + i);
		}

		int j = 0;
		for (; j++ < 10;) {
			System.out.println("hello,world" + j);
		}

		// # while���� ����ϰԲ� ����� Ŭ������
		// - has, next���� ���ľ ���� �Լ�(�޼���)�� ������ �ִ�.
		// - ex : Scanner

		// System.in : �ܼ��� ���� �Է��� �ϴ� ��� (inputStream)

		// �� System.in ��� ���ڿ��� ���� ��ĳ�ʿ� �Է�
		Scanner sc1 = new Scanner("apple banana orange");
		Scanner sc2 = new Scanner("dog cat rat bird");

		// sc1�� ���� ������ �ִ� ���� ���
		while (sc1.hasNext()) {
			System.out.print(sc1.next());
		}
		while (sc2.hasNext()) {
			System.out.print(sc2.next());
		}

		// # while���� ���� ���α׷� �����ϱ�
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. ����ϱ�");
			System.out.println("2. �����ϱ�");
			System.out.println("> ");
			int cmd = sc.nextInt();

			switch (cmd) {
			case 1:
				System.out.println("����մϴ�.");
				break;
			case 2:
				System.out.println("�����մϴ�.");
				System.exit(0);
				break;
			default:
				System.out.println("�ùٸ� ������ �ƴմϴ�.");
				break;
			}
		}
	}
}
