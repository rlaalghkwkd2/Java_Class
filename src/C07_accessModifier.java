
import myobj.C07_diffPackage;

public class C07_accessModifier extends C07_diffPackage{
//	// (���� �ʿ��� �ٽ� ����)
//	// # ���� ���� (include)
//	//  - ����� ���� �ش� Ŭ������ �����ϴ� ��
//	//  - ���� ���� ���յ��� ���Ѵ�.
//	
//	// # ���� ���� (dependency)
//	//  - �ϳ��� Ŭ������ �ٸ� Ŭ������ ����ϴ� ��

	// # ���� ������(Access Modifier)
	// - �ٸ� Ŭ������ �ش� Ŭ������ �ڿ��� ����Ϸ��� �� ��
	// �ش� ��ü���� �Ÿ��� ���� ��� ���θ� �����Ѵ�.

	// # ������ �� �ִ� �Ÿ��� ����
	// - ���� Ŭ���� ������ �ٸ� �ڿ� (���� ����� �Ÿ�)
	// - ���� ��Ű�� ������ �ٸ� Ŭ����(�ڿ�) (�ι�°�� ����� �Ÿ�)
	// - �ٸ� ��Ű���� ������ ��ӹ��� �ڿ� (�ι�°�� �� �Ÿ�)
	// - �ٸ� ��Ű���� ���� (���� �� �Ÿ�)

	// # ���� �������� ����
	// - private : ���� Ŭ���� ���ο����� ����� �� �մ� �ڿ��� �ȴ�.
	// - �ƹ��͵� �� �� : default. �ٸ� ��Ű�������� ����� �� ���� �ڿ��� �ȴ�.
	// - protected : �ٸ� ��Ű������ ����� ������ �� �� �ִ� �ڿ��� �ȴ�.
	// (���� ��Ű�������� �����Ӱ� ����� �����ϴ�)
	// - public : ���� �� �Ÿ������� �����Ӱ� �� �� �ִ� �ڿ��� �ȴ�.
	// (���� ��Ű�������� �����Ӱ� ����� �����ϴ�)

	// # ��ü���⿡���� ĸ��ȭ(Encapsulation)
	//  - ���� �����ڸ� Ȱ���Ͽ� �ٸ� Ŭ�������Դ� ������ �ʿ���� �ڿ�(����/�޼���)��
	//	  �����ϴ� ���� ���Ѵ�.
	
	
	public static void main(String[] args) {

		// # ���� ��Ű�� ������ �ڿ��� private�� �����ϰ� ��� ���δ�.(visible)
		
		System.out.println(C07_samePackage.package_sInt);
		System.out.println(C07_samePackage.protected_sInt);
		System.out.println(C07_samePackage.public_sInt);

		C07_samePackage same_package_instance = new C07_samePackage();
		
		System.out.println(same_package_instance.package_int);
		System.out.println(same_package_instance.protected_int);
		System.out.println(same_package_instance.public_int);

		// # �ٸ� ��Ű���� �ڿ��� ����� ������ protected���� ���δ�.(visible)
		System.out.println(C07_diffPackage.public_sInt);
		System.out.println(C07_diffPackage.protected_sInt);
		
		C07_diffPackage diff_Package_instance = new C07_diffPackage();
		
		System.out.println(diff_Package_instance.public_int);
		System.out.println(new C07_accessModifier().protected_int);
		
		// # ��ӹ��� ��ü�� �ν��Ͻ��� protected �ڿ��� ������ �� �ִ�.
		C07_accessModifier child = new C07_accessModifier();
		
		System.out.println(child.protected_int);
		System.out.println(child.public_int);
		
	}

}
