package myobj.machine;

public class Phone implements ElectronicsEx {
	int battery;
	int consumption;

	@Override
	public int getPower_Consumption() {
		return this.consumption = 50;
	}

	@Override
	public String getEnergy_Grade(int consumption) {
		return ElectronicsEx.super.getEnergy_Grade(consumption);
	}

	@Override
	public void plug() {
		System.out.println("�ڵ带 �����߽��ϴ�.");
	}

	@Override
	public void power_On() {
		System.out.println("������ ���Խ��ϴ�.");
	}

	@Override
	public void getUse_Battery(int min) {
		System.out.printf("���� ���ƴٴϸ� û���մϴ�.\n���� ���͸� : %d"
				, this.battery - min * 2);
	}

	@Override
	public void power_Off() {
		System.out.println("������ �����ϴ�.");
	}
	
	public static void main(String[] args) {
		ElectronicsEx e = new CleanerEx();
	}
}
