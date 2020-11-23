// 	ctrl + [+,-] : 글자 크기 조절
// 	ctrl + M : 현재 창 크기 최대/최소화
// 	ctrl + z : 방금 한일 취소하기 뒤로가기
// 	ctrl + y : 방금 취소한 일 취소하기 앞으로
//  ctrl + / : 드레그 주석 처리
//	Sysout 적은 뒤 Ctrl + Space : 자동 완성
//  Alt  + 방향키 : 줄이동 가능
//  ctrl + shift + w : 모든 창 닫기
//  ctrl + Shift + o : 자동 import
//  ctrl + Shift + f : 전체 행렬 정리 

// # 블록 지정 관련 단축키
// 	ctrl + a : 전체 드레그
// 	shift + 방향키 : 방향키를 이용해 블록지정
// 	shift + Home/end : 커서 위치 부터 줄의 맨 앞, 맨 뒤까지 블록 지정

// 	tap : 들여쓰기
// 	shift + tab : 거꾸로 들여쓰기

// # 주석 (Comment)
// - 프로그래머가 하고 싶은 말을 메모해두는 것.
// - 주석은 프로그램 실행에 영향을 미치지 않는다.

// 한줄 주석

/* 여러줄 주석 */

/**
 문서화 주석(이클립스가 이 설명을 읽어준다.)
 */

// public class의 이름은 반드시 파일명과 같아야 한다.
public class A00_Hello {
	// 빨간 줄이 생겼을 때 그곳에 커서를 두고 F2를 누르면
	// 해당 에러에 대한 정보와 해결책을 볼 수 있다.

	// # main()함수
	// - 프로그램의 시작 지점
	// - 프로그램을 시작하면 가장 먼저 main()함수를 찾아서 실행시킨다.
	// - main()함수의 범위는 중괄호로 결정된다.
	public static void main(String[] args) {
		// 프로그램의 시작 지점

		// # System.out.println()함수
		// - ()안에 전달한 데이터를 콘솔에 출력하는 함수

		// # 함수란?
		// - 어떤 단어 뒤에 ()과 붙어 있는 것은 모두 함수다.

		// # 콘솔이란?
		// - Eclipse에서는 테스트용으로 하햔 바탕의 콘솔을 제공하는 것 뿐이다.
		// - 실제로 우리가 작성한 프로그램을 검은 화면에서 실행하면 검은 화면에 출력된다.

		System.out.println("Hello, world!"); //Ctrl + F11
		System.out.println("Apple");
		System.out.println("Melon");
		System.out.println();

		System.out.println("┌───────────────────────────┐");
		System.out.println();
		System.out.println("	1. Start Game");
		System.out.println("	2. Exit");
		System.out.println();
		System.out.println("└───────────────────────────┘");
		System.out.println();

		// # 자바의 데이터들

		// 1. "" 사이에 적는 것 : 문자열 (string)
		System.out.println("ABCDEFG가나다라마바사");
		System.out.println("안녕하세요~~~!\n");
		System.out.println();

		// 2. 그냥 숫자 : 정수 (int, Integer)
		System.out.println(123);
		System.out.println(123456);
		System.out.println(123+2);
		System.out.println(123*2);
		System.out.println();

		// 3. 소수 : 실수(Double, Float)
		System.out.println(123.1234567); //안붙이면 double
		System.out.println(123.123456f); //f를 붙이면 float
		System.out.println();

		// 4. ''사이에 적는 것 : 문자 (Character), 문자 단 하나
		// ※ 작은 따옴표에는 문자를 여러개 넣으면 에러가 발생한다.
		System.out.println('o');
		System.out.println('X');
		System.out.println('家');
		System.out.println('한');
		System.out.println('＆');
		System.out.println();

		// # 문자가 실제로 가지고 있는 숫자값 보기
		System.out.println("家의 코드값 : " + (int)'家');
		System.out.println("$의 코드값 : " + (int)'$');
		System.out.println("가의 코드값 : " + (int)'가');
		System.out.println();

		// # 코드값으로 문자 출력 하기
		System.out.println("23478의 문자값 : " + (char)23478);
		System.out.println("36의 문자값 : " + (char)36);
		System.out.println("44032의 문자값 : " + (char)44032);
		System.out.println();

		// ※다른 타입 + 정수가 가능하다.
		// 1. 문자열 + 정수는 이어붙인 문자열이 된다.
		System.out.println("123" + 456);
		System.out.println("문자열 : " + 456);
		System.out.println();

		// 2. 실수 + 정수는 실수가 된다.
		System.out.println(1236.56 + 30);
		System.out.println();

		//3. 문자 + 정수는 ???
		System.out.println('한'+90);
		System.out.println();

		// ; (세미콜론) : 한 명령어가 끝났음을 알린다.


		// 프로그램의 끝
	}

}



















