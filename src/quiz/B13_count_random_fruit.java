package quiz;

import java.util.Arrays;

public class B13_count_random_fruit {
	public static void main(String[] args) {

		// 1. 크기 100의 배열에 랜덤 과일 문자열을 저장해보시오.
		// 등장 하는 과일 : apple, banana, orange, peach, kiwi

		// 2. 각 과일이 몇번 등장했는지 모두 기록하고 출력해보시오.

		// 해설
		int size = 7;
		int fruit_kind;
		String[] fruitBox = new String[size];
		String[] fruitNames = { "apple", "banana", "orange", "peach", "kiwi" };
		fruit_kind = fruitNames.length;
		
		for (int i = 0; i < size; i++) {
			fruitBox[i] = fruitNames[(int) (Math.random() * 5)];
		}
		System.out.println(Arrays.toString(fruitBox));

		// fruit box 배열에 저장되어 각 과일이 몇번 등장했는지 모두 세어보세요.
		
		int[] count = new int[5];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < fruit_kind; j++) {
				if (fruitBox[i] == fruitNames[j]) { 
					// fruitNames[j].equals(fruitBox[i]);
					count[j]++;
					break;
				}
			}
		}
		// 집계가 끝난 후 count를 출력해야 한다.
		for (int i = 0; i < count.length; i++) {
			System.out.printf("%s : %d회 \n", fruitNames[i], count[i]);
		}

		// # enum의 시조
		int apple = 0;
		int banana = 1;
		int orange = 2;
		
		System.out.println("오렌지 번호 : "+orange);
		System.out.println("오렌지 횟수 : "+count[orange]);
		System.out.println("오렌지 이름 : "+fruitNames[orange]);
		
		
		
		// 강사님이 수정해주신 값
//		String[] fruit = new String[100];
//		String[] abo = { "apple", "banana", "orange", "peach", "kiwi" };
//		int[] count1 = new int[5];
//
//		for (int i = 0; i < 100; i++) {
//			int rannum = (int) (Math.random() * 5);
//			fruit[i] = abo[rannum];
//			count1[rannum]++;
//		}
//		System.out.println(Arrays.toString(fruit));
//		System.out.println("");
//		for (int i = 0; i < 5; i++) {
//			if (count1[i] > 0) {
//				System.out.printf("%s : %d번입니다.\n", abo[i], count1[i]);
//			}
//		}

//		String[] fruit = new String[100];
//		String[] abo = { "apple", "banana", "orange", "peach", "kiwi" };
//		int[] count = new int[5];
//
//		for (int i = 0; i < 100; i++) {
//			fruit[i] = abo[(int) (Math.random() * 5)];
//			for (int j = 0; j < abo.length; j++) {
//				String str = abo[j];
//				if (str == fruit[i])
//					count[j] ++;
//			}
//		}
//		System.out.println(Arrays.toString(fruit));
//		System.out.println("");
//		for (int i = 0; i < 5; i++) {
//			if (count[i] > 0) {
//				System.out.printf("%s : %d번입니다.\n", abo[i], count[i]);
//			}
//		}
	}
}
