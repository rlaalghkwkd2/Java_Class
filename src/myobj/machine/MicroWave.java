package myobj.machine;

public class MicroWave implements Electronics{
	
	ElectricSource src;
	
	String name;
	int power;
	
	public MicroWave(String name, int power) {
		this.name = name;
		this.power = power;
	}
	public void setConnect(ElectricSource src) {
		this.src = src;
	}

	@Override
	public String execute() {
		
		if(src == null) {
			System.out.println("���� ����� ������ �����ϴ�.");
			return null;
		}
		cook();
		cook();
		cook();
		cook();
		cook();
		
		return "5�� �丮��";
	}
	
	private void cook() {
		// microwave�� �丮�Ҷ����� ����� ���¿��� ������ �Һ���
		src.consum(power);
	}

}