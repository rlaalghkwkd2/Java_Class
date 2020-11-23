
public class D09_argument {
	// Eclipse에서 argument 테스트하기

	// 1. 해당 파일 우클릭
	// 2. Run and Debug -> Edit
	// 3. Arguments에 원하는 값(-a -l) 추가
	
	// 실행
	// 받은 실행 옵션 : 2
	// 0번째 프로그램 실행 옵션 : -a
	// 1번째 프로그램 실행 옵션 : -l

	public static void main(String[] args) {

		System.out.println("받은 실행 옵션 : " + args.length);

		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "번째 프로그램 실행 옵션 : " + args[i]);
		}

	}
}
