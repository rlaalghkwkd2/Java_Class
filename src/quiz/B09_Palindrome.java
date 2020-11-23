package quiz;

import java.util.Scanner;

public class B09_Palindrome {

	/*
	 * 사용자로 부터 단어를 하나 입력 받고,
	 * 해당 단어가 회문이라면 "PALINDROME"를 출력
	 * 해당 단어가 회문이 아니라면 "NOT PALINDROME"를 출력
	 * 
	 * ※ 회문이란
	 *   - ABBA, MADAM,BORROWORROB 처럼 좌우 대칭인 단어
	 */

	public static void main(String[] args) {
		// # StringBuilder.reberse()
		// - 여탞지 빌드한 문자열을 거꾸로 뒤집어 준다.
		System.out.println("아무거나 입력해보세요");
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



		// 해설
		System.out.println("아무거나 입력해보세요");
		String pal = new Scanner(System.in).nextLine();
		int palen = pal.length()-1;
		String result = "PALINDROME";





		// 내 답
		for (int  i= 0;  i<= (palen+1)/2; i++) {
			if (pal.charAt(i) != pal.charAt(palen-i)){
				result = "NOT PALINDROME";
				break;
			}
		}
		System.out.println(result);

	}




}





