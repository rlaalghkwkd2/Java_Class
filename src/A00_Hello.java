// 	ctrl + [+,-] : ���� ũ�� ����
// 	ctrl + M : ���� â ũ�� �ִ�/�ּ�ȭ
// 	ctrl + z : ��� ���� ����ϱ� �ڷΰ���
// 	ctrl + y : ��� ����� �� ����ϱ� ������
//  ctrl + / : �巹�� �ּ� ó��
//	Sysout ���� �� Ctrl + Space : �ڵ� �ϼ�
//  Alt  + ����Ű : ���̵� ����
//  ctrl + shift + w : ��� â �ݱ�
//  ctrl + Shift + o : �ڵ� import
//  ctrl + Shift + f : ��ü ��� ���� 

// # ��� ���� ���� ����Ű
// 	ctrl + a : ��ü �巹��
// 	shift + ����Ű : ����Ű�� �̿��� �������
// 	shift + Home/end : Ŀ�� ��ġ ���� ���� �� ��, �� �ڱ��� ��� ����

// 	tap : �鿩����
// 	shift + tab : �Ųٷ� �鿩����

// # �ּ� (Comment)
// - ���α׷��Ӱ� �ϰ� ���� ���� �޸��صδ� ��.
// - �ּ��� ���α׷� ���࿡ ������ ��ġ�� �ʴ´�.

// ���� �ּ�

/* ������ �ּ� */

/**
 ����ȭ �ּ�(��Ŭ������ �� ������ �о��ش�.)
 */

// public class�� �̸��� �ݵ�� ���ϸ�� ���ƾ� �Ѵ�.
public class A00_Hello {
	// ���� ���� ������ �� �װ��� Ŀ���� �ΰ� F2�� ������
	// �ش� ������ ���� ������ �ذ�å�� �� �� �ִ�.

	// # main()�Լ�
	// - ���α׷��� ���� ����
	// - ���α׷��� �����ϸ� ���� ���� main()�Լ��� ã�Ƽ� �����Ų��.
	// - main()�Լ��� ������ �߰�ȣ�� �����ȴ�.
	public static void main(String[] args) {
		// ���α׷��� ���� ����

		// # System.out.println()�Լ�
		// - ()�ȿ� ������ �����͸� �ֿܼ� ����ϴ� �Լ�

		// # �Լ���?
		// - � �ܾ� �ڿ� ()�� �پ� �ִ� ���� ��� �Լ���.

		// # �ܼ��̶�?
		// - Eclipse������ �׽�Ʈ������ ���h ������ �ܼ��� �����ϴ� �� ���̴�.
		// - ������ �츮�� �ۼ��� ���α׷��� ���� ȭ�鿡�� �����ϸ� ���� ȭ�鿡 ��µȴ�.

		System.out.println("Hello, world!"); //Ctrl + F11
		System.out.println("Apple");
		System.out.println("Melon");
		System.out.println();

		System.out.println("����������������������������������������������������������");
		System.out.println();
		System.out.println("	1. Start Game");
		System.out.println("	2. Exit");
		System.out.println();
		System.out.println("����������������������������������������������������������");
		System.out.println();

		// # �ڹ��� �����͵�

		// 1. "" ���̿� ���� �� : ���ڿ� (string)
		System.out.println("ABCDEFG�����ٶ󸶹ٻ�");
		System.out.println("�ȳ��ϼ���~~~!\n");
		System.out.println();

		// 2. �׳� ���� : ���� (int, Integer)
		System.out.println(123);
		System.out.println(123456);
		System.out.println(123+2);
		System.out.println(123*2);
		System.out.println();

		// 3. �Ҽ� : �Ǽ�(Double, Float)
		System.out.println(123.1234567); //�Ⱥ��̸� double
		System.out.println(123.123456f); //f�� ���̸� float
		System.out.println();

		// 4. ''���̿� ���� �� : ���� (Character), ���� �� �ϳ�
		// �� ���� ����ǥ���� ���ڸ� ������ ������ ������ �߻��Ѵ�.
		System.out.println('o');
		System.out.println('X');
		System.out.println('ʫ');
		System.out.println('��');
		System.out.println('��');
		System.out.println();

		// # ���ڰ� ������ ������ �ִ� ���ڰ� ����
		System.out.println("ʫ�� �ڵ尪 : " + (int)'ʫ');
		System.out.println("$�� �ڵ尪 : " + (int)'$');
		System.out.println("���� �ڵ尪 : " + (int)'��');
		System.out.println();

		// # �ڵ尪���� ���� ��� �ϱ�
		System.out.println("23478�� ���ڰ� : " + (char)23478);
		System.out.println("36�� ���ڰ� : " + (char)36);
		System.out.println("44032�� ���ڰ� : " + (char)44032);
		System.out.println();

		// �شٸ� Ÿ�� + ������ �����ϴ�.
		// 1. ���ڿ� + ������ �̾���� ���ڿ��� �ȴ�.
		System.out.println("123" + 456);
		System.out.println("���ڿ� : " + 456);
		System.out.println();

		// 2. �Ǽ� + ������ �Ǽ��� �ȴ�.
		System.out.println(1236.56 + 30);
		System.out.println();

		//3. ���� + ������ ???
		System.out.println('��'+90);
		System.out.println();

		// ; (�����ݷ�) : �� ��ɾ �������� �˸���.


		// ���α׷��� ��
	}

}



















