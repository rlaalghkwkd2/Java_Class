package quiz;

import java.util.Scanner;

public class B05_CheckWord {
	/*
	 * ����ڷ� ���� �ܾ �ϳ� �Է� �ް�,
	 * ù ��° ���� ������ ���ڰ� ��ġ�ϸ� "OK"�� ���
	 * �ƴ϶�� "NOT OK"�� ����غ�����.
	 * 
	 * 
	 * */

	public static void main(String[] args) {
// 		�ؼ�
		String word = "";
		//null : �ƹ� ���� ���� ����.
		if (word == null || word == "") {
			System.out.println("�ܾ �ùٸ��� �ʽ��ϴ�.");
			return;
		}
		char first_letter = word.charAt(0);
		char last_letter = word.charAt(word.length()-1);
		
		if (first_letter == last_letter	)
			System.out.println("OK");
		else
			System.out.println("NOT OK");
		
//		�� ��
//		System.out.println("�ƹ��ų� �Է��غ�����");
//		String ch = new Scanner(System.in).next();
//		int chlen = ch.length();
//
//		if (ch.charAt(0)==ch.charAt(chlen-1)) 
//			System.out.println("OK");
//		else 
//			System.out.println("NOT OK");
	}
}
