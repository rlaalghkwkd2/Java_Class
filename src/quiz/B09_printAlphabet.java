package quiz;

public class B09_printAlphabet {
	public static void main(String[] args) {

		int start = 'A';
		int end = 'Z';
		int tmp = 0;

		for (int i = start-1; i < end;) {
			if (i >= end) {
				tmp = start+32;
				start = end+32;
				end = tmp;
				i--;
				System.out.println((char)i+" ");
			}
			i++;
			System.out.println((char)i+" ");
		}





		// 해설
		// 1. 반복문을 이용하여 A부터 Z까지 출력해보시오.
		//		for (char ch = start; ch <= end; ch++) {
		//			System.out.print(ch+" ");
		//		}
		//
		//		System.out.println();
		//
		//		// 2. 반복문을 이용하여 z부터 a까지 출력해보시오.
		//		for (char ch = 'z'; ch >= 'a'; ch--) {
		//			System.out.print(ch+" ");
		//		}


		// 내 답
		//		// 1. 반복문을 이용하여 A부터 Z까지 출력해보시오.
		//		for (int i = 'A'; i <= 'Z'; i++) {
		//			System.out.print((char)i+" ");
		//			if 
		//		}
		//
		//		System.out.println();
		//
		//		// 2. 반복문을 이용하여 z부터 a까지 출력해보시오.
		//		for (int i = 'z'; i >= 'a'; i--) {
		//			System.out.print((char)i+" ");
		//		}








	}
}
