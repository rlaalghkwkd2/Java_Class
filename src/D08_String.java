import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class D08_String {
	public static void main(String[] args) {
		String str = "apple/ banana/orange/sagwa";

		// split : ���ڿ��� �ش� ���� �������� �߶� ���ڿ� �迭�� ��ȯ�Ѵ�.
		String[] fruits = str.split("/");
		System.out.println(Arrays.toString(fruits));

		// join : ������ ���ڸ� �̿��� ���ڿ� �迭�� ��ģ��.
		// String ��ȯ
		System.out.println(String.join(",", fruits));

		// replace : ��ġ�ϴ� ���ڿ��� ���ϴ� ���ڿ��� ��ü�� ����� ��ȯ�Ѵ�.
		// ������ ���� ����.
		str = "abc123@naver.com";
		str = str.replace("@naver.com", "@gmail.com");
		System.out.println(str);

		// replaceAll
		// - �ش� ����ǥ���İ� ��ġ�ϴ� ���ڿ���
		// ��� ���ϴ� ���ڿ��� ��ü�� ����� ��ȯ
		str = "My name is Bob. My name is Sue. My name is John";
		System.out.println(str.replaceAll("is", "was"));

		// format : ������ �̿��� ���ϴ� ���ڿ��� �����Ѵ�.
		System.out.println(String.format("%d�� %d�� %d.%d", 1, 2, 3, 1234));

		// contains : ���ڿ��� �ش� ���ڿ��� ���ԵǾ��ִ����� �˻��Ѵ�.
		System.out.println(str.contains("bob"));
		System.out.println(str.toLowerCase().contains("bob"));

		// equalsIgnoreCase() : ��ҹ��ڿ� ������� ��ġ�ϴ��� �˻��Ѵ�.
		System.out.println("Apple".equalsIgnoreCase("aPPLE"));

		// startsWith() : ���ڿ��� �ش� ���ڿ��� �����ϴ��� �˻��Ѵ�.
		str = "image-fruit-apple.jpg";
		System.out.println(str.startsWith("image"));

		System.out.println(str.endsWith(".jpg"));

		// getBytes : ���ڿ��� byteŸ�� �迭�� �����Ѵ�.
		str = "ABCDEFG";
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));

		str = "�ȳ��ϼ���";

		try {
			// ���ڿ��� �ڵ�ȭ �Ѵ�.(���ڵ�)
			byte[] utf8_bytes = str.getBytes("UTF-8");
			byte[] euc_bytes = str.getBytes("EUC-KR");
			
			System.out.println(Arrays.toString(utf8_bytes));
			System.out.println(Arrays.toString(euc_bytes));

			// �ڵ���� ���ڿ��� ��ȯ�Ѵ�.(���ڵ�)
			// - ���ڵ��� �� ����ߴ� ������� ���ڵ� �ؾ��Ѵ�.
			System.out.println(new String(utf8_bytes,"UTF-8"));
			System.out.println(new String(utf8_bytes,"EUC-KR"));
		} catch (UnsupportedEncodingException e) {
			System.err.println("�������� �ʴ� ���ڵ��Դϴ�." + e.getMessage());
		}
	
		// getChars : char[]�� ���ڿ��� ���ϴ� �κ��� ����ش�.
		str = "Hello java python c-lang!!";
		char[] buffer = new char[10];
		str.getChars(6, 10, buffer, 0);
		System.out.println(buffer);
		
		// substring : ���ڿ��� ���ϴ� �κ��� ���ڿ��� ��ȯ�Ѵ�.
		System.out.println(str.substring(10)); // behin�� ������ ������ ¥����.
		System.out.println(str.substring(11,17));
		
		// compareTo : Comparable �������̽� �޼���
		System.out.println("compare result : " + "car".compareTo("jet"));
		
		// trim : ���ڿ� �ٱ����� ������ �����Ѵ�.
		str = "    good bye    ";
		System.out.println(str.length());
		System.out.println(str.trim().length());
		
		// valueOf : �ٸ� Ÿ���� ���� ���ڿ��� ��ȯ�Ѵ�.
		// 			 (�ش� ��ü�� toString����� ��ȯ�޴´�.)
		String ott = String.valueOf(123);
		System.out.println(ott);
	
	
		// StringTokenizer
		//  - ���ڿ��� �ڸ��µ��� Ưȭ�� Ŭ����
		//  - split�� ���������� ������ �� �ִ�.
		str = "99/88/77/66/55/44/33/22/11";
		
		// ¥�� �� ����ߴ� ���ڿ��� �ʿ��ϴٸ� �� ��° �Ķ���͸� true�� Ȱ��ȭ
		StringTokenizer st = new StringTokenizer(str,"/");
		st = new StringTokenizer(str,"/",true);
		
		System.out.println("��ū ���� : " + st.countTokens());
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());	
		}
		
		// Tokens�� StringŸ������ ��ȯ�ȴ�.
		// Elements�� ObjectŸ������ ��ȯ�ȴ�.
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
			
		}
		
		// String ������
		new String();
	
	
	}
}