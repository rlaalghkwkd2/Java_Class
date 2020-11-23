package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C01_BlackJack {

	// 랜덤 카드 뽑아주는 함수
	public static int random_Card() {
		Random ran = new Random();
		int[][] deck = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 65, 66, 67, 68 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 65, 66, 67, 68 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 65, 66, 67, 68 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 65, 66, 67, 68 } };

		int result = 0;
		for (int i = 0; i < deck.length; i++) { // 카드 섞기
			for (int j = 0; j < 100; j++) {
				int random_index = ran.nextInt(deck[i].length);
				int temp = deck[i][0];
				deck[i][0] = deck[i][random_index];
				deck[i][random_index] = temp;
			}
		}
		for (int i = 0; i < 1; i++) {
			result = deck[i][i];
		}
		return result;
	}

	// 패 받기 배열, 가진 카드 수
	public static void start_Card(int[] user) {
		for (int i = 0; i < 2; i++) {
			user[i] = random_Card();
		}
	}

	// 패 받기 배열, 가진 카드 수
	public static void ing_Card(int[] user, int gamenum) {
		for (int i = gamenum - 1; i < gamenum; i++) {
			user[i] = random_Card();
		}
	}

	// 있는 값만 출력

	public static StringBuilder show(int[] user, int gamenum) {
		StringBuilder str = new StringBuilder();
		str.append("[ ");
		for (int i = 0; i < gamenum; i++) {
			if (user[i] > 0) {
				str.append(user[i] + ", ");
			} else {
				break;
			}
		}
		str.append(" ]");
		return str;
	}

	// 가진 패의 합
	public static int sum_Card(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 66 && num[i] <= 68) {
				sum += 10;
			} 
			else if(num[i]==65){
				sum+=11;
			}
			else {
				sum += num[i];
			}
		}
		return sum;
	}
	
	// 승패 
	public static String win(int play1, int play2) {
		
		if (play1 > play2||play1==21||!(play1<21)) {
			System.out.println("\t\t\t play1 승리!!");
		} else if (play1 < play2||play2==21||!(play2<21)) {
			System.out.println("\t\t\t play2 승리!!");
		} 
		else {
		}
		
		return "승리	";
	}
	

	public static void main(String[] args) {

		// 다음과 같은 문자열이 있을 때,
		// 문자열이 랜덤 순서로 섞은 후 출력해보시오. ---

		// 1~9 는 숫자 ---
		// A = 11, B : J = 10, C : Q = 10, D : K = 10 ---

		// 문자열의 순서를 뒤섞고, 순서대로 뽑는 방식을 추천
		// random_Card() ---
		// # 블랙잭을 만들어 보시오.

		// * 게임 순서
		// 1. 딜러(컴퓨터)가 카드를 뽑는다. random_Card
		// (컴퓨터는 뽑은 카드 합이 16이하일때 무조건 뽑고, 17이상이면 무조건 멈춘다)
		// 2. 사용자는 카드를 더 뽑을지 멈출지 결정한다.
		// 3. 사용자가 멈추면 승패를 출력해준다.
		// 4. 사용자가 카드를 더 뽑았을 때 합이 21이 넘으면 패배
		// 컴퓨터보다 합이 높거나 정확하게 21이라면 승리
		// 컴퓨터보다 합이 낮거나 21이 넘으면 패배

		// ※ 처음에는 두장을 뽑는다.
		// ※ A는 1이 될 수도 있고 11이 될 수도 있다.
		// ※ J, Q, K는 10에 해당한다.
		// ※ 각 카드는 문양별로 한장씩 존재한다.

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int[] com_Card = new int[21];
		int[] user_Card = new int[21];

		int[][] play = { com_Card = new int[21], user_Card = new int[21] };

		// 입력 부분

		full: while (true) {
			int game_com = 0;
			int game_user = 0;

			int tmp = 999;
			// 첫 스타트
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < play.length; j++) {
					start_Card(play[j]);
					game_com += 2;
					game_user++;
					if (j == 0) {
						tmp = play[j][1];
						play[j][1] = 999;
						System.out.println("<<컴퓨터>>");
						System.out.println(show(play[j], game_com));
						System.out.println("카드 합 : " + (sum_Card(play[j]) - 999));
					} else {
						System.out.println("\n<<사용자>>");
						System.out.println(show(play[j], game_com));
						System.out.println("카드 합 : " + sum_Card(play[j]));
					}

				}
			}

			while (true) {
				System.out.print("\n선택 하시오.\n" 
						+ "------------------\n" 
						+ "hit : 1, stand : 2 \n"
						+ "------------------\n" + ">> ");
				int cho = sc.nextInt();

				if (cho == 1) {
					game_user++;
					ing_Card(play[1], game_user);
					System.out.println("\n<<사용자>>");
					// System.out.println(Arrays.toString(user_Card));
					System.out.println(show(play[1], game_user));
					System.out.println("카드 합 : " + sum_Card(play[1]));
					if (sum_Card(play[1]) > 21) {
						System.out.println("\t\t\t컴퓨터 승리!!");
						play[0][1] = tmp;
						System.out.println("\n<<컴퓨터>>");
						System.out.println(show(play[0], game_com));
						System.out.println("카드 합 : " + (sum_Card(play[0])));
						break full;
					} else if (sum_Card(play[1]) == 21) {
						if(sum_Card(play[0])==21){
							play[0][1] = tmp;
							System.out.println("\n<<컴퓨터>>");
							System.out.println(show(play[0], game_com));
							System.out.println("카드 합 : " + (sum_Card(play[0])));
							System.out.println("\t\t\t비겼습니다");
							break full;
						}
						else {
							System.out.println("\t\t\t사용자 승리!!");
							break full;
						}
					}
				}
				else if (cho == 2) {
					play[0][1] = tmp;
					System.out.println("\n<<컴퓨터>>");
					System.out.println(show(play[0], game_com));
					System.out.println("카드 합 : " + (sum_Card(play[0])));
					if (sum_Card(play[0]) <= 16) {
						for (int i = 0; true; i++) {
							game_com++;
							ing_Card(play[0], game_com);
							System.out.println("\n<<컴퓨터>>");
							System.out.println(show(play[0], game_com));
							System.out.println("카드 합 : " + (sum_Card(play[0])));
							if (sum_Card(play[0]) == 21) {
								System.out.println("\t\t\t컴퓨터 승리!!");
								break full;
							} else if (sum_Card(play[0]) > 21) {
								System.out.println("\t\t\t사용자 승리!!");
								break full;
							}
						}

					} else {
						if (sum_Card(play[0]) > sum_Card(play[1])) {
							System.out.println("\t\t\t컴퓨터 승리!!");
							break full;
						} else if (sum_Card(play[0]) < sum_Card(play[1])) {
							System.out.println("\t\t\t사용자 승리!!");
							break full;
						} else {
							System.out.println("\t\t\t비겼습니다");
							break full;
						}

					}

				}
			}



		}

	}
}
