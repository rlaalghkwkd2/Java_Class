
public class B02_operator02 {
	public static void main(String[] args) {

		// # �� ����
		//  - �� ������ ����� �� �Ǵ� �����̴�.(boolean Ÿ��)
		//  - ��� ����� �񱳿����� �Բ� ������ ��� ������ ���� ����Ѵ�.

		int a = 7, b = 9;

		System.out.println("a > b  : " + (a > b));
		System.out.println("a < b  : " + (a < b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));

		// # �� ����
		//  - boolean �� �ΰ��� �ϴ� ����
		// 	- && : �� ���� ��� true�� �� true (AND)
		//  - || : �� �� �� �ϳ��� true���� true (OR)
		//  - !  : true�� false, false�� true (NOT)

		System.out.println("#### AND ####");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("#### OR ####");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("#### NOT ####");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(a<10));
		
	}
}
