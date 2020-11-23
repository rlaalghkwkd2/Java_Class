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
		System.out.println("코드를 연결했습니다.");
	}

	@Override
	public void power_On() {
		System.out.println("전원이 들어왔습니다.");
	}

	@Override
	public void getUse_Battery(int min) {
		System.out.printf("집을 돌아다니며 청소합니다.\n남은 배터리 : %d"
				, this.battery - min * 2);
	}

	@Override
	public void power_Off() {
		System.out.println("전원이 껏습니다.");
	}
	
	public static void main(String[] args) {
		ElectronicsEx e = new CleanerEx();
	}
}
