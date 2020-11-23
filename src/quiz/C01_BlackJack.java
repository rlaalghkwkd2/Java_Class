package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C01_BlackJack {

	// ���� ī�� �̾��ִ� �Լ�
	public static int random_Card() {
		Random ran = new Random();
		int[][] deck = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 65, 66, 67, 68 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 65, 66, 67, 68 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 65, 66, 67, 68 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 65, 66, 67, 68 } };

		int result = 0;
		for (int i = 0; i < deck.length; i++) { // ī�� ����
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

	// �� �ޱ� �迭, ���� ī�� ��
	public static void start_Card(int[] user) {
		for (int i = 0; i < 2; i++) {
			user[i] = random_Card();
		}
	}

	// �� �ޱ� �迭, ���� ī�� ��
	public static void ing_Card(int[] user, int gamenum) {
		for (int i = gamenum - 1; i < gamenum; i++) {
			user[i] = random_Card();
		}
	}

	// �ִ� ���� ���

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

	// ���� ���� ��
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
	
	// ���� 
	public static String win(int play1, int play2) {
		
		if (play1 > play2||play1==21||!(play1<21)) {
			System.out.println("\t\t\t play1 �¸�!!");
		} else if (play1 < play2||play2==21||!(play2<21)) {
			System.out.println("\t\t\t play2 �¸�!!");
		} 
		else {
		}
		
		return "�¸�	";
	}
	

	public static void main(String[] args) {

		// ������ ���� ���ڿ��� ���� ��,
		// ���ڿ��� ���� ������ ���� �� ����غ��ÿ�. ---

		// 1~9 �� ���� ---
		// A = 11, B : J = 10, C : Q = 10, D : K = 10 ---

		// ���ڿ��� ������ �ڼ���, ������� �̴� ����� ��õ
		// random_Card() ---
		// # ������ ����� ���ÿ�.

		// * ���� ����
		// 1. ����(��ǻ��)�� ī�带 �̴´�. random_Card
		// (��ǻ�ʹ� ���� ī�� ���� 16�����϶� ������ �̰�, 17�̻��̸� ������ �����)
		// 2. ����ڴ� ī�带 �� ������ ������ �����Ѵ�.
		// 3. ����ڰ� ���߸� ���и� ������ش�.
		// 4. ����ڰ� ī�带 �� �̾��� �� ���� 21�� ������ �й�
		// ��ǻ�ͺ��� ���� ���ų� ��Ȯ�ϰ� 21�̶�� �¸�
		// ��ǻ�ͺ��� ���� ���ų� 21�� ������ �й�

		// �� ó������ ������ �̴´�.
		// �� A�� 1�� �� ���� �ְ� 11�� �� ���� �ִ�.
		// �� J, Q, K�� 10�� �ش��Ѵ�.
		// �� �� ī��� ���纰�� ���徿 �����Ѵ�.

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int[] com_Card = new int[21];
		int[] user_Card = new int[21];

		int[][] play = { com_Card = new int[21], user_Card = new int[21] };

		// �Է� �κ�

		full: while (true) {
			int game_com = 0;
			int game_user = 0;

			int tmp = 999;
			// ù ��ŸƮ
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < play.length; j++) {
					start_Card(play[j]);
					game_com += 2;
					game_user++;
					if (j == 0) {
						tmp = play[j][1];
						play[j][1] = 999;
						System.out.println("<<��ǻ��>>");
						System.out.println(show(play[j], game_com));
						System.out.println("ī�� �� : " + (sum_Card(play[j]) - 999));
					} else {
						System.out.println("\n<<�����>>");
						System.out.println(show(play[j], game_com));
						System.out.println("ī�� �� : " + sum_Card(play[j]));
					}

				}
			}

			while (true) {
				System.out.print("\n���� �Ͻÿ�.\n" 
						+ "------------------\n" 
						+ "hit : 1, stand : 2 \n"
						+ "------------------\n" + ">> ");
				int cho = sc.nextInt();

				if (cho == 1) {
					game_user++;
					ing_Card(play[1], game_user);
					System.out.println("\n<<�����>>");
					// System.out.println(Arrays.toString(user_Card));
					System.out.println(show(play[1], game_user));
					System.out.println("ī�� �� : " + sum_Card(play[1]));
					if (sum_Card(play[1]) > 21) {
						System.out.println("\t\t\t��ǻ�� �¸�!!");
						play[0][1] = tmp;
						System.out.println("\n<<��ǻ��>>");
						System.out.println(show(play[0], game_com));
						System.out.println("ī�� �� : " + (sum_Card(play[0])));
						break full;
					} else if (sum_Card(play[1]) == 21) {
						if(sum_Card(play[0])==21){
							play[0][1] = tmp;
							System.out.println("\n<<��ǻ��>>");
							System.out.println(show(play[0], game_com));
							System.out.println("ī�� �� : " + (sum_Card(play[0])));
							System.out.println("\t\t\t�����ϴ�");
							break full;
						}
						else {
							System.out.println("\t\t\t����� �¸�!!");
							break full;
						}
					}
				}
				else if (cho == 2) {
					play[0][1] = tmp;
					System.out.println("\n<<��ǻ��>>");
					System.out.println(show(play[0], game_com));
					System.out.println("ī�� �� : " + (sum_Card(play[0])));
					if (sum_Card(play[0]) <= 16) {
						for (int i = 0; true; i++) {
							game_com++;
							ing_Card(play[0], game_com);
							System.out.println("\n<<��ǻ��>>");
							System.out.println(show(play[0], game_com));
							System.out.println("ī�� �� : " + (sum_Card(play[0])));
							if (sum_Card(play[0]) == 21) {
								System.out.println("\t\t\t��ǻ�� �¸�!!");
								break full;
							} else if (sum_Card(play[0]) > 21) {
								System.out.println("\t\t\t����� �¸�!!");
								break full;
							}
						}

					} else {
						if (sum_Card(play[0]) > sum_Card(play[1])) {
							System.out.println("\t\t\t��ǻ�� �¸�!!");
							break full;
						} else if (sum_Card(play[0]) < sum_Card(play[1])) {
							System.out.println("\t\t\t����� �¸�!!");
							break full;
						} else {
							System.out.println("\t\t\t�����ϴ�");
							break full;
						}

					}

				}
			}



		}

	}
}
