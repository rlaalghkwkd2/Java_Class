package quiz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_OnlPhoneNumber {

	// ����ڷκ��� ��ȭ��ȣ�� �Է� �޾� ����غ��ÿ�.
	// ��ȭ��ȣ ���°� �ƴ� ��� �����޼����� ��� �� �ٽ� �Է��ؾ� �Ѵ�.

	public static void main(String[] args) {
		
		String regex = "01[01679]-[\\d]{3,4}-[\\d]{4}";
		while (true) {
			System.out.print("��ȭ��ȣ�� �Է� �Ͻÿ�\n>> ");
			String phonenumber = new Scanner(System.in).next();

			if(Pattern.matches(regex,phonenumber)) {
				System.out.println("�Է� �Ͻ� ��ȭ��ȣ�� : " + phonenumber);
				break;
			}
			else {
				System.err.print("�߸��� ��ȭ��ȣ �Դϴ�.\n");
			}
		}

	}

}
