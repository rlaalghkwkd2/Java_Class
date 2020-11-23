package quiz;

import java.util.Arrays;



public class C01_functionQuiz2 {
	// 1. 최소값과 최대값을 매개변수로 받으면, 그 사이의 모든 값을 포함하는
	// int 배열을 생성하여 반환하는 range함수를 만들어 보시오.
	// (최소값이상, 최대값 미만)

	// 2. 최대값을 매개변수로 전달 받으면, 0부터 최대값 미만의
	// 모든 값을 포함하는 range2 함수를 만들어 보시오.

	// 3. 문자열 배열을 전달 받으면, 해당 배열을 모두 "/" 를 붙여
	// 이어붙이는 join함수를 만들어 보시오
	// ex : {"apple","banana","orange"}
	// -> "apple/banana/orange"

	// 4. 문자열 타입의 숫자( num), 원래 진법(base_from),
	// 바꾸려는 진법(basde_to)를 전달받으면 base_from의 진법이었던
	// num을 base_to 진법의 문자열로 변환하여 반환하는 함수를 만들어 보시오.
	// ※ 만약, 진법이 잘못된 경우 null을 반환한다.
	// ※ 변환할 수 있는 최대 진법은 36진법이고, 최소 진법은 2입니다.
//	public static void convert_base(String num, int base_from, int base_to) {
//
//		// "10" -> 10진법 -> 2진법 1010를 반환
//		// 진법이 잘못된 경우 null을 반환
//		// 숫자 0 = 48 숫자 9 = 57
//
//		// char 배열로 변환
//		char[] char_arr = num.toCharArray();
//
//		// int 배열로 변환
//		int[] num_arr = new int[num.length()];
//		for (int i = 0; i < num.length(); i++) {
//			if (char_arr[i] >= '0' && char_arr[i] <= '9') {
//				num_arr[i] = char_arr[i] - '0';
//			}
//			if (char_arr[i] >= 'A' && char_arr[i] <= 'Z') {
//				num_arr[i] = char_arr[i] - 'A' + 10;
//			}
//			if (char_arr[i] >= 'a' && char_arr[i] <= 'z') {
//				num_arr[i] = char_arr[i] - 'a' + 10;
//			}
//		}
//		// int로 변환 완료!
//		int sum = 0;
//		int x = 1;
//		int[] num_Befor = new int[num_arr.length];
//		for (int i = num_arr.length - 1; i >= 0; i--) {
//			if (i < num_arr.length - 1) {
//				x *= 10;
//				num_Befor[i] = num_arr[i] * x; 
//			} else {
//				num_Befor[i] = num_arr[i];
//			}
//
//			sum += num_Befor[i];
//		}
//		System.out.println("받은 숫자 : "+num);
//
//		// 제곱 만들기
//		if(base_to==10) {
//		int nar = num_arr.length;
//		int pow = 1;
//		int[] from_num = new int[num_arr.length];
//
//		for (int i = 0; i < nar; i++) {
//			pow *= base_from;
//			from_num[i] = pow / base_from;
//		}
//
//		int[] afrom_num = new int[from_num.length];
//		
//		int l = 0;
//		for (int i = from_num.length-1 ; i >= 0; i--) {
//			if(i==0)
//				from_num[i]=1;
//			afrom_num[l] = from_num[i];
//			l++;
//		}
//
//		int sumresult = 0;
//		int[] result = new int[from_num.length];
//		for (int i = 0; i < from_num.length; i++) {
//			result[i] = num_arr[i] * afrom_num[i];
//			sumresult += result[i];
//		}
//		System.out.println(base_from+"진법을 "+ base_to+"진법으로 : "+sumresult);
//		}
//		int[] it = new num[100];
//		for (int i = 0; i < it.length; i++) {
//			it[i]=10%2;
//		}
//		
//		
//		
////10진법으로 바꾸는 계산
////			1 * 5 ^ 2 
////			2 * 5 ^ 1
////			3 * 5 ^ 0
////			
////			1 * 8 ^ 2  
////			2 * 8 ^ 1    => 83    =>
////			3 * 8 ^ 0  
////			
////			10 * 16 ^ 2
////			11 * 16 ^ 1
////			12 * 16 ^ 0
//
//	}

