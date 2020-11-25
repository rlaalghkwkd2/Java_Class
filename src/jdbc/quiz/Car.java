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

	static String alls = "�����ٶ󸶰ųʴ����ӹ���������뵵�θ𺸼ҿ��������η繫�μ����־ƹٻ�������ȣ";
	static String normals = "�����ٶ󸶰ųʴ����ӹ���������뵵�θ𺸼ҿ��������η繫�μ�����";
	static String taxis = "�ƹٻ���";
	static String rents = "����ȣ";

	// ���� ���� ������ִ� �޼���
	static Car ran() {
		StringBuilder randomPlate = new StringBuilder();

		return new Car(String.format("%02d%s %04d", (int) (Math.random() * 99),
				alls.charAt((int) (Math.random() * alls.length())), (int) (Math.random() * 9900) + 100));

	}

	public Car(String plateNumber) {
		this.plateNumber = plateNumber;
		init();
	}

	// plateNumber ���� : 01�� 1234
	private void init() {
		int num1 = Integer.parseInt(plateNumber.substring(0, 2));
		String mid = plateNumber.substring(2, 3);

		int num2 = Integer.parseInt(plateNumber.substring(4));

//		System.out.println(num1);
//		System.out.println(mid);
//		System.out.println(num2);
		if (num1 < 1 || num1 > 99) {
			ctype = "���� ������ �Ű�";
		} else if (num1 < 70) {
			ctype = "�¿���";
		} else if (num1 < 80) {
			ctype = "������";
		} else if (num1 < 98) {
			ctype = "ȭ����";
		} else {
			ctype = "Ư����";
		}
		if (normals.contains(mid)) {
			usage = "�ڰ���";
		} else if (taxis.contains(mid)) {
			usage = "������";
		} else if (rents.contains(mid)) {
			usage = "�������";
		} else {
			usage = "�ҹ�����";
		}
	}

	public static void main(String[] args) {
		Car car1 = Car.ran();
		System.out.println(car1.plateNumber);
		System.out.println(car1.usage);
		System.out.println(car1.ctype);

	}

}
