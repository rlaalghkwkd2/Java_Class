import java.util.Arrays;

public class B13_Array {
	public static void main(String[] args) {

		// # �迭
		// - ���� Ÿ���� ������ �ѹ��� ������ �����ϴ� ���.
		// - �ε����� Ȱ���� �ش� ��°�� ���� ������ �� �ִ�.
		// (�ݺ����� �Բ� Ȱ���ϸ� �ſ� ���ϴ�)
		// - �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����.
		// - �迭�� �ʱ�ȭ�� �ڵ����� 0�� �Ǿ��ִ�.
		// (���� : 0, �Ǽ� : 0.0, boolean : false, ������ : null)

//		   String[] fruits = new String[10];
//		   System.out.println(fruits[0]);  // "null"
//		
//		   ���� 100���� ���� ����� ���
//		   int a1, a2, a3.....;

		int[] a = new int[100]; // �ε����� 0���� ù��°

		a[0] = 10;
		a[1] = 55;
		a[99] = 999999;
		// a[2] = "apple"; // ���� Ÿ�����θ� �����ϴ�.
		// a[100] = 00; // �� 100���� ������ٸ� �ε����� 99������ �ִ�.

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[3]);

		// # �迭�� �����ϴ� ���
		// 1. Ÿ��[] �迭�̸� = new Ÿ��[�迭ũ��];
		// 2. Ÿ��[] �迭�̸� = {��1, ��2, ��3, ...};
		// 3. Ÿ��[] �迭�̸� = new Ÿ��[] {��1, ��2, ��3, ...};

//		// # ���� �Լ��߿� �迭�� �䱸�ϴ� �Լ����� �ִ�.
//		String result = Arrays.toString(new int[] {1,2,3});
//		System.out.println(result);
		
//		// 2�� ������δ�
//		int[] abc = {1,2,3};
//		String result = Arrays.toString(abc);
//		System.out.println(result);

		String[] colors = { "red", "blue", "green", "yellow" };
		double[] scores = { 9.9, 8.8, 7.7, 6.6, 5.5, 4.4, 99, 
							'B', 123.123f, 3000000000L };
		boolean[] testResults = new boolean[] { true, false, 
								true, true, true, false, 
								1 > 0, 1 == 0, 1 != 1, 1 == 1 };

		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
		System.out.println(colors[3]);

		// # Arrays.toString(arr) : ���޹��� �迭�� �������� ���ڿ��� ��ȯ�Ѵ�.
		System.out.println(java.util.Arrays.toString(colors));
		System.out.println(Arrays.toString(testResults));
		String scoreStr = Arrays.toString(scores);
		System.out.println(scoreStr);

		// # �迭�� �ݺ��� Ȱ���ϱ�
		System.out.println("colors �迭�� ���� : " + colors.length);
			
		for (int index = 0; index < colors.length; index++) {
			System.out.printf("%d��° ���� : %s\n",index, colors[index]);
		}
		
		// # String�� char�� �迭�� ��ȯ�ϱ�
		String msg = "hello,world";
		char[] magArr = msg.toCharArray();
		
		for (int i = 0; i < msg.length(); i++) {
			System.out.print(magArr[i]);
		}
		
		
	}
}