	public static void main(String[] args) {
		// # 함수의 오버로딩
		//  - 같은 함수 이름으로 다양한 형태의 함수를 정의할 수 있다.
		//  - 다른 형태의 함수로 인정받기 위해서는 
		//    매개변수의 개수 혹은 타입이 달라야 한다.
		// ex : range(35,55);
		// 		range(55);
		
		// println은 다양한 매개변수 타입을 받을 수 있도록 오버로딩 되어있다.
		
		System.out.println(123);
		System.out.println("123");
		System.out.println('a');
		System.out.println(123.123);
		
		
		
		// 1번
		System.out.println("1. (최소값, 최대값)을 입력 하시오.");
		System.out.println(Arrays.toString(range(5, 12)));
		System.out.println("---------------------");
		// 2번
		System.out.println("2. 최대값을 입력 하시오.");
		System.out.println(Arrays.toString(range2(6)));
		System.out.println("---------------------");
		// 3번
		System.out.println("3. 문자열 타입을 입력 하시오.");
		String[] arr = { "apple", "banana", "orange" };
		System.out.println(join(arr));
		System.out.println("---------------------");
		
		// 4번
//		System.out.println("4. 진법 변환기");
//		System.out.println("(문자열 타입의 숫자, 원래 진법, 변환할 진법을 입력 하시오.");
//		System.out.println("---------------------");
//		System.out.println("변환 후 : "+convert_base("10", 2, 10));

			System.out.println("=====================================");
	      System.out.println(convert_base("123", 8, 10));      
	  	System.out.println("=====================================");
	}

	// 1.
	public static int[] range(int a, int b) {
		int max = 0, min = 0;
		max = a > b ? a : b;
		min = a < b ? a : b;
		int[] arr = new int[max - min];
		for (int i = min; i < max; i++) {
			arr[i - min] = i;
		}
		return arr;
	}

	// 2.
	public static int[] range2(int max) {
		int[] arr = new int[max];
		for (int i = 0; i < max; i++) {
			arr[i] = i;
		}
		return arr;
	}

	// 3.
	public static String join(String[] arr) {
		StringBuilder str_b = new StringBuilder();
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str_b.append(arr[i]);
			if (i < arr.length - 1) {
				str_b.append("/");
			}
		}
		str = str_b.toString();
		return str;
	}

	// 4. 문자열 타입의 숫자(num), 원래 진법(base_from),
	// 바꾸려는 진법(basde_to)를 전달받으면 base_from의 진법이었던
	// num을 base_to 진법의 문자열로 변환하여 반환하는 함수를 만들어 보시오.
	// ※ 만약, 진법이 잘못된 경우 null을 반환한다.
	// ※ 변환할 수 있는 최대 진법은 36진법이고, 최소 진법은 2입니다.
	
	static char [] digits = "0123456789ABCDEFGHIJKLMNOPQTSTUVWXYZ".toCharArray();   // 문자열을 문자배열로 바꾸는 작업

	public static char getSymbol(int value) {										// 문자배열의 위치에 맞는 인덱스를 넣어 위치에 맞는 문자를 반환
		return digits[value];
	}
	
	public static int getValue(char digit) {										// 그 문자에 맞는 숫자로 반환해주는 함수
		
		for (int i = 0; i < digits.length; i++) {
			if(digits[i] == digit)
				return i;
		}
		return -1;
	} 

	public static String convert_base(String num, int base_from, int base_to) {	
		num = num.toUpperCase();													// 문자열을 대문자로 변경
		if(base_from<2||base_from>36||base_to<2||base_to > 36) {					// 예외 상황을 에러로 표시
			System.err.println("사용가능한 진법은 2부터 36입니다.");
			return null;
		}																			// 값을 pow제곱 하는데 1, 2, 3제곱이 아니라  
		int pow = num.length()-1;													// 0, 1, 2제곱이기 때문에 -1
		long real_value = 0;														// 최종 변환 값
		
		for (int i = pow; i >-1; i--) {												// 1의 자리, 10의 자리, 100의 자리 구분
			char digit = num.charAt(pow-i);
			int value = getValue(digit);
			
			// 8진법인데 8이상의 숫자가 있으면 에러
			if(value >= base_from) {
				System.err.println("base_from 이상의 값을 지닌 문자가 있습니다.");
				return null;
			}
			
			System.out.println(digit);
			System.out.println("실제값 : "+value);
			
			System.out.println("\t"+(int)Math.pow(base_from, i)+"의 자리");
			
			real_value += value * Math.pow(base_from,i);
		}
		System.out.println(base_from+"진법 문자열 \"" + num + "\"의 값은 실제로 " 
		+ real_value + "입니다. ");
		StringBuilder result = new StringBuilder();
		
		// 123456을 10진수 123456으로 변환 하는 방법
		
		while(real_value>0) {
			result.append(getSymbol((int)(real_value % base_to)));
			real_value /= base_to;
		}
		
		return "반환값 : "+result.reverse().toString();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
