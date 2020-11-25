package jdbc.quiz;

public class Car {

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public static String getAlls() {
		return alls;
	}

	public static void setAlls(String alls) {
		Car.alls = alls;
	}

	public static String getNormals() {
		return normals;
	}

	public static void setNormals(String normals) {
		Car.normals = normals;
	}

	public static String getTaxis() {
		return taxis;
	}

	public static void setTaxis(String taxis) {
		Car.taxis = taxis;
	}

	public static String getRents() {
		return rents;
	}

	public static void setRents(String rents) {
		Car.rents = rents;
	}

	private String plateNumber;
	private String usage;
	private String ctype;

	static String alls = "가나다라마거너더러머버서어저고노도로모보소오조구누두루무부수우주아바사자허하호";
	static String normals = "가나다라마거너더러머버서어저고노도로모보소오조구누두루무부수우주";
	static String taxis = "아바사자";
	static String rents = "허하호";

	// 랜덤 차를 만들어주는 메서드
	static Car ran() {
		StringBuilder randomPlate = new StringBuilder();

		return new Car(String.format("%02d%s %04d", (int) (Math.random() * 99),
				alls.charAt((int) (Math.random() * alls.length())), (int) (Math.random() * 9900) + 100));

	}

	public Car(String plateNumber) {
		this.plateNumber = plateNumber;
		init();
	}

	// plateNumber 예시 : 01가 1234
	private void init() {
		int num1 = Integer.parseInt(plateNumber.substring(0, 2));
		String mid = plateNumber.substring(2, 3);

		int num2 = Integer.parseInt(plateNumber.substring(4));

//		System.out.println(num1);
//		System.out.println(mid);
//		System.out.println(num2);
		if (num1 < 1 || num1 > 99) {
			ctype = "당장 경찰에 신고";
		} else if (num1 < 70) {
			ctype = "승용자";
		} else if (num1 < 80) {
			ctype = "승합차";
		} else if (num1 < 98) {
			ctype = "화물차";
		} else {
			ctype = "특수차";
		}
		if (normals.contains(mid)) {
			usage = "자가용";
		} else if (taxis.contains(mid)) {
			usage = "영업용";
		} else if (rents.contains(mid)) {
			usage = "대어사업용";
		} else {
			usage = "불법차량";
		}
	}

	public static void main(String[] args) {
		Car car1 = Car.ran();
		System.out.println(car1.plateNumber);
		System.out.println(car1.usage);
		System.out.println(car1.ctype);

	}

}
