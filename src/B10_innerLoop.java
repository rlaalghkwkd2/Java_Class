
public class B10_innerLoop {
	public static void main(String[] args) {
		// # �ݺ��� ��	�ο� �ݺ��� ����ϱ�
		for (int i = 0; i < 10; i++) {
			System.out.printf("=====================�ٱ� �ݺ��� %d\n",i);
			for (int j = 0; j < 5; j++) {
				System.out.printf("--------------���� �ݺ��� %d-%d\n",i,j);
				for (int k = 0; k < 2; k++) {
					System.out.printf("+++++���� ���� �ݺ��� %d-%d-%d\n",i,j,k);
				}
			}
		}
		
		// # ���� �ݺ������� ������ ����ϱ�
		//  - 2�� - 9��
		//  - �� �ܸ��� x1 - x9
		for (int i = 2; i < 10; i++) {
			System.out.printf("----- %d�� -----\n",i);
			System.out.println();
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
	}

}
