package myobj.statics;

public class Expressbus {

	int reserved_seat;
	int empty_seat;
	int ticket_price;
	int driving_hours;
	String destination;

	final static int VIPSEAT;
	final static int TRUNK_SIZE;

	static {
		VIPSEAT = 24;
		TRUNK_SIZE = 50;
	}

	public Expressbus(String destination, int driving_hours, int reserved, int carrier) {
		this.reserved_seat += reserved;
		this.empty_seat = VIPSEAT - reserved_seat;
		this.ticket_price = 8450 * driving_hours;
		this.destination = destination;
	}

	public void situation() {
		System.out.println("---------------------");
		System.out.printf("   %s�� ���� �¼� ��Ȳ\n", destination);
		System.out.println("---------------------");
		System.out.printf("     ���� �¼� : %d\n", VIPSEAT);
		System.out.printf("     ���� �¼� : %2d\n", reserved_seat);
		System.out.printf("      �� �¼� : %1d\n", empty_seat);
		System.out.println("---------------------");
		System.out.printf("   ���� ��� : %,d\n", ticket_price);
		System.out.println("---------------------");

	}

	public static void main(String[] args) {
		System.out.println("���� ����");
		System.out.println("�� �¼� �� : " + Expressbus.VIPSEAT);
		System.out.println("Ʈ��ũ ũ�� : " + Expressbus.TRUNK_SIZE);

		Expressbus person = new Expressbus("�λ�", 4, 1, 1);
		person.situation();

	}
}
