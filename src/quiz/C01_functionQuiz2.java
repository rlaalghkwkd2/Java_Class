package quiz;

import java.util.Arrays;



public class C01_functionQuiz2 {
	// 1. �ּҰ��� �ִ밪�� �Ű������� ������, �� ������ ��� ���� �����ϴ�
	// int �迭�� �����Ͽ� ��ȯ�ϴ� range�Լ��� ����� ���ÿ�.
	// (�ּҰ��̻�, �ִ밪 �̸�)

	// 2. �ִ밪�� �Ű������� ���� ������, 0���� �ִ밪 �̸���
	// ��� ���� �����ϴ� range2 �Լ��� ����� ���ÿ�.

	// 3. ���ڿ� �迭�� ���� ������, �ش� �迭�� ��� "/" �� �ٿ�
	// �̾���̴� join�Լ��� ����� ���ÿ�
	// ex : {"apple","banana","orange"}
	// -> "apple/banana/orange"

	// 4. ���ڿ� Ÿ���� ����( num), ���� ����(base_from),
	// �ٲٷ��� ����(basde_to)�� ���޹����� base_from�� �����̾���
	// num�� base_to ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ��� ����� ���ÿ�.
	// �� ����, ������ �߸��� ��� null�� ��ȯ�Ѵ�.
	// �� ��ȯ�� �� �ִ� �ִ� ������ 36�����̰�, �ּ� ������ 2�Դϴ�.
//	public static void convert_base(String num, int base_from, int base_to) {
//
//		// "10" -> 10���� -> 2���� 1010�� ��ȯ
//		// ������ �߸��� ��� null�� ��ȯ
//		// ���� 0 = 48 ���� 9 = 57
//
//		// char �迭�� ��ȯ
//		char[] char_arr = num.toCharArray();
//
//		// int �迭�� ��ȯ
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
//		// int�� ��ȯ �Ϸ�!
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
//		System.out.println("���� ���� : "+num);
//
//		// ���� �����
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
//		System.out.println(base_from+"������ "+ base_to+"�������� : "+sumresult);
//		}
//		int[] it = new num[100];
//		for (int i = 0; i < it.length; i++) {
//			it[i]=10%2;
//		}
//		
//		
//		
////10�������� �ٲٴ� ���
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
		// # �Լ��� �����ε�
		//  - ���� �Լ� �̸����� �پ��� ������ �Լ��� ������ �� �ִ�.
		//  - �ٸ� ������ �Լ��� �����ޱ� ���ؼ��� 
		//    �Ű������� ���� Ȥ�� Ÿ���� �޶�� �Ѵ�.
		// ex : range(35,55);
		// 		range(55);
		
		// println�� �پ��� �Ű����� Ÿ���� ���� �� �ֵ��� �����ε� �Ǿ��ִ�.
		
		System.out.println(123);
		System.out.println("123");
		System.out.println('a');
		System.out.println(123.123);
		
		
		
		// 1��
		System.out.println("1. (�ּҰ�, �ִ밪)�� �Է� �Ͻÿ�.");
		System.out.println(Arrays.toString(range(5, 12)));
		System.out.println("---------------------");
		// 2��
		System.out.println("2. �ִ밪�� �Է� �Ͻÿ�.");
		System.out.println(Arrays.toString(range2(6)));
		System.out.println("---------------------");
		// 3��
		System.out.println("3. ���ڿ� Ÿ���� �Է� �Ͻÿ�.");
		String[] arr = { "apple", "banana", "orange" };
		System.out.println(join(arr));
		System.out.println("---------------------");
		
		// 4��
//		System.out.println("4. ���� ��ȯ��");
//		System.out.println("(���ڿ� Ÿ���� ����, ���� ����, ��ȯ�� ������ �Է� �Ͻÿ�.");
//		System.out.println("---------------------");
//		System.out.println("��ȯ �� : "+convert_base("10", 2, 10));

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

	// 4. ���ڿ� Ÿ���� ����(num), ���� ����(base_from),
	// �ٲٷ��� ����(basde_to)�� ���޹����� base_from�� �����̾���
	// num�� base_to ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ��� ����� ���ÿ�.
	// �� ����, ������ �߸��� ��� null�� ��ȯ�Ѵ�.
	// �� ��ȯ�� �� �ִ� �ִ� ������ 36�����̰�, �ּ� ������ 2�Դϴ�.
	
	static char [] digits = "0123456789ABCDEFGHIJKLMNOPQTSTUVWXYZ".toCharArray();   // ���ڿ��� ���ڹ迭�� �ٲٴ� �۾�

	public static char getSymbol(int value) {										// ���ڹ迭�� ��ġ�� �´� �ε����� �־� ��ġ�� �´� ���ڸ� ��ȯ
		return digits[value];
	}
	
	public static int getValue(char digit) {										// �� ���ڿ� �´� ���ڷ� ��ȯ���ִ� �Լ�
		
		for (int i = 0; i < digits.length; i++) {
			if(digits[i] == digit)
				return i;
		}
		return -1;
	} 

	public static String convert_base(String num, int base_from, int base_to) {	
		num = num.toUpperCase();													// ���ڿ��� �빮�ڷ� ����
		if(base_from<2||base_from>36||base_to<2||base_to > 36) {					// ���� ��Ȳ�� ������ ǥ��
			System.err.println("��밡���� ������ 2���� 36�Դϴ�.");
			return null;
		}																			// ���� pow���� �ϴµ� 1, 2, 3������ �ƴ϶�  
		int pow = num.length()-1;													// 0, 1, 2�����̱� ������ -1
		long real_value = 0;														// ���� ��ȯ ��
		
		for (int i = pow; i >-1; i--) {												// 1�� �ڸ�, 10�� �ڸ�, 100�� �ڸ� ����
			char digit = num.charAt(pow-i);
			int value = getValue(digit);
			
			// 8�����ε� 8�̻��� ���ڰ� ������ ����
			if(value >= base_from) {
				System.err.println("base_from �̻��� ���� ���� ���ڰ� �ֽ��ϴ�.");
				return null;
			}
			
			System.out.println(digit);
			System.out.println("������ : "+value);
			
			System.out.println("\t"+(int)Math.pow(base_from, i)+"�� �ڸ�");
			
			real_value += value * Math.pow(base_from,i);
		}
		System.out.println(base_from+"���� ���ڿ� \"" + num + "\"�� ���� ������ " 
		+ real_value + "�Դϴ�. ");
		StringBuilder result = new StringBuilder();
		
		// 123456�� 10���� 123456���� ��ȯ �ϴ� ���
		
		while(real_value>0) {
			result.append(getSymbol((int)(real_value % base_to)));
			real_value /= base_to;
		}
		
		return "��ȯ�� : "+result.reverse().toString();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
