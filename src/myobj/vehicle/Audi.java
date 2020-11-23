package myobj.vehicle;

public class Audi {

	// 상태, 색깔, 바퀴
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
			System.out.println(dfuel + "ml사용하기엔 연료가 부족합니다.");
			return;
		}
		System.out.println(dfuel + "ml사용 " + result + "ml남음");
	}

	public void accident() {
		System.out.println("교통사고가 났습니다..");
		this.wheel -= 1;
		this.condition -= 30;
		this.color = "회색";
		System.out.printf("차 바퀴가 하나 떨어졌습니다. 남은 바퀴 : %d\n" 
		+ "차의 상태가 %d 안좋아졌습니다.\n" 
				+ "트렁크 색이 %s으로 변했습니다."
		,this.wheel, this.condition,
				this.color);

	}
}
