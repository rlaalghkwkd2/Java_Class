package myobj.fruit;

public class Grape {

	// ����, ����, �絵 
	
	public int podo;
	public int skin;
	public String color;
	
	public Grape(int num) {
		this.podo = 23;
		this.skin = 0;
		System.out.println(podo-num+"�� ����");
	}
	
	
	public Grape() {
		System.out.println("�⺻ ������");
	}
	
	
	
	
	
	public void eat(int num) {
		System.out.println("������ �Ծ����ϴ�.");
		this.podo -= num;
		if(podo==0) {
			System.out.println("���� ������ �����ϴ�.");
			return;
		}
		this.skin = num;
		System.out.printf("%d�� ����, ������ %d���� ���Խ��ϴ�."
				,this.podo, this.skin);
	}
	
	
	
	
	
	
}
