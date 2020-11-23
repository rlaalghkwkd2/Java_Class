package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {

	public static void main(String[] args) {

		// # 31게임을 만들어보시오
		// 1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택한다. (1,2,3)

		// 2. 컴퓨터는 랜덤으로 숫자를 선택한다.

		// 3. 마지막에 31을 부르는 사람 혹은 컴퓨터가 패배한다.

		// 진행 예 :

		// 컴퓨터 > 2
		// 현재 숫자 : 2
		// 사람 > 3
		// 현재 숫자 : 5
		// ...
		// 컴퓨터 > 3
		// 현재 숫자 : 31 이상
		// 컴퓨터의 패배 입니다.

		// 해설
		Scanner user = new Scanner(System.in);
		Random ran = new Random();

		int game_num = 0;

		boolean computer_turn = ran.nextBoolean();

		System.out.printf("<%s>의 선공입니다.\n", computer_turn ? "컴퓨터" : "사람");

		while (true) {
// 입력 부분
			
			int num;
			if (computer_turn) {
				
				//컴퓨터가 game_num을 본 후
				// 2, 6, 10, 14, 18, 22, 26, 30을 만들면 무조건 이김
				if(game_num % 4 == 0) {
					num = 2;
				}
				else if(game_num%4==3) {
					num = 3;
				}
				else if(game_num%4==1) {
					num = 1;
				}
				else
					num = ran.nextInt(3)+1;
				
//				num = ran.nextInt(3) + 1;
				System.out.println("컴퓨터 : " + num);
			} 
			else {
				System.out.print("사용자 : ");
				num = user.nextInt();
				if (num > 3 || num < 1) {
					System.out.println("1~3만 입력 해야 합니다.");
					continue;
				}
			}
// 처리 부분
			
			game_num += num;
// 출력 부분
			if (game_num >= 31) {
				System.out.println("\t  현재 상황 : " + game_num);
				break;
			}
			System.out.println("\t  현재 상황 : " + game_num);
			computer_turn = !computer_turn;
		}
		System.out.printf("<%s>의 승리!\n", computer_turn ? "사용자" : "컴퓨터");

		
		
		
		
		
		
		
		
		
		
		
//
//		int games = 31;
//		Scanner sc = new Scanner(System.in);
//		Random ran = new Random();
//		int i = 0;
//		if (i == 0)
//			System.out.println("==== 게임 시작 ====");
//		int result = 0;
//		int start = ran.nextInt(2);
//// 컴퓨터 시작
//		if (start == 0) {
//			System.out.println("<< 컴퓨터 순서 >>");
//			int com = (int) (Math.random() * 3 + 1);
//			result += com;
//			System.out.println("컴퓨터 : " + com);
//			System.out.println();
//			System.out.println("** 현재 숫자 : " + result + " **");
//			System.out.println();
//		}
//
//		while (true) {
//// 사용자 순서
//			System.out.println("<< 사용자 순서 >>");
//			System.out.print("사용자 : ");
//			int user = sc.nextInt();
//			if (user > 0 && user < 4) {
//				result += user;
//				if (result >= 31) {
//					System.out.println("패배.. 사용자 승!");
//					break;
//				}
//				System.out.println("** 현재 숫자 : " + result + " **");
//				System.out.println();
//			}
//
//// 사용자 숫자 오류 시
//			else {
//				System.out.println("'1', '2', '3' 숫자를 입력 하세요.");
//				System.out.println();
//				continue;
//			}
//			if (result >= 31) {
//				System.out.println("패배.. 컴퓨터 승!");
//				break;
//			}
//// 컴퓨터 순서
//			System.out.println("<< 컴퓨터 순서 >>");
//			int com = (int) (Math.random() * 3 + 1);
//			result += com;
//			System.out.println("컴퓨터 : " + com);
//			if (result >= 31) {
//				System.out.println("패배.. 사용자 승!");
//				break;
//			}
//			System.out.println("** 현재 숫자 : " + result + " **");
//			System.out.println();
//		}
	}
}