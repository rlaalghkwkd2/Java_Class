package quiz;

public class C01_functionQuiz {

	// # ���� �Լ��� �����غ��ÿ�
	// 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	// 2. ������ ���ڰ� 3�� ����� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	// 3. ���ڸ� �� �� �����ϸ� ���ڿ�"¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	// 4. ������ ���ڰ� �Ҽ����� �ƴ��� �Ǻ����ִ� �Լ� (boolean)
	// 5. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	// factorial : (n)*(n-1)*(n-2)...3*2*1
	// 6. ���� �ΰ�(a,b)�� �����ϸ� a�� b������ ��ȯ�ϴ� �Լ�
	// (0������ 1�� ��ȯ�ؾ���, Math.pow����)

	// 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean checkEng(char ch) {
		return (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'a');
	}

	// 2. ������ ���ڰ� 3�� ����� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean checkMul3(int i) {
		return i % 3 == 0;
	}

	// 3. ���ڸ� �� �� �����ϸ� ���ڿ�"¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	public static String checkEvenOdd(int ev) {
		return ev % 2 == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
	}

	// 4. ������ ���ڰ� �Ҽ����� �ƴ��� �Ǻ����ִ� �Լ� (boolean)

	public static boolean prime(int prime) {
		// �ؼ�
		if (prime == 1) {
			return false;
		}
		double sqrt = Math.sqrt(prime);
		for (int i = 2; i <= sqrt; i++) {
			if (prime % i == 0)
				return false;
		}
		return true;
//		boolean result = false;
//		int count = 0;
//		for (int i = 1; i <= prime ; i++) {
//			if(prime%i==0)
//				count++;
//		}
//		if(count==2)
//			result = true;
//		
//		return result;
	}

	// 5. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	// factorial : (n)*(n-1)*(n-2)...3*2*1
	public static int factorial(int fact) {
		int result = 1;
		for (int i = fact; i > 0; i--) {
			result *= i;
		}
		return result;
	}

	// �ű��� ��� ��� �Լ� : �ڱ� �ڽ��� �θ��� �Լ�
	public static int recursive_factorial(int num) {
		if (num == 1)
			return 1;
		return num * recursive_factorial(num - 1);
	}
	// 5*(5-1)*(4-1)*(3-1)*(2-1)=1
	//5*4*3*2*1
	

	public static int recursive_pow(int a, int b) {
		if(b==0)
			return 1;
		return a*recursive_pow(a,b-1);
	}
	//(2,3)
	//2*(2,2)
	//2*2*(2,1)
	//2*2*2*(2,0)=1
	
	// 6. ���� �ΰ�(a,b)�� �����ϸ� a�� b������ ��ȯ�ϴ� �Լ�
	// (0������ 1�� ��ȯ�ؾ���, Math.pow����)
	public static int pow(int a, int b) {
		int result = 1;
		if (b == 0) {
			return result;
		}
		for (int i = 1; i <= b; i++) {
			result *= a;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(recursive_pow(3, 2));
		System.out.println("-------");
		
		
		
		// 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		char user1_1 = 'a';
		char user1_2 = '1';
		System.out.println(checkEng(user1_1));
		System.out.println(checkEng(user1_2));

		System.out.println("-------");
		// 2. ������ ���ڰ� 3�� ����� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		int user2_1 = 3;
		int user2_2 = 5;
		System.out.println(checkMul3(user2_1));
		System.out.println(checkMul3(user2_2));

		System.out.println("-------");
		// 3. ���ڸ� �� �� �����ϸ� ���ڿ�"¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
		int user3_1 = 2;
		int user3_2 = 5;
		System.out.println(checkEvenOdd(user3_1));
		System.out.println(checkEvenOdd(user3_2));

		System.out.println("-------");
		// 4. ������ ���ڰ� �Ҽ����� �ƴ��� �Ǻ����ִ� �Լ� (boolean)
		int user4_1 = 4;
		int user4_2 = 7;
		System.out.println(prime(user4_1));
		System.out.println(prime(user4_2));

		System.out.println("-------");
		// 5. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
		// factorial : (n)*(n-1)*(n-2)...3*2*1
		int user5_1 = 3;
		System.out.println(factorial(user5_1));

		System.out.println("-------");
		// 6. ���� �ΰ�(a,b)�� �����ϸ� a�� b������ ��ȯ�ϴ� �Լ�
		// (0������ 1�� ��ȯ�ؾ���, Math.pow����)
		int a = 2, b = 3;
		System.out.println(pow(a, b));

	}
}
