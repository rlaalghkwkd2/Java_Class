package quiz;

public class C01_functionQuiz {

	// # 다음 함수를 정의해보시오
	// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	// 2. 전달한 숫자가 3의 배수면 true를 반환, 아니면 false를 반환하는 함수
	// 3. 숫자를 한 개 전달하면 문자열"짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	// 4. 전달한 숫자가 소수인지 아닌지 판별해주는 함수 (boolean)
	// 5. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	// factorial : (n)*(n-1)*(n-2)...3*2*1
	// 6. 숫자 두개(a,b)를 전달하면 a의 b제곱을 반환하는 함수
	// (0제곱은 1을 반환해야함, Math.pow금지)

	// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean checkEng(char ch) {
		return (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'a');
	}

	// 2. 전달한 숫자가 3의 배수면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean checkMul3(int i) {
		return i % 3 == 0;
	}

	// 3. 숫자를 한 개 전달하면 문자열"짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	public static String checkEvenOdd(int ev) {
		return ev % 2 == 0 ? "짝수입니다." : "홀수입니다.";
	}

	// 4. 전달한 숫자가 소수인지 아닌지 판별해주는 함수 (boolean)

	public static boolean prime(int prime) {
		// 해설
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

	// 5. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	// factorial : (n)*(n-1)*(n-2)...3*2*1
	public static int factorial(int fact) {
		int result = 1;
		for (int i = fact; i > 0; i--) {
			result *= i;
		}
		return result;
	}

	// 신기한 방법 재귀 함수 : 자기 자신을 부르는 함수
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
	
	// 6. 숫자 두개(a,b)를 전달하면 a의 b제곱을 반환하는 함수
	// (0제곱은 1을 반환해야함, Math.pow금지)
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
		
		
		
		// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
		char user1_1 = 'a';
		char user1_2 = '1';
		System.out.println(checkEng(user1_1));
		System.out.println(checkEng(user1_2));

		System.out.println("-------");
		// 2. 전달한 숫자가 3의 배수면 true를 반환, 아니면 false를 반환하는 함수
		int user2_1 = 3;
		int user2_2 = 5;
		System.out.println(checkMul3(user2_1));
		System.out.println(checkMul3(user2_2));

		System.out.println("-------");
		// 3. 숫자를 한 개 전달하면 문자열"짝수입니다" 또는 "홀수입니다"를 반환하는 함수
		int user3_1 = 2;
		int user3_2 = 5;
		System.out.println(checkEvenOdd(user3_1));
		System.out.println(checkEvenOdd(user3_2));

		System.out.println("-------");
		// 4. 전달한 숫자가 소수인지 아닌지 판별해주는 함수 (boolean)
		int user4_1 = 4;
		int user4_2 = 7;
		System.out.println(prime(user4_1));
		System.out.println(prime(user4_2));

		System.out.println("-------");
		// 5. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
		// factorial : (n)*(n-1)*(n-2)...3*2*1
		int user5_1 = 3;
		System.out.println(factorial(user5_1));

		System.out.println("-------");
		// 6. 숫자 두개(a,b)를 전달하면 a의 b제곱을 반환하는 함수
		// (0제곱은 1을 반환해야함, Math.pow금지)
		int a = 2, b = 3;
		System.out.println(pow(a, b));

	}
}
