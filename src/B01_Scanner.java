
// # import
//  - �ٸ� ��Ű���� �ִ� Ŭ������ ����ϱ� ���ؼ���
// 	 �ش� Ŭ������ import�ؾ� �Ѵ�.
//  �� �ٸ� ��Ű������ �̸� ������ �ҽ��� �����ͼ� ����� �� �ִ�.
//  �� ���� ��Ű���� �̸� ������ �ҽ��� import���� �ʾƵ� �� �� �ִ�.
import java.util.Scanner;
// import quiz.A01_printQuiz;

public class B01_Scanner {

	// # java.util.Scanner Ŭ����	
	// 	- ���α׷� �ܺηκ��� �Է��� ���� �� �ִ� ��ɵ��� ���ִ� Ŭ����
	//  - ��𿡼� �Է��� ������ �����ϰ� �پ��� ������� �Է¹��� �� �ִ�.
	//  - �ַܼκ��� �Է��� ���� ���� System.in�� �̿��Ѵ�.
	
	public static void main(String[] args) {
//		A01_printQuiz.main(null);
//		A00_Hello.main(null);
//		A01_Escape.main(null);
		
		// ���ο� ��ĳ�ʸ� ������ �� ���� sc�� ������ ��ĳ�ʸ� ��Ƴ��´�.
		// ���ο� ��ĳ�ʸ� ������ �� ��𿡼� �Է¹������� ������ �� �ִ�.
		// System.out : �ַܼ� ����ϴ� ���
		// System.in : �ֿܼ��� �Է¹޴� ���
		
		Scanner sc = new Scanner(System.in);
		
		// next()
		//  - ��ο� �����ϴ� ���� ���� �ϳ��� ������.
		//  - Ÿ���� �ٲ��� �ʴ´�. (�⺻�� String)
		// 	- ��ο� �ƹ� ���� ���ٸ� �Է��� �ɶ����� ��ٸ���.
		
		// nextŸ��()
		//  - ��ο� �����ϴ� ���� �������� �ش� Ÿ������ �о�´�.
		// 	- ��ο� �ƹ� ���� ���ٸ� �Է��� �ɶ����� ��ٸ���.
		//	- ��ο� �����ϴ� ���� ���� �ش� Ÿ���� �� �� ���ٸ� ������ �߻��Ѵ�.
		
		// nextLine()
		//  - ��ο� �����ϴ� ���� �� �� ���� �����´�.
		//  - �� ���� �����ϴ� ������ '/n'�̴�.
		System.out.print("�ƹ� ���̳� �Է��غ����� > ");
		int num = sc.nextInt();
		
		System.out.println("�Է� ���� �� : "+ num);
		System.out.println(num + 10); 
		System.out.println(num * 10);
		System.out.println(num / 10);
		System.out.println(num / 10.0);
		System.out.println(Math.pow(num, 2));
		
		int num2 = sc.nextInt();
		System.out.println("�ι� ° �� : "+ num2);
		
		// sc�� �ٽ� ������� ���� �����̱� ������ ���� �������� �ʴ� ���
		// int num = new Scanner(System.in).nextInt();
	}
}
