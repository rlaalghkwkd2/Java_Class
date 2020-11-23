import myobj.fruit.Grape;
import myobj.vehicle.Audi;

public class C03_Constructer {
	// # Ŭ������ ������ (Constructor) : new Scanner
	// - Ŭ������ �̸��� �Ȱ��� �̸��� �Լ� (new�� �Բ� ����Ѵ�)
	// - new�� �Բ� �����ڸ� ȣ���ϸ� Ŭ������ ���ǵȴ�� �ν��Ͻ��� �����Ѵ�.
	// - �����ڰ� ��� ����� �Ŀ��� ������ �ν��Ͻ��� �ּҰ� ��ȯ�ȴ�.
	// - �����ڸ� ���� �������� ������ �ƹ��͵� ���ǵ��� ����
	// �⺻ �����ڰ� �ڵ����� �����ȴ�.
	//

	// �� �⺻������ - �Ű������� ���� ������
	//
	public static void main(String[] args) {
		Orange o1 = new Orange();

		System.out.println(o1.color);
		System.out.println(o1.sweet);
		System.out.println(o1.size);

		Grape1 g1 = new Grape1(5);
	
		// �Ʊ� ������ Ŭ������ �����ڸ� 2���� �߰��غ��ÿ�.
		// * myobj.fruit, myobj.vehicle
		
		Grape gr2 = new Grape();
		Grape gr1 = new Grape(3);
		
		Audi a1 = new Audi(449);
		Audi a2 = new Audi();
	}
}


class Grape1 {
	int podo;
	int skin;
	// ���ǵ� �����ڰ� �ִٸ� �⺻ �����ڰ� �ڵ����� �������� �ʴ´�.
	public Grape1(int podo) {
		this.podo = podo;
		this.skin = 0;
	}
	
	// �ڵ����� �������� �����Ƿ�, �⺻ �����ڸ� ����ϰ� �ʹٸ� ���� �����ؾ��Ѵ�.
	public Grape1() {
		this(20); 
		// �����ڿ��� this()�� ���� �ٸ� �����ڸ� ȣ���� �� �ִ�.
		// �ٸ� �����ڴ� �ݵ�� ������ �� ���ٿ��� ȣ���ؾ� �Ѵ�.
	}

	public void eat() {
		if (podo == 0) {
			System.out.println("�� ������ �� �Ծ����ϴ�.");
			System.out.printf("���� ���� ������ %d��, ���ش� %d�� �Դϴ�.\n", podo, skin);
			return;
		}
		podo--;
		skin++;
		System.out.printf("���� ���� ������ %d��, ���ش� %d�� �Դϴ�.\n", podo, skin);
	}
}

// �����ڸ� �������� ���ٸ� ������ �⺻ �����ڰ� �����Ѵ�.
class Strawberry {
	int seed;
	String color;
}

class Orange {

	int sweet;
	int size;
	String color;

	// # �������� Ư¡
	// - ���� Ÿ���� ���� Ŭ������� ���� �̸��� ������.
	// - �ν��Ͻ� ���� �ÿ� ���� ���� ȣ��ȴ�.
	// - �ν��Ͻ��� �ַ� �ν��Ͻ� ���� ���� �ʱ�ȭ�ϴ� �뵵�� ����Ѵ�.

	// �⺻ ������ Ŭ�����̸��� �Ȱ��� �̸��� �Լ�
	public Orange() {
		// ���ÿ��� Ŭ���� ���ο��� this�� �����ص� �ʵ忡 ������ �� �ִ�.
		sweet = 10;
		size = 5;
		color = "orange";
	}

	// # �����ڵ� �Լ�ó�� ���������� �����ϴ�.
	// - �ϳ��� Ŭ������ �پ��� ������ �����ڸ� ������ ���� �� �ִ�.
	public Orange(int sweet, int size, String color) {
		// # this
		// - Ŭ���� ���ο��� ���� �ν��Ͻ��� ������ �� ����ϴ� Ű����

		// �ʵ尪�� ������������ ��ġ�� ���
		// this.�� �̿��� ����� �������� ��Ȯ�ϰ� ������ �� �ִ�.

		// �� this�� ���� ���� �ν��Ͻ� ������ �ȴ�.
		this.color = color;
		this.size = size;
		this.sweet = sweet;
	}
}