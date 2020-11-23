
public class B00_operator01 {
	public static void main(String[] args) {
		// ������ (operator)
		//  - ����� �� ����ϴ� ��

		// # ��� ������
		int a = 10, b = 3;
		double c = 7.0;

		System.out.printf("a = %d, b = %d �� ��\n",a,b);

		// �� ������ �켱 ������ ��Ģ ������ �켱������ ������.
		System.out.println("+ : " + (a + b)); 
		System.out.println("- : " + (a - b));
		System.out.println("x : " + a * b);

		// �� �������� ������ �� ���´�.
		System.out.println("���� : " + a / b);
		// �� ������ �Ǽ��� ������ ��Ȯ�� ����� �Ѵ�.
		System.out.println("�Ǽ� : " + a / c);
		System.out.println("�Ǽ��� ��ȯ : " + a / (double)b);
		System.out.println("% : " + (a % b)); // ������

		System.out.println("�� �� : " 			+ Math.pow(a, b)); 	
		System.out.println("������ : " 		+ Math.sqrt(2));
		System.out.println("���밪 : " 		+ Math.abs(-20));
		System.out.println("�ݿø� : " 		+ Math.round(1.534));
		System.out.println("�� �� : " 			+ Math.ceil(1.001));
		System.out.println("�� �� : "			+ Math.floor(1.999));
		System.out.println("�� ū ���� : "  	+ Math.max(a,b));
		System.out.println("�� ���� ���� : " 	+ Math.min(a,b));
		
		System.out.println("��Ʈ����(XOR) : " + (a ^ b)); 
		// 10 : 1010
		// 7  : 0111 ^  (XOR)
		//   ----------
		// 13 :	1101 (���� �ٸ��� 1)

	}
}
