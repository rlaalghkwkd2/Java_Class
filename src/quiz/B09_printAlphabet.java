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





		// �ؼ�
		// 1. �ݺ����� �̿��Ͽ� A���� Z���� ����غ��ÿ�.
		//		for (char ch = start; ch <= end; ch++) {
		//			System.out.print(ch+" ");
		//		}
		//
		//		System.out.println();
		//
		//		// 2. �ݺ����� �̿��Ͽ� z���� a���� ����غ��ÿ�.
		//		for (char ch = 'z'; ch >= 'a'; ch--) {
		//			System.out.print(ch+" ");
		//		}


		// �� ��
		//		// 1. �ݺ����� �̿��Ͽ� A���� Z���� ����غ��ÿ�.
		//		for (int i = 'A'; i <= 'Z'; i++) {
		//			System.out.print((char)i+" ");
		//			if 
		//		}
		//
		//		System.out.println();
		//
		//		// 2. �ݺ����� �̿��Ͽ� z���� a���� ����غ��ÿ�.
		//		for (int i = 'z'; i >= 'a'; i--) {
		//			System.out.print((char)i+" ");
		//		}








	}
}
