
public class A01_Escape {
	
	public static void main(String[] args) {
		
		// # Escape ����
		// - Ư���� ����� ���� ����
		// - �׳� ����Ϸ��� �ϸ� ������ ����� ���ڵ�
		// - �տ� \(��������)�� ���� ���ڴ� Escape ���ڷ� �����Ѵ�.
		// - �� ���ڰ� ���ļ� �ϳ��� ���ڷ� �νĵȴ�.
		
		// \n : �ٹٲ��� ����� ���� Ư�� ���� (linebreak, linefeed, newline..)
		System.out.println("�ȳ��ϼ���!\n�ݰ����ϴ�.");
		
		
		// \t : Tab Ű�� ����� ���� Ư�� ����
		System.out.println("�ȳ��ϼ���!\t�ݰ����ϴ�.");
		System.out.println("�̸�\t������\t�ֱ���������");
		System.out.println("ȫ�浿\tA��\tNo");
		System.out.println("�Ӳ���\tO��\tYes");
		
		// \\ : �׳� �������ø� ����ϰ� ���� �� ����Ѵ�.
		// ex> C:\program Files\Java\jdk�� ����ϰ� ���� ���.
		System.out.println("C:\\program Files\\Java\\jdk");
		
		//*���� 	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//		Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		//		at A01_Escape.main(A01_Escape.java:24)
		
		// \" : �׳� ū����ǥ�� ����ϰ� ���� �� ����Ѵ�.
		// ex> ������ "����"���� �Դ´�.
		System.out.println("������ \"����\"���� �Դ´�.");
		
		// /' : �׳� ��������ǥ�� ����ϰ� ���� �� ����Ѵ�.
		System.out.println("��ħ�� \'���\'�ϰ� �Ծ�ֶ�.");
		System.out.println("��ħ�� '���'�ϰ� �Ծ�ֶ�.");
		System.out.println('\'');
		
		
		
		
		
		
		
	}
}
