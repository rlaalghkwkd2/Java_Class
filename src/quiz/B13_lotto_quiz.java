package quiz;

import java.util.Random;

public class B13_lotto_quiz {
	public static void main(String[] args) {

		// 1���� 45������ �ߺ����� ���� ���� 6���� �̷���� �迭�� �����غ��ÿ�.
		// �� �ߺ��� ������ �ٽ� �̱�
		// �� �̾Ҵ� ���ڴ� ����صα�
		// �� 1 ~ 45�� ���ڸ� �������� ���� �� ������� 6�� �̱�

		// �ؼ�  �� 1 ~ 45�� ���ڸ� �������� ���� �� ������� 6�� �̱�
		
		// �ؼ�  �� �̾Ҵ� ���ڴ� ����صα�
		
		int[] lotto = new int [6];
		Random ran = new Random();
		int[] number = new int[45];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = i+1;   // 1~45
		}
		
		for (int i = 0; i < 5000; i++) { // ī�� ����
			int random_index = ran.nextInt(44)+1;
			int temp = number[0];
				number[0] = number[random_index];
				number[random_index] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(i+"��° ��÷ ��ȣ : "+number[i]);
		}
		
		
//		int i = 0;
//		while(i!=6) {
//			int random_index = ran.nextInt(45);
//			if(number[random_index] != -1) {
//			lotto[i] = number[random_index];
//			number[random_index] = -1;
//			++i;
//			}
//		}
//		System.out.println(Arrays.toString(lotto));
			
		
		
		//�� �ߺ��� ������ �ٽ� �̱�
//		int i = 0;
//		while (i != 6) {
//			boolean duple = false;
//			lotto[i] = (int)(Math.random() * 45 + 1);
//			
//			// 3���� �̾��� �� 0, 1, 2�� �񱳸� �ؼ�
//			// �Ȱ��� ���� �ִٸ� i�� ���� ��Ű�� �ʴ´�.
//			
//			for (int j = 0; j < i; j++) {
//				if(lotto[i]==lotto[j]) {
//					duple = true;
//					break;
//				}
//			}
//			if(!duple) {
//				i++;
//			}
//		}
//		System.out.println(Arrays.toString(lotto));
		
		
		
		
		
//		int[] lotto = new int[6];
//		
//			for (int i = 0; i < 6; i++) {
//				lotto[i] = (int)(Math.random() * 45 + 1);
//			}
//			System.out.println(Arrays.toString(lotto));
		}
	}



