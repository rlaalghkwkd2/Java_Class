package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {
	// 점수를 입력 받으면 해당하는 등급을 출력해주는 프로그램을 작성해보세요.

	// 90점 이상	: A등급
	// 80점 이상	: B등급
	// 70점 이상	: C등급
	// 60점 이상	: D등급
	// 그 외   	: F등급

	// ※ 점수는 0점부터 100점까지

	public static void main(String[] args) {

		//		해설
		System.out.print("점수 입력(0-100) :");
		int score = new Scanner(System.in).nextInt();
		char grade = 0;

		if (score>100 || score<0) {
			System.out.println("잘못 입력 했습니다.");
			grade = 'F';
			return; //main()
		}
		if (score>=90)
			grade = 'A';
		else if (score>=80)
			grade = 'B';
		else if (score>=70)
			grade = 'C';
		else if (score>=60)
			grade = 'D';


		System.out.printf("당신의 점수 : %d\n등급",grade);
		System.out.println("프로그램 종료");

	}
}



// 			내 답		
//			System.out.print("점수 입력(0-100) :");
//			int score = new Scanner(System.in).nextInt();
//			if (score>100 || score<0) {
//				System.out.println("잘못 입력 했습니다.");
////				return; //main()을 끝낸다.
//				System.exit(0);} // 프로그램을 종료한다.
//			else if (score>=90)
//				System.out.println("A등급");
//			else if (score>=80)
//				System.out.println("B등급");
//			else if (score>=70)
//				System.out.println("C등급");
//			else if (score>=60)
//				System.out.println("D등급");
//			else
//				System.out.println("F등급");




