package quiz;

import java.util.Scanner;

public class B09_Palindrome {

	/*
	 * ����ڷ� ���� �ܾ �ϳ� �Է� �ް�,
	 * �ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
	 * �ش� �ܾ ȸ���� �ƴ϶�� "NOT PALINDROME"�� ���
	 * 
	 * �� ȸ���̶�
	 *   - ABBA, MADAM,BORROWORROB ó�� �¿� ��Ī�� �ܾ�
	 */

	public static void main(String[] args) {
		// # StringBuilder.reberse()
		// - ������ ������ ���ڿ��� �Ųٷ� ������ �ش�.
		System.out.println("�ƹ��ų� �Է��غ�����");
		String word = new Scanner(System.in).nextLine();
		StringBuilder strb = new StringBuilder(word);
		String reverse = strb.reverse().toString();
		System.out.println(reverse);

		int half = word.length()/2;
		boolean palin = true;

		for (int i = 0; i < half; i++) {
			if(word.charAt(i)!=reverse.charAt(i)) {
				palin = false;
				break;
			}
		}
		System.out.println(palin?"PALINDROME":"NOT PALINDROME");



		// �ؼ�
		System.out.println("�ƹ��ų� �Է��غ�����");
		String pal = new Scanner(System.in).nextLine();
		int palen = pal.length()-1;
		String result = "PALINDROME";





		// �� ��
		for (int  i= 0;  i<= (palen+1)/2; i++) {
			if (pal.charAt(i) != pal.charAt(palen-i)){
				result = "NOT PALINDROME";
				break;
			}
		}
		System.out.println(result);

	}




}





