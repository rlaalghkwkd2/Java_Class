package myobj.vehicle;

public class Audi {

	// ����, ����, ����
	public int wheel;
	public int condition;
	public int fuel;
	public int dfuel;
	String color;

	public Audi() {
		this.wheel = 4;
		this.condition = 1000;
	}

	public Audi(int m) {
		int result;
		this.fuel = 4991;
		dfuel = 10 * m;
		result = fuel - dfuel;
		if (result <= 0 || m > fuel / 10) {
			System.out.println(dfuel + "ml����ϱ⿣ ���ᰡ �����մϴ�.");
			return;
		}
		System.out.println(dfuel + "ml��� " + result + "ml����");
	}

	public void accident() {
		System.out.println("������ �����ϴ�..");
		this.wheel -= 1;
		this.condition -= 30;
		this.color = "ȸ��";
		System.out.printf("�� ������ �ϳ� ���������ϴ�. ���� ���� : %d\n" 
		+ "���� ���°� %d �����������ϴ�.\n" 
				+ "Ʈ��ũ ���� %s���� ���߽��ϴ�."
		,this.wheel, this.condition,
				this.color);

	}
}
