
public class B07_operator03 {
	public static void main(String[] args) {
		/*
		 * # ���׿�����(���ǿ�����)
		 *  - ������ if���� ���ٷ� ǥ���� �� �ִ�.
		 *  - ���� ? �� : �ƴϿ�;
		 *    
		 */
		
		// ex : �ʿ��� ��� ���� ���� ����ϱ�
		int apple = 32;
		int size = 10;
		
		int needs = apple%10 ==0 ? apple / size : apple / size +1;
		System.out.printf("�ʿ��� ������ ��� %d�� �Դϴ�.\n",needs);
	
		// ex : ���ڰ� Ȧ������ ¦������ �����ϴ� ������
		String msg = apple % 2 ==0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		System.out.printf("���� ����� ������ %s\n",msg);
	
	}
}