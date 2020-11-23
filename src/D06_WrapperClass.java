

public class D06_WrapperClass {
	// WrapperClass
	//  - �⺻�� Ÿ�Ե��� ������ Ÿ������ ����ϰ� ������ ����Ѵ�.
	//  - �� Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�.
	//  -
	
	// �⺻�� : byte, short, char, int, long, float, double
	// ������ : Byte, Short, Character, Integer, Long, Float, Double
	
	
	public static void main(String[] args) {
		// Integer b = new Integer(10); // JDK9 ���ķ� deprecated
		// int a = 10;
		Integer a = 10;
		
		// typeValue() �ø��� : �������� ����� ���� ���ϴ� �⺻ Ÿ������ ��ȯ�Ѵ�.
		System.out.println(a.byteValue());
		System.out.println(a.doubleValue());
		System.out.println(a.floatValue());
		System.out.println(a.shortValue());
		System.out.println(a.intValue());
		
		// parseType �ø��� : ���ڿ��� ����� ���� ���ϴ� Ÿ������ ��ȯ�Ѵ�.
		String str = "10";
		System.out.println(Integer.parseInt(str));
		System.out.println(Integer.parseInt(str,16));
		System.out.println(Double.parseDouble(str));
		System.out.println(Byte.parseByte(str));
		
		// ��
		System.out.println(new Integer(10) == new Integer(10));
		System.out.println(new Integer(10).equals(new Integer(10)));
	
		
		// WrapperŬ������ toString�� ���� ���� ��ȯ�� �����ϴ�.(radix������ 10����)
		System.out.println(Integer.toString(123,10));
		System.out.println(Integer.toString(123,16).toUpperCase());
		System.out.println(Integer.toString(123,2));
		System.out.println(Integer.toString(123,8));
		
		// ���ڿ��� Boolean���� ��ȯ
		Boolean b1 = true;
		System.out.println(b1.booleanValue());
		System.out.println(b1.valueOf("true"));
	
	
		// �ش� ������ ���ڸ� charŸ������ ��ȯ���ش�.
		// ex : 36������ 35�� �ش��ϴ� ���ڸ� ��ȯ
		// ��ȯ�ϴ� ���� ���ڸ� �ΰ�츸 ��ȯ
		System.out.println(Character.forDigit(35,36));
		System.out.println(Character.forDigit(25,36));
		System.out.println(Character.forDigit(15,16));
	
	}
	
	
	
	
}
