package quiz;

import java.util.Scanner;

public class B09_printReverse {
	public static void main(String[] args) {
		// # ���� �������� ���ڿ��� ���� �ϼ���ų �� �ִ�(������)
		// String str = "hello';
		// str +=", world!";
		
		// # StringBuilder�� += ��� append()�Լ��� ���� ���ڿ��� �����
		StringBuilder str = new StringBuilder("hello");
		str.append(", world!");
		
		// �� ����� �� �ڿ� String���� ��ȯ�ؼ� ����ϸ� �ȴ�.
		String build_result = str.toString();
		System.out.println(build_result);

		// ����ڰ� ������ �Է��ϸ� �� ������ "�Ųٷ� ���"
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է� �Ͻÿ� : ");
		String str1 = sc.next();
		int strlen = str1.length()-1;

		for (int i = strlen; i >= 0; i--) {
			System.out.print(str1.charAt(i));
			
			 
		}
	}
}
