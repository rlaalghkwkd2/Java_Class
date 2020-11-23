package quiz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_OnlPhoneNumber {

	// 사용자로부터 전화번호만 입력 받아 출력해보시오.
	// 전화번호 형태가 아닐 경우 에러메세지를 출력 후 다시 입력해야 한다.

	public static void main(String[] args) {
		
		String regex = "01[01679]-[\\d]{3,4}-[\\d]{4}";
		while (true) {
			System.out.print("전화번호를 입력 하시오\n>> ");
			String phonenumber = new Scanner(System.in).next();

			if(Pattern.matches(regex,phonenumber)) {
				System.out.println("입력 하신 전화번호는 : " + phonenumber);
				break;
			}
			else {
				System.err.print("잘못된 전화번호 입니다.\n");
			}
		}

	}

}
