import java.util.Scanner;

public class B05_charAt {
	public static void main(String[] args) {

		// # "문자열".charAt(index)
		//  - 문자열에서 원하는 (index)번째의 문자를 꺼내는 함수
		//  - 이 함수의 실행 결과는 char 타입이다.(반환 타입이 char타입이다.)
		//  - 첫 번째 문자가 0번 인덱스이다.

		// # "문자열".length()
		//  - 문자열이 몇 글자로 이루어져있는지를 알려준다.
		//  - 반환 타입 int

		//  - Math.round() - 반환 타입
		Scanner sc = new Scanner(System.in);

		System.out.println("아무거나 입력해보세요");
		String word = sc.next();
		// nextLine 스페이스도 하나의 문자로 인식
		
		char a = word.charAt(0);
		System.out.println(a);

		System.out.println(word);
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		if(word.length() >= 5)
			System.out.println(word.charAt(4)); // 인덱스 4까지 없는 경우 에러
		else
			System.out.println("해당 단어의 길이가 5보다 짧습니다.");



	}
}